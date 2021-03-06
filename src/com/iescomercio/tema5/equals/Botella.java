
package com.iescomercio.tema5.equals;

public class Botella {
    
    private String marca;
    private float tamano;
    private int capacidad;

    public Botella(String marca, float tamaño, int capacidad){
        this.marca = marca;
        this.tamano = tamaño;
        this.capacidad = capacidad;
    }
    
    public String getMarca() {
        return marca;
    }

    public float getTamano() {
        return tamano;
    }
    
    public boolean equals(Botella bot){
        return ((bot.getMarca().equals(this.marca)) && (bot.getTamano() == this.tamano));
    }
    
    
}
