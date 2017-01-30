
package com.iescomercio.tema6.ahorcado;

import java.util.Scanner;

public class Lector {
    
    private char letra;
    
    public Lector(){
        letra = ' ';
    }
    
    public char getLetra(){
        return letra;
    }
    
    public void pedirLetra(){
        Scanner sc = new Scanner(System.in);
        String aux;
        char caracter;
        
        do{
            System.out.println("Introduce una letra.");
            aux = sc.nextLine();
            aux = aux.trim();
            aux = aux.toUpperCase();
            caracter = aux.charAt(0);
        }while(caracter < 'A' || caracter > 'Z');
        letra = caracter;
    }
    
}
