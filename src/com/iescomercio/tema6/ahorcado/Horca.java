
package com.iescomercio.tema6.ahorcado;

public class Horca {
    
    private int partes;
    
    public Horca(){
        partes = 0;
    }
    
    private int getPartes(){
        return partes;
    }
    
    private void setPartes(int partes){
        this.partes = partes;
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
        }
    }
    
    public boolean estaVivo(){
        return (getPartes() != 6);
    }
    
    public void ponTrozo(){
        setPartes(getPartes()+1);
    }
}
