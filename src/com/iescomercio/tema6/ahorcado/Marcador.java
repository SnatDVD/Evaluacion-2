
package com.iescomercio.tema6.ahorcado;

public class Marcador {
    
    private StringBuilder letras;
    
    public Marcador(){
        letras = new StringBuilder();
    }
    
    private StringBuilder getLetras(){
        return letras;
    }
    
    private void setLetras(StringBuilder letras){
        this.letras = letras;
    }
    
    public boolean letraDicha(char letra){
        int tam = getLetras().length();
        for(int c = 0; c < tam; c++){
            if (getLetras().charAt(c) == letra){
                return true;
            }
        }
        return false;
    }
    
    public void mostrar(){
        System.out.println(getLetras().toString());
    }
    
    public void anadeLetra(char letra){
        setLetras(getLetras().append(letra + " "));
    }
}
