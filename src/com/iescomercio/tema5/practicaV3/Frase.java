
package com.iescomercio.tema5.practicaV3;

import java.util.HashMap;
import java.util.HashSet;

public class Frase {
    
    private String cadena;
    private HashMap diccionario;
    
    public Frase(){
        cadena = "";
        diccionario = null;
    }

    public Frase(String cadena){
        this.cadena = cadena;
        diccionario = null;
    }
    
    public String getContenido(){
        return cadena;
    }
    
    public String invertir(){
        String aux = "";
        
        for(int c = cadena.length() - 1; c >= 0; c--){
            aux = aux + cadena.charAt(c);
        }
        return aux;
    }
    
    public int numPalabras(){
        return cadena.split(" ").length;
    }
    
    public int numPalabrasDistintas(){
        HashSet<String> palabras = new HashSet<String>();
        String[] aux = new String[cadena.split(" ").length];
        
        aux = cadena.split(" ");
        for(int c = 0; c < aux.length; c++){
            palabras.add(aux[c]);
        }
        return palabras.size();
    }
    
    public String ordenar(){
        String[] aux = new String[cadena.split(" ").length];
        
        aux = cadena.split(" ");
        
    }
    
}
