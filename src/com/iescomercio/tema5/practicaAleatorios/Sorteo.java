
package com.iescomercio.tema5.practicaAleatorios;

import java.util.Random;

public class Sorteo {
    
    private Random generador;
    
    public Sorteo(){
        generador = new Random();
    }
    
    public void listarQuiniela(int probUno, int probDos, int probX){
        int aux;
        
        if((probUno + probDos + probX) == 100){
            for(int c = 1; c < 16; c++){
                aux = (generador.nextInt(100)) + 1;
                if(aux <= probUno){
                    System.out.println("    1   |       |");
                } else if (aux <= (probUno + probDos)){
                    System.out.println("        |       |   2");
                } else {
                    System.out.println("        |   X   |");
                }
            }
        } else {
            System.out.println("Las probabilidades deben sumar 100");
        }
    }
    
    public void primitiva(){
        
    }
    
}
