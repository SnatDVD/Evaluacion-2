
package com.iescomercio.tema5.eurosPesetas;

public class Main {
    public static void main(String[] args) {
        
        Numero n = new Numero(28568);
        
        System.out.println(n.desglosarPesetas());
        
        Dinero d = new Dinero(4268.89);
        
        System.out.println(d.desglosar());
    }
}
