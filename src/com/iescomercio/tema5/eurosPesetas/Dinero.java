
package com.iescomercio.tema5.eurosPesetas;

public class Dinero {
    
    private double valor;
    
    public Dinero(double valor){
        this.valor = valor;
    }
    
    private double getValor(){
        return valor;
    }
    
    public String desglosar(){
        double aux = getValor();
        String resultado = "";
        int[] contBilletesYMonedas = new int[15];
        double[] billetesYMonedas = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
        
        for(int c = 0; c < billetesYMonedas.length; c++){
            contBilletesYMonedas[c] = (int)(aux/billetesYMonedas[c]);
            if(contBilletesYMonedas[c] != 0){
                if(c < 7){
                    resultado = resultado + contBilletesYMonedas[c] + " billetes de " + billetesYMonedas[c] + " €\n";
                } else {
                    resultado = resultado + contBilletesYMonedas[c] + " monedas de " + billetesYMonedas[c] + " €\n";
                }
            }
            aux = aux % billetesYMonedas[c];
        }
        return resultado;
    }
    
}
