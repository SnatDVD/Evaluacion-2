
package com.iescomercio.tema6.ahorcado;

public class Palabra {
    
    private String palabra;
    private StringBuilder oculta;
    
    public Palabra(){
        setPalabra("AHORCADO");
        oculta = new StringBuilder();
        rellenaGuiones();
    }
    
    public Palabra(String palabra){
        setPalabra(palabra);
        oculta = new StringBuilder();
        rellenaGuiones();
    }
    
    private String getPalabra(){
        return palabra;
    }
    
    private StringBuilder getOculta(){
        return oculta;
    }
    
    private void setPalabra(String palabra){
        this.palabra = palabra;
    }
    
    private void setOculta(StringBuilder nuevaOculta){
        oculta = nuevaOculta;
    }
    
    private void rellenaGuiones(){
        int tam = getPalabra().length();
        StringBuilder aux = new StringBuilder();
        for(int c = 0; c < tam; c++){
            aux = aux.append('-');
        }
        setOculta(aux);
    }
    
    private void desvelaLetra(char letra){
        int tam = getPalabra().length();
        
        for(int c = 0; c < tam; c++){
            if(letra == getPalabra().charAt(c)){
                getOculta().setCharAt(c, letra);
            }
        }
    }
    
    public void mostrar(){
        System.out.println(getOculta().toString());
    }
    
    public boolean compruebaLetra(char letra){
        if(getPalabra().contains(letra + "")){
            desvelaLetra(letra);
            return true;
        } else {
            return false;
        }
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
