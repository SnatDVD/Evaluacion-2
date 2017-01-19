
package com.iescomercio.tema5.practicaAleatorios;

import java.util.Random;

public class Moneda {
    
    private Random generador;
    
    public Moneda(){
        generador = new Random();
    }
    
    public int lanzar(int veces){
        int aux, caras = 0;
        
        for(int c = 0; c < veces; c++){
            aux = generador.nextInt(2);
            if(aux == 0){
                System.out.println("Cara");
                caras++;
            } else{
                System.out.println("Cruz");
            }
        }
        return caras;
    }
    
    public void lanzarConsecutivas(int carasConsecutivas){
        int aux,caras = 0, count = 0;
        boolean conseguido = false;
        
        while(!conseguido){
            aux = generador.nextInt(2);
            count++;
            if(aux == 0){
                caras++;
                if(caras == carasConsecutivas){
                    conseguido = true;
                }
            } else{
                caras = 0;
            }
        }
        System.out.println("Se han hecho " + count  
                + " lanzamientos para llegar a " + carasConsecutivas 
                + " caras consecutivas");
    }
    
    public void lanzarCanto(){
        int aux,aux2, cont = 0;
        boolean conseguido = false;
        
        while(!conseguido){
            aux2 = generador.nextInt(1);
            aux = generador.nextInt(20);
            cont++;
            if(aux == 19){
                System.out.println("Canto");
                conseguido = true;
            } else if(aux2 == 0){
                System.out.println("Cara");
            } else{
                System.out.println("Cruz");
            }
        }
        System.out.println("Se han hecho " + cont 
                + " lanzamientos para que caiga canto");
    }
}
