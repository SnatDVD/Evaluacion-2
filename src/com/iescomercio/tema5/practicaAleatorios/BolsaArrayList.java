
package com.iescomercio.tema5.practicaAleatorios;

import java.util.ArrayList;
import java.util.Random;

public class BolsaArrayList {
    
    private Random generador;
    private ArrayList<String> bolas;
    private ArrayList<String> estadoInicial;
    
    public BolsaArrayList(int rojas, int blancas){
        generador = new Random();
        bolas = new ArrayList<>();
        estadoInicial = new ArrayList<>();
        for(int c = 0; c < (blancas + rojas); c++){
            if(c < blancas){
                bolas.add("Blanca");
                estadoInicial.add("Blanca");
            } else{
                bolas.add("Roja");
                estadoInicial.add("Roja");
            }
        }
    }

    public int getBlancas() {
        int cont = 0;
        for(String c:bolas){
            if (c.equals("Blanca")){
                cont++;
            }
        }
        return cont;
    }

    public int getRojas() {
        int cont = 0;
        for(String c:bolas){
            if (c.equals("Roja")){
                cont++;
            }
        }
        return cont;
    }
    
    public String sacarBola(){
        int aux;
        String resultado;
        
        aux = generador.nextInt(bolas.size());
        resultado = bolas.get(aux);
        bolas.remove(aux);
        return resultado;
    }
    
    public void sacarTodas(){
        int tam = bolas.size();
        
        for(int c = 0; c < tam; c++){
            System.out.println(sacarBola());
        }
    }
    
    public void reiniciarBolsa(){
        bolas.clear();
        for(String c:estadoInicial){
            bolas.add(c);
        }
    }
    
}
