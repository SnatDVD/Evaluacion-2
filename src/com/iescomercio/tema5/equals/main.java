
package com.iescomercio.tema5.equals;

public class main {
    
    public static void main(String[] args) {
        
        String cad1 = "hola";
        String cade2 = "HOLA";
        
        cade2 = cade2.toLowerCase();
        
        System.out.println("Resultado: " + (cad1.equals(cade2)));
        
        
        
    }
}
