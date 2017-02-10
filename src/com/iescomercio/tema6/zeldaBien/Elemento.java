
package com.iescomercio.tema6.zeldaBien;

public class Elemento {
    
    private String descripcion;
    private int peso;
    
    public Elemento(String descripcion, int peso){
        this.descripcion = descripcion;
        if(peso > 0){
            this.peso = peso;
        } else{
            this.peso = 0;
        }
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
}
