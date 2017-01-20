
package com.iescomercio.tema5.staticSingleton;

public class Main {
    
    public static void main(String[] args) {
        
        Compartida c = new Compartida();
        Compartida m = new Compartida();
        
        c.aumentar();
        c.mostrar();
        c.aumentar();
        m.aumentar();
        m.aumentar();
        c.aumentar();
        m.aumentar();
        c.aumentar();
        m.mostrar();
    }
    
}
