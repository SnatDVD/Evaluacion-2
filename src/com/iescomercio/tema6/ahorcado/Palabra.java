
package com.iescomercio.tema6.ahorcado;

public class Palabra {
    
    private String palabra;
    private StringBuilder letrasDichas;
    
    public Palabra(){
        palabra = "AHORCADO";
        letrasDichas = new StringBuilder();
    }
    
    private String getPalabra(){
        return palabra;
    }
    
    public void mostrar(){
        int tam = getPalabra().length();
        for(int c = 0; c < tam; c++){
            
        }
    }
    
    public boolean comprobar(){
        
    }
    
}
