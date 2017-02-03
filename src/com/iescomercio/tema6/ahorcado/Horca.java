
package com.iescomercio.tema6.ahorcado;

public class Horca {
    
    private int partes;
    private int maximo;
    
    public Horca(){
        setPartes(0);
        setMaximo(6);
    }
    
    public Horca(int max){
        setPartes(0);
        setMaximo(max);
    }
    
    private int getPartes(){
        return partes;
    }
    
    private void setPartes(int partes){
        this.partes = partes;
    }
    
    private int getMaximo(){
        return maximo;
    }
    
    private void setMaximo(int max){
        maximo = max;
    }
    
    private void muestraVacia(){
        System.out.println("________");
        System.out.println("|      |");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|_______________");
    }
    
    private void muestraCabeza(){
        System.out.println("________");
        System.out.println("|      |");
        System.out.println("|      O");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|_______________");
    }
    
    private void muestraTronco(){
        System.out.println("________");
        System.out.println("|      |");
        System.out.println("|      O");
        System.out.println("|      |");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|_______________");
    }
    
    private void muestraBrazo1(){
        System.out.println("________");
        System.out.println("|      |");
        System.out.println("|      O");
        System.out.println("|     /|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|_______________");
    }
    
    private void muestraBrazo2(){
        System.out.println("________");
        System.out.println("|      |");
        System.out.println("|      O");
        System.out.println("|     /|\\");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|_______________");
    }
    
    private void muestraPierna1(){
        System.out.println("________");
        System.out.println("|      |");
        System.out.println("|      O");
        System.out.println("|     /|\\");
        System.out.println("|     /");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|_______________");
    }
    
    private void muestraPierna2(){
        System.out.println("________");
        System.out.println("|      |");
        System.out.println("|      O");
        System.out.println("|     /|\\");
        System.out.println("|     / \\");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|_______________");
    }
    
    private void muestraSombrero(){
        System.out.println("________");
        System.out.println("|      |");
        System.out.println("|      Ô");
        System.out.println("|     /|\\");
        System.out.println("|     / \\");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|_______________");
    }
    
    public void mostrar(){
        
        switch(getPartes()){
            case 0:{
                muestraVacia();
                break;
            }
            case 1:{
                muestraCabeza();
                break;
            }
            case 2:{
                muestraTronco();
                break;
            }
            case 3:{
                muestraBrazo1();
                break;
            }
            case 4:{
                muestraBrazo2();
                break;
            }
            case 5:{
                muestraPierna1();
                break;
            }
            case 6:{
                muestraPierna2();
                break;
            }
            case 7:{
                muestraSombrero();
                break;
            }
            default:{
                System.out.println("No hay dibujo, pero llevas " + getPartes());
                break;
            }
        }
    }
    
    public boolean estaVivo(){
        return (getPartes() != getMaximo());
    }
    
    public void ponTrozo(){
        setPartes(getPartes()+1);
    }
}
