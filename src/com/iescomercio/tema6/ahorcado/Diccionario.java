
package com.iescomercio.tema6.ahorcado;

import java.util.ArrayList;
import java.util.Random;

public class Diccionario {
    
    private ArrayList<String> palabras;
    
    public Diccionario(){
        palabras = new ArrayList<String>();
        anadirPalabras();
    }
    
    private ArrayList<String> getPalabras(){
        return palabras;
    }
    
    private void anadirPalabras(){
        getPalabras().add("Cocodrilo");
        getPalabras().add("Avion");
        getPalabras().add("Programacion");
        getPalabras().add("Ahorcado");
        getPalabras().add("Rioja");
        getPalabras().add("Gato");
        getPalabras().add("Perro");
        getPalabras().add("Comercio");
        getPalabras().add("Ordenador");
        getPalabras().add("Montaña");
        getPalabras().add("Ventana");
        getPalabras().add("Boligrafo");
        getPalabras().add("Timbre");
        getPalabras().add("Gaviota");
        getPalabras().add("Paloma");
        getPalabras().add("Altavoz");
        getPalabras().add("Pantalla");
    }
    
    public String getPalabraAleatoria(){
        Random rand = new Random();
        int aux = rand.nextInt(getPalabras().size());
        
        return getPalabras().get(aux).toUpperCase();
    }
}
