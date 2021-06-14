package proyectoestructuradatos2;

public class BTree {

    BNode raiz;
    int degreeMinimo;

    public BTree(int degree) {
        this.raiz = null;
        this.degreeMinimo = degree;
    }

    public void imprimirOrdenAscendente() {
        if (raiz != null) {
            raiz.transversal();
        }
    }

    public BNode search(int key) {
        return raiz == null ? null : raiz.buscar(key);
    }

    public void insert(int llaveAInsertar) {

        if (raiz == null) {

            raiz = new BNode(degreeMinimo, true);
            raiz.llaves[0] = llaveAInsertar;
            raiz.numLlaves = 1;
        } else {

            if (raiz.numLlaves == degreeMinimo - 1) { //si esta lleno
                BNode s = new BNode(degreeMinimo, false);

                s.hijos[0] = raiz;

                s.split(0, raiz);

                int i = 0;
                if (s.llaves[0] < llaveAInsertar) {
                    i++;
                }
                s.hijos[i].insertNonFull(llaveAInsertar);

                raiz = s;
            } else {
                raiz.insertNonFull(llaveAInsertar);
            }
        }
    }

    public void remove(int key) {
        if (raiz == null) {
            System.out.println("The tree is empty");
            return;
        }

        raiz.elimina(key);

        if (raiz.numLlaves == 0) { // Si el nodo raíz tiene 0 claves
            // Si tiene un nodo hijo, use su primer nodo hijo como el nuevo nodo raíz,
            // de lo contrario, establezca el nodo raíz en nulo
            if (raiz.hoja) {
                raiz = null;
            } else {
                raiz = raiz.hijos[0];
            }
        }
    }
}
