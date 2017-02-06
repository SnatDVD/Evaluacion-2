
package com.iescomercio.tema6.ahorcado;

import java.util.Scanner;

public class Ahorcado {
    
    private Jugador j;
    private Marcador f;
    private Marcador a;
    private Horca h;
    private Lector l;
    private Diccionario d;
    private Palabra p;
            
    public Ahorcado(int fallosMax){
        j = new Jugador();
        f = new Marcador();
        a = new Marcador();
        h = new Horca(fallosMax);
        l = new Lector();
        d = new Diccionario();
        p = new Palabra(d.getPalabraAleatoria());
        j.pedirNombre();
    }
    
    public void ronda(){
        boolean acierta;
        do{
            acierta = false;
            System.out.println("======================================");
            System.out.println("Turno de " + j.getNombre());
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
                    if(!h.estaVivo()){
                        System.out.println(j.getNombre() + " ha muerto. Descansa en paz.");
                        System.out.println("Su palabra era " + p.solucion());
                    }
                }
            }else{
                a.anadeLetra(l.getLetra());
                acierta = true;
                if(this.haGanado()){
                    System.out.println("Enhorabuena " + j.getNombre() + ". Has ganado!!");
                }
            }
            System.out.println("======================================");
        }while(acierta);
    }
    
    public void presentar(){
        System.out.println("Bienvenido al juego del ahorcado.");
    }
    
    public boolean vive(){
        return h.estaVivo();
    }
    
    public boolean haGanado(){
        return !p.incompleta();
    }
    
    public void play(){
        presentar();
        j.pedirNombre();
        while(h.estaVivo() && p.incompleta()){
            ronda();
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
