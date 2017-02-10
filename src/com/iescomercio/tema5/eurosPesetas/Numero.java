
package com.iescomercio.tema5.eurosPesetas;

public class Numero {
    
    private int valor;
    
    public Numero(int valor){
        this.valor = valor;
    }
    
    private int getValor(){
        return valor;
    }
    
    public String desglosarPesetas(){
        int aux = getValor();
        String resultado = "";
        int[] contBilletesYMonedas = new int[12];
        int[] billetesYMonedas = {10000, 5000, 2000, 1000, 500, 100, 50, 25, 10, 5, 2, 1};
        
        for(int c = 0; c < billetesYMonedas.length; c++){
            contBilletesYMonedas[c] = aux/billetesYMonedas[c];
            if(contBilletesYMonedas[c] != 0){
                if(c < 4){
                    resultado = resultado + contBilletesYMonedas[c] + " billetes de " + billetesYMonedas[c] + " pesetas\n";
                } else {
                    resultado = resultado + contBilletesYMonedas[c] + " monedas de " + billetesYMonedas[c] + " pesetas\n";
                }
            }
            aux = aux % billetesYMonedas[c];
        }
        return resultado;
    }
}
