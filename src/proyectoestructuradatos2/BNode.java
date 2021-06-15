package proyectoestructuradatos2;

import javax.swing.JOptionPane;

public class BNode {

    int[] llaves; // claves de nodo
    int gradoMinimo; // El grado mínimo del nodo B-tree
    BNode[] hijos; // nodos secundarios
    int numLlaves; // El número de claves de nodos
    boolean hoja; // Verdadero cuando es un nodo hoja

    public BNode(int grado, boolean esHoja) {

        this.gradoMinimo = grado;
        this.hoja = esHoja;
        this.llaves = new int[2 * this.gradoMinimo - 1];
        this.hijos = new BNode[2 * this.gradoMinimo];
        this.numLlaves = 0;
    }

    public void insertNonFull(int k) {

        int i = numLlaves - 1;

        if (hoja) {
            while (i >= 0 && llaves[i] > k) {
                llaves[i + 1] = llaves[i];
                i--;
            }
            llaves[i + 1] = k;
            numLlaves = numLlaves + 1;
        } else {
            while (i >= 0 && llaves[i] > k) {
                i--;
            }
            if (hijos[i + 1].numLlaves == 2 * gradoMinimo - 1) {
                splitChild(i + 1, hijos[i + 1]);
                if (llaves[i + 1] < k) {
                    i++;
                }
            }
            hijos[i + 1].insertNonFull(k);
        }
    }

    public void splitChild(int i, BNode y) {

        BNode z = new BNode(y.gradoMinimo, y.hoja);
        z.numLlaves = gradoMinimo - 1;

        for (int j = 0; j < gradoMinimo - 1; j++) {
            z.llaves[j] = y.llaves[j + gradoMinimo];
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
            llaves[j + 1] = llaves[j];
        }
        llaves[i] = y.llaves[gradoMinimo - 1];

        numLlaves = numLlaves + 1;
    }

    public void traverse() {
        int i;
        for (i = 0; i < numLlaves; i++) {
            if (!hoja) {
                hijos[i].traverse();
            }
            System.out.printf(" %d", llaves[i]);
        }

        if (!hoja) {
            hijos[i].traverse();
        }
    }

    public BNode search(int key) {
        int i = 0;
        while (i < numLlaves && key > llaves[i]) {
            i++;
        }

        if (llaves[i] == key) {
            return this;
        }
        if (hoja) {
            return null;
        }
        return hijos[i].search(key);
    }
    
    public int buscarKey(int key) {
        int i = 0;
        while (i < numLlaves && llaves[i] < key) {
            ++i;
        }
        return i;
    }

    public void remove(int k) {

        int i = buscarKey(k);
        if (i < numLlaves && llaves[i] == k) {
            if (hoja) {
                removeEnHoja(i);
            } else {
                removeNonHoja(i);
            }
        } else {
            if (hoja) {
                //System.out.printf("The key %d is does not exist in the tree\n", k);
                //JOptionPane.showMessageDialog(this, "El registro con llave "+ k +" no existe");
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
            llaves[j - 1] = llaves[j];
        }
        numLlaves--;
    }

    public void removeNonHoja(int i) {

        int k = llaves[i];

        if (hijos[i].numLlaves >= gradoMinimo) {
            int pred = getPredecesor(i);
            llaves[i] = pred;
            hijos[i].remove(pred);
        } else if (hijos[i + 1].numLlaves >= gradoMinimo) {
            int succ = getSucesor(i);
            llaves[i] = succ;
            hijos[i + 1].remove(succ);
        } else {
            merge(i);
            hijos[i].remove(k);
        }
    }

    public int getPredecesor(int i) {
        BNode cur = hijos[i];
        while (!cur.hoja) {
            cur = cur.hijos[cur.numLlaves];
        }
        return cur.llaves[cur.numLlaves - 1];
    }

    public int getSucesor(int i) {
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
            child.llaves[j + 1] = child.llaves[j];
        }

        if (!child.hoja) {
            for (int j = child.numLlaves; j >= 0; --j) {
                child.hijos[j + 1] = child.hijos[j];
            }
        }

        child.llaves[0] = llaves[i - 1];
        if (!child.hoja) {
            child.hijos[0] = sibling.hijos[sibling.numLlaves];
        }

        llaves[i - 1] = sibling.llaves[sibling.numLlaves - 1];
        child.numLlaves += 1;
        sibling.numLlaves -= 1;
    }

    public void borrowFromNext(int idx) {

        BNode child = hijos[idx];
        BNode sibling = hijos[idx + 1];

        child.llaves[child.numLlaves] = llaves[idx];

        if (!child.hoja) {
            child.hijos[child.numLlaves + 1] = sibling.hijos[0];
        }

        llaves[idx] = sibling.llaves[0];

        for (int i = 1; i < sibling.numLlaves; ++i) {
            sibling.llaves[i - 1] = sibling.llaves[i];
        }

        if (!sibling.hoja) {
            for (int i = 1; i <= sibling.numLlaves; ++i) {
                sibling.hijos[i - 1] = sibling.hijos[i];
            }
        }
        child.numLlaves += 1;
        sibling.numLlaves -= 1;
    }

    public void merge(int i) {

        BNode hijo = hijos[i];
        BNode hermano = hijos[i + 1];

        hijo.llaves[gradoMinimo - 1] = llaves[i];

        for (int j = 0; j < hermano.numLlaves; ++j) {
            hijo.llaves[j + gradoMinimo] = hermano.llaves[j];
        }

        if (!hijo.hoja) {
            for (int j = 0; j <= hermano.numLlaves; ++j) {
                hijo.hijos[j + gradoMinimo] = hermano.hijos[j];
            }
        }

        for (int j = i + 1; j < numLlaves; ++j) {
            llaves[j - 1] = llaves[j];
        }
        for (int j = i + 2; j <= numLlaves; ++j) {
            hijos[j - 1] = hijos[j];
        }

        hijo.numLlaves += hermano.numLlaves + 1;
        numLlaves--;
    }
}
