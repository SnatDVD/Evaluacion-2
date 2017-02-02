
package com.iescomercio.tema6.ahorcado;

public class Palabra {
    
    private String palabra;
    private StringBuilder oculta;
    
    public Palabra(){
        int tam;
        
        palabra = "AHORCADO";
        oculta = new StringBuilder();
        tam = getPalabra().length();
        for(int c = 0; c < tam; c++){
            oculta = oculta.append('-');
        }
    }
    
    public Palabra(String palabra){
        int tam;
        
        this.palabra = palabra;
        oculta = new StringBuilder();
        tam = getPalabra().length();
        for(int c = 0; c < tam; c++){
            oculta = oculta.append('-');
        }
    }
    
    private String getPalabra(){
        return palabra;
    }
    
    private StringBuilder getOculta(){
        return oculta;
    }
    
    public void mostrar(){
        System.out.println(getOculta().toString());
    }
    
    public boolean compruebaLetra(char letra){
        int tam = getPalabra().length();
        boolean esta = false;
        
        for(int c = 0; c < tam; c++){
            if(letra == getPalabra().charAt(c)){
                getOculta().setCharAt(c, letra);
                esta = true;
            }
        }
        return esta;
    }
    
    public boolean incompleta(){
        int tam = getOculta().length();
        
        for(int c = 0; c < tam; c++){
            if(getOculta().charAt(c) == '-'){
                return true;
            }
        }
        return false;
    }
    
    public String solucion(){
        return getPalabra();
    }
    
    
    
}
