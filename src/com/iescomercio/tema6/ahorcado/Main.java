
package com.iescomercio.tema6.ahorcado;

public class Main {
    public static void main(String[] args) {
        
        Horca h = new Horca();
        
        h.mostrar();
        h.ponTrozo();
        h.mostrar();
        h.ponTrozo();
        h.mostrar();
        h.ponTrozo();
        h.mostrar();
        h.ponTrozo();
        h.ponTrozo();
        h.mostrar();
        System.out.println(h.estaVivo());
        h.ponTrozo();
        h.mostrar();
        System.out.println(h.estaVivo());
    }
}
