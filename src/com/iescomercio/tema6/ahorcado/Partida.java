
package com.iescomercio.tema6.ahorcado;

import java.util.ArrayList;

public class Partida {
    
    private int numJugadores;
    private int numFallos;
    private ArrayList<Ahorcado> ahorcados;
    
    public Partida(int jugadores, int fallos){
        Ahorcado a;
        numJugadores = jugadores;
        numFallos = fallos;
        ahorcados = new ArrayList<Ahorcado>();
        for(int c = 0; c < numJugadores; c++){
            a = new Ahorcado(numFallos);
            ahorcados.add(a);
        }
    }
    
    private boolean todosMuertos(){
        int aux = 0;
        for(Ahorcado a:ahorcados){
            if(!a.vive()){
                aux++;
            }
        }
        return aux == ahorcados.size();
    }
    
    private boolean hayGanador(){
        for(Ahorcado a:ahorcados){
            if(a.haGanado()){
                return true;
            }
        }
        return false;
    }
    
    public void jugar(){
        int cont = 0;
        Ahorcado aux;
        do{
            aux = ahorcados.get(cont);
            if(aux.vive()){
                aux.ronda();
            }
            cont = (cont + 1) % ahorcados.size();
        }while(!this.hayGanador() && !this.todosMuertos());
    }
    
}
