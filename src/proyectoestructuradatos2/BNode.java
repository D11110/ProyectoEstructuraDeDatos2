package proyectoestructuradatos2;


public class BNode {

    Llave[] llaves; // claves de nodo
    int gradoMinimo; // El grado mínimo del nodo B-tree
    BNode[] hijos; // nodos secundarios
    int numLlaves; // El número de claves de nodos
    boolean hoja; // Verdadero cuando es un nodo hoja

    public BNode(int grado, boolean esHoja) {

        this.gradoMinimo = grado;
        this.hoja = esHoja;
        this.llaves = new Llave[2 * this.gradoMinimo - 1];
        for (int i = 0; i < llaves.length; i++) {
            llaves[i] = new Llave();
        }
        this.hijos = new BNode[2 * this.gradoMinimo];
        this.numLlaves = 0;
    }

    public void insertNonFull(int k, int byteOff, int length) {

        int i = numLlaves - 1;

        if (hoja) {
            while (i >= 0 && llaves[i].getIndice() > k) {
                llaves[i + 1].indice = llaves[i].getIndice();
                llaves[i + 1].byteOff = llaves[i].getByteOff();
                llaves[i + 1].length = llaves[i].getLength();
                i--;
            }
            llaves[i + 1].indice = k;
            llaves[i + 1].byteOff = byteOff;
            llaves[i + 1].length = length;

            numLlaves = numLlaves + 1;
        } else {
            while (i >= 0 && llaves[i].getIndice() > k) {
                i--;
            }
            if (hijos[i + 1].numLlaves == 2 * gradoMinimo - 1) {
                splitChild(i + 1, hijos[i + 1]);
                if (llaves[i + 1].getIndice() < k) {
                    i++;
                }
            }
            hijos[i + 1].insertNonFull(k, byteOff, length);
        }
    }


    public void splitChild(int i, BNode y) {

        BNode z = new BNode(y.gradoMinimo, y.hoja);
        z.numLlaves = gradoMinimo - 1;

        for (int j = 0; j < gradoMinimo - 1; j++) {
            z.llaves[j].indice = y.llaves[j + gradoMinimo].getIndice();
            z.llaves[j].byteOff = y.llaves[j + gradoMinimo].getByteOff();
            z.llaves[j].length = y.llaves[j + gradoMinimo].getLength();
        }
        if (!y.hoja) {
            for (int j = 0; j < gradoMinimo; j++) {
                z.hijos[j] = y.hijos[j + gradoMinimo];
            }
        }
        y.numLlaves = gradoMinimo - 1;

        for (int j = numLlaves; j >= i + 1; j--) {
            hijos[j + 1] = hijos[j];
        }
        hijos[i + 1] = z;

        for (int j = numLlaves - 1; j >= i; j--) {
            llaves[j + 1].indice = llaves[j].getIndice();
            llaves[j + 1].byteOff = llaves[j].getByteOff();
            llaves[j + 1].length = llaves[j].getLength();
        }
        llaves[i].indice = y.llaves[gradoMinimo - 1].getIndice();
        llaves[i].byteOff = y.llaves[gradoMinimo - 1].getByteOff();
        llaves[i].length = y.llaves[gradoMinimo - 1].getLength();
        
        numLlaves = numLlaves + 1;
    }

    public void traverse() {
        int i;
        for (i = 0; i < numLlaves; i++) {
            if (!hoja) {
                hijos[i].traverse();
            }
            System.out.printf(" %d", llaves[i].getIndice());
        }

        if (!hoja) {
            hijos[i].traverse();
        }
    }

    public void traverse2() {
        int i;
        for (i = 0; i < numLlaves; i++) {
            if (!hoja) {
                hijos[i].traverse2();
            }
            System.out.print(llaves[i].getIndice() + "-" + llaves[i].getByteOff() + "-" + llaves[i].getLength() + " ");
        }

        if (!hoja) {
            hijos[i].traverse2();
        }
    }

    public Llave search(int key) {
        int i = 0;
        while (i < numLlaves && key > llaves[i].getIndice()) {
            i++;
        }

        if (llaves[i].getIndice() == key) {
            return llaves[i];
        }
        if (hoja) {
            return null;
        }
        return hijos[i].search(key);
    }

    public int buscarKey(int key) {
        int i = 0;
        while (i < numLlaves && llaves[i].getIndice() < key) {
            ++i;
        }
        return i;
    }

    public void remove(int k) {

        int i = buscarKey(k);
        if (i < numLlaves && llaves[i].getIndice() == k) {
            if (hoja) {
                removeEnHoja(i);
            } else {
                removeNonHoja(i);
            }
        } else {
            if (hoja) {

                return;
            }

            boolean flag = i == numLlaves;

            if (hijos[i].numLlaves < gradoMinimo) {
                llenar(i);
            }
            if (flag && i > numLlaves) {
                hijos[i - 1].remove(k);
            } else {
                hijos[i].remove(k);
            }
        }
    }

    public void removeEnHoja(int i) {

        for (int j = i + 1; j < numLlaves; ++j) {
            llaves[j - 1].indice = llaves[j].getIndice();
            llaves[j - 1].byteOff = llaves[j].getByteOff();
            llaves[j - 1].length = llaves[j].getLength();
        }
        numLlaves--;
    }

    public void removeNonHoja(int i) {

        int k = llaves[i].getIndice();

        if (hijos[i].numLlaves >= gradoMinimo) {
            Llave pred = getPredecesor(i);
            llaves[i].indice = pred.getIndice();
            llaves[i].byteOff = pred.getByteOff();
            llaves[i].length = pred.getLength();
            hijos[i].remove(pred.getIndice());
        } else if (hijos[i + 1].numLlaves >= gradoMinimo) {
            Llave succ = getSucesor(i);
            llaves[i].indice = succ.getIndice();
            llaves[i].byteOff = succ.getByteOff();
            llaves[i].length = succ.getLength();
            hijos[i + 1].remove(succ.getIndice());
        } else {
            merge(i);
            hijos[i].remove(k);
        }
    }

    public Llave getPredecesor(int i) {
        BNode cur = hijos[i];
        while (!cur.hoja) {
            cur = cur.hijos[cur.numLlaves];
        }
        return cur.llaves[cur.numLlaves - 1];
    }

    public Llave getSucesor(int i) {
        BNode cur = hijos[i + 1];
        while (!cur.hoja) {
            cur = cur.hijos[0];
        }
        return cur.llaves[0];
    }

    public void llenar(int i) {
        if (i != 0 && hijos[i - 1].numLlaves >= gradoMinimo) {
            borrowFromPrev(i);
        } else if (i != numLlaves && hijos[i + 1].numLlaves >= gradoMinimo) {
            borrowFromNext(i);
        } else {
            if (i != numLlaves) {
                merge(i);
            } else {
                merge(i - 1);
            }
        }
    }

    public void borrowFromPrev(int i) {

        BNode child = hijos[i];
        BNode sibling = hijos[i - 1];

        for (int j = child.numLlaves - 1; j >= 0; --j) {
            child.llaves[j + 1].indice = child.llaves[j].getIndice();
            child.llaves[j + 1].length = child.llaves[j].getLength();
            child.llaves[j + 1].byteOff = child.llaves[j].getByteOff();
        }

        if (!child.hoja) {
            for (int j = child.numLlaves; j >= 0; --j) {
                child.hijos[j + 1] = child.hijos[j];
            }
        }

        child.llaves[0].indice = llaves[i - 1].getIndice();
        child.llaves[0].byteOff = llaves[i - 1].getByteOff();
        child.llaves[0].length = llaves[i - 1].getLength();
        if (!child.hoja) {
            child.hijos[0] = sibling.hijos[sibling.numLlaves];
        }

        llaves[i - 1].indice = sibling.llaves[sibling.numLlaves - 1].getIndice();
        llaves[i - 1].byteOff = sibling.llaves[sibling.numLlaves - 1].getByteOff();
        llaves[i - 1].length = sibling.llaves[sibling.numLlaves - 1].getLength();
        child.numLlaves += 1;
        sibling.numLlaves -= 1;
    }

    public void borrowFromNext(int i) {

        BNode child = hijos[i];
        BNode sibling = hijos[i + 1];

        child.llaves[child.numLlaves].indice = llaves[i].getIndice();
        child.llaves[child.numLlaves].byteOff = llaves[i].getByteOff();
        child.llaves[child.numLlaves].length = llaves[i].getLength();

        if (!child.hoja) {
            child.hijos[child.numLlaves + 1] = sibling.hijos[0];
        }

        llaves[i].indice = sibling.llaves[0].getIndice();
        llaves[i].byteOff = sibling.llaves[0].getByteOff();
        llaves[i].length = sibling.llaves[0].getLength();

        for (int j = 1; j < sibling.numLlaves; ++j) {
            sibling.llaves[j - 1].indice = sibling.llaves[j].getIndice();
            sibling.llaves[j - 1].byteOff = sibling.llaves[j].getByteOff();
            sibling.llaves[j - 1].length = sibling.llaves[j].getLength();
        }

        if (!sibling.hoja) {
            for (int k = 1; k <= sibling.numLlaves; ++k) {
                sibling.hijos[k - 1] = sibling.hijos[k];
            }
        }
        child.numLlaves += 1;
        sibling.numLlaves -= 1;
    }

    public void merge(int i) {

        BNode hijo = hijos[i];
        BNode hermano = hijos[i + 1];

        hijo.llaves[gradoMinimo - 1].indice = llaves[i].getIndice();

        for (int j = 0; j < hermano.numLlaves; ++j) {
            hijo.llaves[j + gradoMinimo].indice = hermano.llaves[j].getIndice();
            hijo.llaves[j + gradoMinimo].byteOff = hermano.llaves[j].getByteOff();
            hijo.llaves[j + gradoMinimo].length = hermano.llaves[j].getLength();
        }

        if (!hijo.hoja) {
            for (int j = 0; j <= hermano.numLlaves; ++j) {
                hijo.hijos[j + gradoMinimo] = hermano.hijos[j];
            }
        }

        for (int j = i + 1; j < numLlaves; ++j) {
            llaves[j - 1].indice = llaves[j].getIndice();
            llaves[j - 1].byteOff = llaves[j].getByteOff();
            llaves[j - 1].length = llaves[j].getLength();
        }
        for (int j = i + 2; j <= numLlaves; ++j) {
            hijos[j - 1] = hijos[j];
        }

        hijo.numLlaves += hermano.numLlaves + 1;
        numLlaves--;
    }
}
