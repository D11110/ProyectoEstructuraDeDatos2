package proyectoestructuradatos2;

public class BNode {

    int[] llaves; // llaves del nodo
    int grado; // El grado del nodo
    BNode[] hijos; // nodos hijos
    int numLlaves; // El número de llaves del nodo
    boolean hoja; // Verdadero cuando el nodo es un nodo hoja

    public BNode(int deg, boolean isLeaf) {

        this.grado = deg;
        this.hoja = isLeaf;
        this.llaves = new int[2 * this.grado - 1]; // El nodo tiene como máximo 2 * teclas MinDeg-1
        this.hijos = new BNode[2 * this.grado];
        this.numLlaves = 0;
    }

    // Encuentra el primer índice de posición igual o mayor que la clave
    public int buscarLlave(int key) {

        int i = 0;
        while (i < numLlaves && llaves[i] < key) {
            ++i;
        }
        return i;
    }

    public void elimina(int k) {

        int i = buscarLlave(k);
        if (i < numLlaves && llaves[i] == k) { // Encontrar la llave
            if (hoja) // la clave está en el nodo hoja
            {
                deleteHoja(i);
            } else // la clave no está en el nodo hoja
            {
                deleteNoHoja(i);
            }
        } else {
            if (hoja) { // Si el nodo es un nodo hoja, entonces el nodo no está en el árbol B
                System.out.printf("The key %d is does not exist in the tree\n", k);
                return;
            }

            // De lo contrario, la clave que se eliminará existe en el subárbol enraizado en el nodo
            // Este indicador indica si la clave existe en el subárbol enraizado en el último nodo secundario del nodo
            // Cuando idx es igual a num, se compara todo el nodo, el indicador es verdadero
            boolean indicador = i == numLlaves;

            if (hijos[i].numLlaves < grado) // Cuando el nodo hijo de este nodo no está lleno, llénalo primero
            {
                llenar(i);
            }

            // Si el último nodo secundario se ha fusionado, entonces debe haberse fusionado con el nodo secundario anterior, por lo que recurrimos recursivamente en el nodo secundario (idx-1).
            // De lo contrario, recurrimos al nodo secundario (idx) th, que ahora tiene al menos las claves de grado mínimo
            if (indicador && i > numLlaves) {
                hijos[i - 1].elimina(k);
            } else {
                hijos[i].elimina(k);
            }
        }
    }

    public void deleteHoja(int idx) {

        // Retroceder de idx
        for (int i = idx + 1; i < numLlaves; ++i) {
            llaves[i - 1] = llaves[i];
        }
        numLlaves--;
    }

    public void deleteNoHoja(int i) {

        int llave = llaves[i];

        if (hijos[i].numLlaves >= grado) {
            int pred = getPredecesor(i);
            llaves[i] = pred;
            hijos[i].elimina(pred);
        }
        else if (hijos[i + 1].numLlaves >= grado) {
            int succ = getSucesor(i);
            llaves[i] = succ;
            hijos[i + 1].elimina(succ);
        } else {
            merge(i);
            hijos[i].elimina(llave);
        }
    }

    public int getPredecesor(int i) { 
        BNode cur = hijos[i];
        while (!cur.hoja) {
            cur = cur.hijos[cur.numLlaves];
        }
        return cur.llaves[cur.numLlaves - 1];
    }

    public int getSucesor(int idx) { 
        BNode cur = hijos[idx + 1];
        while (!cur.hoja) {
            cur = cur.hijos[0];
        }
        return cur.llaves[0];
    }

    public void llenar(int indiceALlenar) {
        if (indiceALlenar != 0 && hijos[indiceALlenar - 1].numLlaves >= grado) {
            tomarAnterior(indiceALlenar);
        }
        else if (indiceALlenar != numLlaves && hijos[indiceALlenar + 1].numLlaves >= grado) {
            tomarSiguiente(indiceALlenar);
        } else {
            if (indiceALlenar != numLlaves) {
                merge(indiceALlenar);
            } else {
                merge(indiceALlenar - 1);
            }
        }
    }

    public void tomarAnterior(int i) {

        BNode child = hijos[i];
        BNode sibling = hijos[i - 1];

        for (int j = child.numLlaves - 1; j >= 0; --j)
        {
            child.llaves[j + 1] = child.llaves[j];
        }

        if (!child.hoja) { 
            for (int j = child.numLlaves; j >= 0; --j) {
                child.hijos[j + 1] = child.hijos[j];
            }
        }

        child.llaves[0] = llaves[i - 1];
        if (!child.hoja)
        {
            child.hijos[0] = sibling.hijos[sibling.numLlaves];
        }

        llaves[i - 1] = sibling.llaves[sibling.numLlaves - 1];
        child.numLlaves += 1;
        sibling.numLlaves -= 1;
    }

    public void tomarSiguiente(int i) {

        BNode child = hijos[i];
        BNode sibling = hijos[i + 1];

        child.llaves[child.numLlaves] = llaves[i];

        if (!child.hoja) {
            child.hijos[child.numLlaves + 1] = sibling.hijos[0];
        }

        llaves[i] = sibling.llaves[0];

        for (int j = 1; j < sibling.numLlaves; ++j) {
            sibling.llaves[j - 1] = sibling.llaves[j];
        }

        if (!sibling.hoja) {
            for (int j = 1; j <= sibling.numLlaves; ++j) {
                sibling.hijos[j - 1] = sibling.hijos[j];
            }
        }
        child.numLlaves += 1;
        sibling.numLlaves -= 1;
    }


    public void merge(int idx) {

        BNode child = hijos[idx];
        BNode sibling = hijos[idx + 1];

        child.llaves[grado - 1] = llaves[idx];

        for (int i = 0; i < sibling.numLlaves; ++i) {
            child.llaves[i + grado] = sibling.llaves[i];
        }

        if (!child.hoja) {
            for (int i = 0; i <= sibling.numLlaves; ++i) {
                child.hijos[i + grado] = sibling.hijos[i];
            }
        }

        for (int i = idx + 1; i < numLlaves; ++i) {
            llaves[i - 1] = llaves[i];
        }
        for (int i = idx + 2; i <= numLlaves; ++i) {
            hijos[i - 1] = hijos[i];
        }

        child.numLlaves += sibling.numLlaves + 1;
        numLlaves--;
    }

    public void insertNonFull(int key) {

        int i = numLlaves - 1; 

        if (hoja) {
            while (i >= 0 && llaves[i] > key) {
                llaves[i + 1] = llaves[i]; 
                i--;
            }
            llaves[i + 1] = key;
            numLlaves = numLlaves + 1;
        } else {
            while (i >= 0 && llaves[i] > key) {
                i--;
            }
            if (hijos[i + 1].numLlaves == 2 * grado - 1) { 
                split(i + 1, hijos[i + 1]);
                if (llaves[i + 1] < key) {
                    i++;
                }
            }
            hijos[i + 1].insertNonFull(key);
        }
    }

    public void split(int i, BNode y) {

        BNode z = new BNode(y.grado, y.hoja);
        z.numLlaves = grado - 1;

        for (int j = 0; j < grado - 1; j++) {
            z.llaves[j] = y.llaves[j + grado];
        }
        if (!y.hoja) {
            for (int j = 0; j < grado; j++) {
                z.hijos[j] = y.hijos[j + grado];
            }
        }
        y.numLlaves = grado - 1;

        for (int j = numLlaves; j >= i + 1; j--) {
            hijos[j + 1] = hijos[j];
        }
        hijos[i + 1] = z;

        for (int j = numLlaves - 1; j >= i; j--) {
            llaves[j + 1] = llaves[j];
        }
        llaves[i] = y.llaves[grado - 1];

        numLlaves = numLlaves + 1;
    }

    public void transversal() {
        int i;
        for (i = 0; i < numLlaves; i++) {
            if (!hoja) {
                hijos[i].transversal();
            }
            System.out.printf(" %d", llaves[i]);
        }

        if (!hoja) {
            hijos[i].transversal();
        }
    }

    public BNode buscar(int key) {
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
        return hijos[i].buscar(key);
    }
}

