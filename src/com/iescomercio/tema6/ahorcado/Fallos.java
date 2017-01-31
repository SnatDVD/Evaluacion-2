
package com.iescomercio.tema6.ahorcado;

public class Fallos {
    
    private StringBuilder letras;
    
    public Fallos(){
        letras = new StringBuilder();
        letras.append("Fallos: ");
    }
    
    private StringBuilder getLetras(){
        return letras;
    }
    
    public void mostrar(){
        System.out.println(getLetras().toString());
    }
    
    public void anadeLetra(char letra){
        getLetras().append(letra);
    }
}
