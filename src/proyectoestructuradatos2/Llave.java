/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoestructuradatos2;

/**
 *
 * @author Daniel
 */
public class Llave {
    int indice;
    int length;
    int byteOff;

    public Llave(int indice, int length, int byteOff) {
        this.indice = indice;
        this.length = length;
        this.byteOff = byteOff;
    }

    public Llave(int indice) {
        this.indice = indice;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getByteOff() {
        return byteOff;
    }

    public void setByteOff(int byteOff) {
        this.byteOff = byteOff;
    }
    
    
    
    
}
