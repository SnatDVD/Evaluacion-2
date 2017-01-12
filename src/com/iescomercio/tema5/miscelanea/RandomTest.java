
package com.iescomercio.tema5.miscelanea;

import java.util.ArrayList;
import java.util.Random;

public class RandomTest {
    
    private Random ale;
    
    public RandomTest(){
        Random ale = new Random();
    }
    
    public void imprimirAleatorio(){
        System.out.println(ale.nextInt());
    }
    
    public void imprimirAleatorio(int cant){
        for(int c = 0; c < cant; c++){
            System.out.println(ale.nextInt());
        }
    }
    
    public int lanzarDado(){
        return (ale.nextInt(6)+1);
    }
    
    public String getRespuesta(){
        int aux;
        
        aux = ale.nextInt(3);
        switch (aux) {
            case 0:
                return "Si";
            case 1:
                return "Quizas";
            default:
                return "No";
        }
    }
    
    public String getRespuesta2(){
        ArrayList<String> respuestas = new ArrayList<>();
        int aux;
        String resp = "";
        
        for(int c = 0; c < 10; c++){
            resp = resp + "O";
            respuestas.add(resp);
        }
        
        aux = ale.nextInt(respuestas.size());
        return (respuestas.get(aux));
    }
    
    public int numAleatorio(int max){
        return (ale.nextInt(max+1));
    }
    
    public int numAleatorio(int min, int max){
        return (ale.nextInt(max + 1) + min);
    }
    
    
}
