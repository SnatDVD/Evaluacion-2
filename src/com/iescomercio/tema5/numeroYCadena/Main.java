
package com.iescomercio.tema5.numeroYCadena;

public class Main {
    public static void main(String[] args) {
        
        Numero n = new Numero(2914);
        Numero n2 = new Numero(284);
        
        
        //System.out.println(n.conjuntoDivisores().toString());
        
        //System.out.println(n.esAmigoDe(n2));
        
        //System.out.println(Numero.esNarcisista(13));
        
        //Numero.listarNarcisistas(3);
        
        //System.out.println(n.pasarARomano());
        
        Cadena c = new Cadena("Hoy es Navidad");
        
        String hola = "hola";
        
        Cadena.quitarLetraEnPosicion(hola, 0);
        
        System.out.println(hola);
        
        System.out.println(c.quitarLetras("aeiou"));
        
        //System.out.println(c.pasarADecimal());
        
        
        
    }
}
