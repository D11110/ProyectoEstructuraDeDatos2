package proyectoestructuradatos2;

/**
 *
 * @author Diaz
 */
public class BTree {

    static int orden;
    BNode root;

    public BTree(int orden) {
        this.orden = orden;
        root = new BNode(orden, null);
    }

    //METODO QUE BUSCA UN VALOR DENTRO DEL ARBOL
    public BNode search(BNode root, int llave) {
        int i = 0;

        while (i < root.cantLlaves && llave > root.llave[i]) {
            i++;
        }

        if (i <= root.cantLlaves && llave == root.llave[i]) {    //verifica si la llave está en el nodo
            return root;        //devolver el nodo donde se encontró la llave
        }

        if (root.hoja) {         //si es hoja entonces no hay nada más que buscar
            return null;
        } else {                 //si no es hoja, le mandamos el hijo
            return search(root.obtenerHijo(i), llave);
        }
    }

    public void insertar(BTree T , int k) {
        root = T.root;
        if (root.cantLlaves == (orden)-1-1) {
            BNode s = new BNode(orden, root);
            s.hoja=false;
            s.cantLlaves =0;
            s.hijo[1] = root;
            T.split(s,root,1);
            insertNonfull(s, k);
        } else {
            insertNonfull(root, k);
        }
    }

    public void split(BNode x, BNode y, int i) {
        BNode z = new BNode(y.cantLlaves, y.padre);
        z.hoja = y.hoja;
        z.cantLlaves = orden - 1;

        for (int j = 0; j < orden - 1; j++) {
            z.llave[j] = y.llave[j + orden];
        }

        if (y.hoja == false) {
            for (int j = 0; j < orden; j++) {
                z.hijo[j] = y.hijo[j + orden];
            }
        }
        y.cantLlaves = orden - 1;

        for (int j = x.cantLlaves + 1; j < i + 1; j--) {
            x.hijo[j + 1] = x.hijo[j];
        }

        x.hijo[i + 1] = z;
        for (int j = x.cantLlaves; j < i; j--) {
            x.llave[j + 1] = x.llave[j];
        }

        x.llave[i] = y.llave[orden];
//        y.llave[orden-1] =0;
        x.cantLlaves = x.cantLlaves + 1;

    }

    public void insertNonfull(BNode x, int k) {
        int i = x.cantLlaves;
        if (x.hoja) {
            while(i>=1 && k < x.llave[i]){
                x.llave[i+1] = x.llave[i];
                i--;
            }
            x.llave[i+1] = k;
            x.cantLlaves = x.cantLlaves+1;
        }else{
            while (i>=1 && k < x.llave[i]) {
                i--;
            }
            i++;
            if (x.hijo[i].cantLlaves == 2*(orden)-1) {
                split(x, x.hijo[i], i);
                if (k > x.llave[i]) {
                    i++;
                }
            }
            insertNonfull(x.hijo[i], k);
        }
    }

    //METODO QUE IMPRIME EL ARBOL DANDOLE COMO NODO LA RAIZ o CUALQUIER NODO
    public void imprimirNodo(BNode n) {
        for (int i = 0; i < n.cantLlaves; i++) {
            System.out.print(n.obtenerValor(i) + " ");
        }
        if (!n.hoja) {                                   //si el nodo no es una hoja
            for (int j = 0; j <= n.cantLlaves; j++) {
                if (n.obtenerHijo(j) != null) {
                    System.out.println();
                    imprimirNodo(n.obtenerHijo(j));     //imrpime sus hijos
                }
            }
        }
    }

}
