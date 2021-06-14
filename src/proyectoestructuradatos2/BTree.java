package proyectoestructuradatos2;

public class BTree {

    BNode raiz;
    int grado;

    public BTree(int degree) {
        this.raiz = null;
        this.grado = degree;
    }

    public void traverse() {
        if (raiz != null) {
            raiz.traverse();
        }
    }

    public BNode search(int key) {
        return raiz == null ? null : raiz.search(key);
    }

    public void insert(int key) {

        if (raiz == null) {

            raiz = new BNode(grado, true);
            raiz.llaves[0] = key;
            raiz.numLlaves = 1;
        } else {

            if (raiz.numLlaves == 2 * grado - 1) {
                BNode s = new BNode(grado, false);
                s.hijos[0] = raiz;
                s.splitChild(0, raiz);
                int i = 0;
                if (s.llaves[0] < key) {
                    i++;
                }
                s.hijos[i].insertNonFull(key);

                raiz = s;
            } else {
                raiz.insertNonFull(key);
            }
        }
    }

    public void remove(int key) {
        if (raiz == null) {
            System.out.println("The tree is empty");
            return;
        }

        raiz.remove(key);

        if (raiz.numLlaves == 0) {
            if (raiz.hoja) {
                raiz = null;
            } else {
                raiz = raiz.hijos[0];
            }
        }
    }
}
