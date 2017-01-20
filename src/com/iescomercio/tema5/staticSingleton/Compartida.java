
package com.iescomercio.tema5.staticSingleton;

public class Compartida {
    
    private static int cont = 0;
    
    public void aumentar(){
        cont++;
    }
    
    public void mostrar(){
        System.out.println("Valor: " + cont);
    }
}
