
package com.iescomercio.tema6.ahorcado;

import java.util.Scanner;

public class Ahorcado {
    
    private void presentar(){
        System.out.println("Bienvenido al juego del ahorcado.");
    }
    
    private int pideFallosMax(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de fallos que quieras para el juego");
        return sc.nextInt();
    }
    
    public void play(){
        
        Jugador j = new Jugador();
        Marcador f =  new Marcador();
        Marcador a =  new Marcador();
        Horca h = new Horca(pideFallosMax());
        Lector l = new Lector();
        Diccionario d = new Diccionario();
        Palabra p = new Palabra(d.getPalabraAleatoria());
        
        presentar();
        j.pedirNombre();
        while(h.estaVivo() && p.incompleta()){
            h.mostrar();
            p.mostrar();
            System.out.print("Fallos: ");
            f.mostrar();
            System.out.print("Aciertos: ");
            a.mostrar();
            l.pedirLetra();
            if(!p.compruebaLetra(l.getLetra())){
                if(!f.letraDicha(l.getLetra())){
                    h.ponTrozo();
                    f.anadeLetra(l.getLetra());
                }
            }else{
                a.anadeLetra(l.getLetra());
            }
        }
        if(h.estaVivo()){
            System.out.println("Enhorabuena " + j.getNombre() + ". Has ganado!");
        } else{
            h.mostrar();
            System.out.println(j.getNombre() + " ha muerto. RIP");
            System.out.println("La solución era " + p.solucion());
        }
    }
    
}
