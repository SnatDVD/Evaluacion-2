
package com.iescomercio.tema5.practicaAleatorios;

import java.util.Random;

public class Dado {
    
    private Random generador;
    private int numCaras;
    
    public Dado(int numCaras){
        generador = new Random();
        this.numCaras = numCaras;
    }
    
    public Dado(){
        generador = new Random();
        numCaras = 6;
    }
    
    public int lanzarIguales(){
        int cont = 0, dado1, dado2;
        
        do{
            dado1 = generador.nextInt(numCaras) + 1;
            dado2 = generador.nextInt(numCaras) + 1;
            cont++;
            System.out.println("Dado 1: " + dado1 + "   Dado 2: " + dado2);
        } while (dado1 != dado2);
        return cont;
    }
    
    public void lanzarTrucado(int lanzamientos){
        double aux, prob1, prob2;
        double[] vect = new double[numCaras];
        
        prob1 = (((double)2/(numCaras+1))*100);
        prob2 = prob1/2;
        vect[0] = prob1;
        
        for(int x = 1; x < numCaras; x++){
            vect[x] = vect[x-1] + prob2;
        }
        for(int c = 0; c < lanzamientos; c++){
            aux = generador.nextDouble() * 100;
            for(int z = 0; z < numCaras; z++){
                if(aux < vect[z]){
                    System.out.println("Ha salido " + (z+1));
                    break;
                }
            }
        }
    }
    
}
