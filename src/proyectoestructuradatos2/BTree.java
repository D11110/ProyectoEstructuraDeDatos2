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

        while (i < root.cantLlaves && llave > root.llave[i]){
            i++;
        }

        if (i <= root.cantLlaves && llave == root.llave[i]){    //verifica si la llave está en el nodo
            return root;        //devolver el nodo donde se encontró la llave
        }

        if (root.hoja){         //si es hoja entonces no hay nada más que buscar
            return null;
        } else{                 //si no es hoja, le mandamos el hijo
            return search(root.obtenerHijo(i), llave);
        }
    }
    
    public void create(){
        
    }
    
    public void split(){
        
    }
    
    public void createNonful(){
        
    }
    
    //METODO QUE IMPRIME EL ARBOL DANDOLE COMO NODO LA RAIZ o CUALQUIER NODO
    public void imprimirNodo(BNode n) {
        for (int i = 0; i < n.cantLlaves; i++) {
            System.out.print(n.obtenerValor(i) + " ");
        }
            if (!n.hoja){                                   //si el nodo no es una hoja
                for (int j = 0; j <= n.cantLlaves; j++){
                    if (n.obtenerHijo(j) != null){
                        System.out.println();
                        imprimirNodo(n.obtenerHijo(j));     //imrpime sus hijos
                    }
                }
            }
    }
    
    
}
