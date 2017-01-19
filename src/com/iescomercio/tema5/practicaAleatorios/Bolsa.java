package com.iescomercio.tema5.practicaAleatorios;

import java.util.Random;

public class Bolsa {

    private int numBlancas;
    private int numRojas;
    private Random generador;
    private int iniBlancas;
    private int iniRojas;

    public Bolsa(int blancas, int rojas) {
        numBlancas = blancas;
        iniBlancas = blancas;
        numRojas = rojas;
        iniRojas = rojas;
        generador = new Random();
    }

    public int getBlancas() {
        return numBlancas;
    }

    public int getRojas() {
        return numRojas;
    }

    public String sacarBola() {
        int aux, total = getBlancas() + getRojas();

        if (total > 0) {
            aux = generador.nextInt(total);
            if (aux < getBlancas()) {
                numBlancas--;
                return "Blanca";
            } else if (getRojas() > 0) {
                numRojas--;
                return "Roja";
            }
        } else {
            System.out.println("La bolsa esta vacia");
        }
        return "";
    }

    public void sacarTodas(){
        int todas = getBlancas() + getRojas();
        
        for(int c = 0; c < todas; c++){
            System.out.println(sacarBola());
        }
    }
    
    public void reiniciarBolsa(){
        numBlancas = iniBlancas;
        numRojas = iniRojas;
    }
}
