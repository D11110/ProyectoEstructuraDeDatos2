package proyectoestructuradatos2;

import java.io.File;
import java.io.FileWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Diaz
 */
public class DoublyLinkedList {
    
    public DLLNode head;
    public DLLNode tail;
    public int length;
    
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    
    public DoublyLinkedList(DLLNode head, DLLNode tail, int length) {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    
    public int length(){
        return length;
    }
    
    public boolean isEmpty(){
        if(length==0)
            return true;
        else
            return false;
    }
    
    //METODO QUE AñADE UN NODO AL FINAL DE LA LISTA
    public void addLast(int value, int tamaño){
        DLLNode newNode = new DLLNode(value, tamaño);
        if(isEmpty()){                              //Si la lista está vacía, entonces el nodo añadido es cabeza y cola al mismo tiempo
            head = newNode;
        } else{                                     //Si no está vacía, entonces le cambiamos la corra al burro jugando con los punteros
            tail.next = newNode;
            newNode.prev = tail;
        }
        
        tail = newNode;
        length++;
    }
    
    //METODO QUE ELIMINA EL úLTIMO NODO DE LA LISTA
    public void removeLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        } else if(length==1){
            head = null;
            tail = null;
            length--;
        } else{
            DLLNode temp = tail;
            tail.prev.next = null;                  //se anula la cola
            tail = tail.prev;                       //se asigna la nueva cola
            temp.prev = null;
            length--;
        }
    }
    
    //METODO QUE ELIMINA EL NODO QUE QUE TENGA ESE VALOR Y TAMAñO (SEA INTERMEDIO CABEZA O COLA)
    public void removeNode(int value, int tamaño){
        DLLNode del = searchNode(value, tamaño);
        if (head == null || del == null) {              //si la lista está vacía entonces no se puede hacer nada
            throw new NoSuchElementException();
        } else{
            if(del!=null){
                if (head.byteOff == del.byteOff) {                          //Si el nodo a eliminar es cabeza
                    head = del.next;                        //entonces la nueva cabeza es el que le sigue a la cabeza
                    //System.out.println("halo");

                }

                if (del.next != null) {                     //si el nodo a eliminar no es el último nodo
                    del.next.prev = del.prev;               //entonces la cabeza es igual a null
                }

                if (del.prev != null) {                     //si el noodo a eliminar no es la cabeza
                    del.prev.next = del.next;               //entonces enlazamos los dos nodos que están enmedio del nodo intermedio q se está eliminando
                }
                length--;
            } else
                System.out.println("Esa llave no existe");
        }
    }
    
    //METODO QUE BUSCA EL NODO QUE QUE TENGA ESE VALOR Y TAMAñO Y LO DEVUELVE
    public DLLNode searchNode(int value, int tamaño){
        if(head!=null && tail!=null){
            DLLNode temp = head;
            while(temp.byteOff!=value && temp.tamaño!=tamaño){
                temp = temp.next;
                if(temp==null)
                    break;
            }
            if (temp!=null)                             //se encontró el nodo
                return temp;
            else                                        //no se encontró
                return null;
        } else
            return null;
    }
    
    public void sort(){
        DLLNode temp = head;
        int[] bytes = new int[length];
        int[] lenghts = new int[length];
        int i=0;
        while(temp.next!=null || temp==tail){           //voy a recorrer toda la lista desde cabeza hasta cola
            bytes[i] = temp.byteOff;                    //entonces almaceno eso en un arary
            lenghts[i] = temp.tamaño;
            i++;
            temp = temp.next;
            if(temp==null)                              //acá es cuando se topa con el tail.next que obv es null
                break;
        }
        
//        for (i = 0; i < bytes.length; i++) {
//            System.out.println(bytes[i] + " "+lenghts[i]);
//        }

        //BUBBLE SORT CON RESPECTO A LOS LENGTHS DE MENOR A MAYOR
        int n = lenghts.length;
        for (i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (lenghts[j] > lenghts[j+1]){
                    //aca viene el swap lengths[j+1] y lengths[j]
                    int temporal = lenghts[j];
                    lenghts[j] = lenghts[j+1];
                    lenghts[j+1] = temporal;
                    
                    //igual los bytes tienen que rearrange para que queden con su respectivo length
                    int temporal2 = bytes[j];
                    bytes[j] = bytes[j+1];
                    bytes[j+1] = temporal2;
                }
            }
        }
        
//        for (i = 0; i < bytes.length; i++) {
//            System.out.println(bytes[i] + " "+lenghts[i]);
//        }
        
        //elimino completamente la lista
        for (i = 0; i <= length+1; i++) {
            removeLast();
        }
        //la vuelvo a construir ya ordenada
        for (i = 0; i < bytes.length; i++) {
            addLast(bytes[i], lenghts[i]);
        }
        System.out.println(toString());
    }
    
    public String readAvail(String nombreArchivo) {
        Scanner s = null;
        String linea="";
        File fichero = new File(nombreArchivo);
        
        try {
            s = new Scanner(fichero);
            
            while (s.hasNextLine()) {
                linea = s.nextLine();
                System.out.println(linea);
            }
            
        } catch (Exception ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
        
        return linea;
    }
    
    public void construirAvail(String nombreArchivo, DoublyLinkedList availList) {
        Scanner s = null;
        String linea="";
        File fichero = new File(nombreArchivo);
        
        try {
            s = new Scanner(fichero);
            
            while (s.hasNextLine()) {
                linea = s.nextLine();
                System.out.println(linea);
            }
            
        } catch (Exception ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
        
        String temp1[] = linea.split("#");
        for (int i = 0; i < temp1.length; i++) {
            String temp2[] = temp1[i].split("#");
            availList.addLast(Integer.parseInt(temp2[0]), Integer.parseInt(temp2[1]));
        }
    }
    
    public void saveAvail(String nombreArchivo) {
        FileWriter fichero = null;
        try {
            String lineaAnterior = readAvail(nombreArchivo);
            fichero = new FileWriter(nombreArchivo);
            //fichero = new FileWriter("fichero_escritura.txt");

//            // Escribimos linea a linea en el fichero
//            for (String linea : lineas) {
//                fichero.write(linea + "\n");
//            }
            
            // Escribimos linea a linea en el fichero
            
//            if(lineaAnterior.equals("")){
//                fichero.write(toString());
//            } else
            System.out.println(lineaAnterior);
            System.out.println(toString());
            fichero.write(lineaAnterior+toString());
            

            fichero.close();

        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
    }
    
    @Override
    public String toString(){
        String acum = "";
        if(!isEmpty()){                             //Si la lista no está vacía entonces
            DLLNode temp = head;
            while(temp!=null){
                acum += temp.byteOff + "|" + temp.tamaño+ "|#";            //se imprime el valor del siguiente
                temp = temp.next;                   //hasta que en un punto se va a llegar la cola y cola.next=null
            }
        } else
            acum = "empty";
        
        return acum;
    }
    
}
