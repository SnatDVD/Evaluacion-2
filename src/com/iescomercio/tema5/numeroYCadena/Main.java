
package com.iescomercio.tema5.numeroYCadena;

public class Main {
    public static void main(String[] args) {
        
        Numero n = new Numero(220);
        Numero n2 = new Numero(284);
        
        
        //System.out.println(n.conjuntoDivisores().toString());
        
        //System.out.println(n.esAmigoDe(n2));
        
        //System.out.println(Numero.esNarcisista(13));
        
        Numero.listarNarcisistas(7);
        
    }
}
