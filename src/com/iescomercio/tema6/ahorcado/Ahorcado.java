
package com.iescomercio.tema6.ahorcado;

public class Ahorcado {
    
    private void presentar(){
        System.out.println("Bienvenido al juego del ahorcado.");
    }
    
    public void play(){
        Jugador j = new Jugador();
        Fallos f =  new Fallos();
        Horca h = new Horca();
        Lector l = new Lector();
        Diccionario d = new Diccionario();
        Palabra p = new Palabra(d.getPalabraAleatoria());
        
        presentar();
        j.pedirNombre();
        while(h.estaVivo() && p.incompleta()){
            h.mostrar();
            p.mostrar();
            f.mostrar();
            l.pedirLetra();
            if(!p.compruebaLetra(l.getLetra())){
                if(!f.letraDicha(l.getLetra())){
                    h.ponTrozo();
                    f.anadeLetra(l.getLetra());
                }
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
