
package com.iescomercio.tema5.practicaAleatorios;

import java.util.Random;

public class Sorteo {
    
    private Random generador;
    
    public Sorteo(){
        generador = new Random();
    }
    
    /*
    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    PRIVATE
    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    */
    
    private boolean estaElNumero(int num, int[] lista){
        for(int c = 0; c < lista.length; c++){
            if(num == lista[c]){
                return true;
            }
        }
        return false;
    }
    
    /*
    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    PUBLIC
    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    */
    
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
        int[] nums = new int[6];
        int aux, c = 0;
        
        while(c < 6){
            aux = generador.nextInt(49)+1;
            if(!estaElNumero(aux, nums)){
                nums[c] = aux;
                System.out.println("Numero " + c + ": " + nums[c]);
                c++;
            }
        }
    }
    
    public int sorteoNavidad(){
        return generador.nextInt(100000);
    }
    
    public void sorteoSemanal(){
        int[] nums = new int[5];
        
        for(int c = 0; c < 5; c++){
            nums[c] = generador.nextInt(10);
            System.out.println("El " + nums[c]);
        }
        System.out.print("El gordo es el ");
        for(int c = 0; c < 5; c++){
            System.out.print(nums[c]);
        }
        System.out.println("");
    }
    
    public int terminacionNumFijo(int num){
        int cont = 0, cont2 = 0, aux, num2 = num%10;
        
        for(int x = 0; x < 100; x++){
            for(int c = 0; c < 25; c++){
                aux = (sorteoNavidad()%10);
                if(num2 == aux){
                    cont++;
                }
            }
            if (cont > 0){
                cont2++;
            }
            cont = 0;
        }
        return cont2;
    }
    
    public int terminacionNumAleatorio(){
        int cont = 0, cont2 = 0, aux, num;
        
        for(int x = 0; x < 100; x++){
            for(int c = 0; c < 25; c++){
                num = generador.nextInt(10);
                aux = (sorteoNavidad()%10);
                if(num == aux){
                    cont++;
                }
            }
            if (cont > 0){
                cont2++;
            }
            cont = 0;
        }
        return cont2;
    }
    
}
