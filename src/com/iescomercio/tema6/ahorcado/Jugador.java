
package com.iescomercio.tema6.ahorcado;

import java.util.Scanner;

public class Jugador {
    
    private String nombre;
    private int edad;
    
    public Jugador(){
        nombre = "";
        edad = 0;
    }
    
    private void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void pedirNombre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre.");
        setNombre(sc.nextLine());
    }
}
