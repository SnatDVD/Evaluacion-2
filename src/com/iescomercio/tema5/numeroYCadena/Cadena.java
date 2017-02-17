
package com.iescomercio.tema5.numeroYCadena;

import java.util.HashMap;
import java.util.Random;

public class Cadena {
    
    private String cadena;
    private HashMap<Character,Character> codificacion;
    
    public Cadena(){
        cadena = "";
        rellenarCodificacion();
    }
    
    public Cadena(String cadena){
        this.cadena = cadena;
        rellenarCodificacion();
    }
    
    private void rellenarCodificacion(){
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int aux, tam = caracteres.length();
        Random rand = new Random();
        
        for(int c = 0; c < tam; c++){
            aux = rand.nextInt(tam);
            codificacion.put(caracteres.charAt(c), caracteres.charAt(aux));
        }
    }
    
    private char codificaCaracter(char caracter){
        if(codificacion.containsKey(caracter)){
            return codificacion.get(caracter);
        } else{
            return '*';
        }
    }
    
    public String codificar(){
        String aux = "";
        int tam = cadena.length();
        
        for(int c = 0; c < tam; c++){
            aux = aux + codificaCaracter(cadena.charAt(c));
        }
        return aux;
    }
    
    public int pasarADecimal(){
        int valor = 0, tam = cadena.length(), max = 0;
        String aux = cadena.toUpperCase();
        
        
        
        for(int c = tam - 1; c >= 0; c--){
            
        }
    }
    
}
