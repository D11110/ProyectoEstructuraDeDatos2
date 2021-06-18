package proyectoestructuradatos2;

/**
 *
 * @author Diaz
 */
public class DLLNode {

    int byteOff;                    //byte offset del registro
    int tamaño;                     //tamaño del registro
    DLLNode prev;
    DLLNode next;
    
    DLLNode() {
        this.byteOff = -1;
        this.tamaño = -1;
    }
    
    DLLNode(int byteOff, int tamaño) {
        this.byteOff = byteOff;
        this.tamaño = tamaño;
    }
}
