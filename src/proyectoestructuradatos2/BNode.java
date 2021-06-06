package proyectoestructuradatos2;

/**
 *
 * @author Diaz
 */
public class BNode {
    static int ordenArbol;
    int cantLlaves;
    int llave[];
    BNode hijo[];
    boolean hoja;
    BNode padre;
    
    public BNode(){
    }
    
    public BNode(int ordenArbol, BNode padre){
        this.ordenArbol = ordenArbol;
        this.padre = padre;
        llave = new int[ordenArbol - 1];
        hijo = new BNode[ordenArbol];
        hoja = true;
        cantLlaves = 0;
    }
    
    //retorna el valor de la llave en la posición indicada
    public int obtenerValor(int i){
        return llave[i];
    }
    
    //obtener hijos del nodo
    public BNode obtenerHijo(int i){
        return hijo[i];
    }
}
