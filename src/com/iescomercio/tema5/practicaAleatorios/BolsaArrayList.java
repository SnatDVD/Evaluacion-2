
package com.iescomercio.tema5.practicaAleatorios;

import java.util.ArrayList;
import java.util.Random;

public class BolsaArrayList {
    
    private int numBlancas;
    private int numRojas;
    private Random generador;
    private ArrayList<String> bolas;
    
    public BolsaArrayList(int rojas, int blancas){
        generador = new Random();
        numBlancas = blancas;
        numRojas = rojas;
        bolas = new ArrayList<>();
        for(int c = 0; c < (numBlancas + numRojas); c++){
            if(c < numBlancas){
                bolas.add("Blanca");
            } else{
                bolas.add("Roja");
            }
        }
    }

    public int getBlancas() {
        return numBlancas;
    }

    public int getRojas() {
        return numRojas;
    }
    
    public String sacarBola(){
        int aux;
        String resultado;
        
        
        aux = generador.nextInt(bolas.size());
        
        
        
    }
    
    
    
}
