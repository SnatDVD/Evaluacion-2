
package com.iescomercio.tema5.numeroYCadena;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Numero {
    
    private int valor;
    
    public Numero(){
        valor = 0;
    }
    
    public Numero(int valor){
        this.valor = valor;
    }
    
    /*
    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                    METODOS PRIVADOS
    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    */
    
    private static int sumaConjuntoIntegers(LinkedHashSet<Integer> conjunto){
        int suma = 0;
        for(Integer i:conjunto){
            suma = suma + i;
        }
        return suma;
    }
    
    private static ArrayList<Integer> trocearNumero(int numero){
        String aux = numero + "";
        String[] stringAux = aux.split("");
        ArrayList<Integer> cifras = new ArrayList<>();
        
        for(int c = 0; c < stringAux.length; c++){
            cifras.add(Integer.parseInt(stringAux[c]));
        }
        return cifras;
    }
    
    /*
    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                    METODOS PUBLICOS
    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    */
    
    public int getValor(){
        return valor;
    }
    
    public LinkedHashSet<Integer> conjuntoDivisores(){
        LinkedHashSet<Integer> conjunto = new LinkedHashSet<>();
        
        for(int c = 1; c <= getValor()/2; c++){
            if(getValor() % c == 0){
                conjunto.add(c);
            }
        }
        return conjunto;
    }
    
    public boolean esAmigoDe(Numero numero2){
        LinkedHashSet<Integer> divisores1 = this.conjuntoDivisores();
        LinkedHashSet<Integer> divisores2 = numero2.conjuntoDivisores();
        int suma1, suma2;
        
        suma1 = sumaConjuntoIntegers(divisores1);
        suma2 = sumaConjuntoIntegers(divisores2);
        if(getValor() == suma2 && numero2.getValor() == suma1){
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean esNarcisista(int numero){
        ArrayList<Integer> cifras = trocearNumero(numero);
        int tam = cifras.size();
        double sum = 0;
        
        if(numero > 0){
            for(int c = 0; c < tam; c++){
                sum = sum + Math.pow(cifras.get(c),tam);
            }
            return sum == numero;
        } else{
            return false;
        }
    }
    
    public static void listarNarcisistas(int numCifras){
        int numInicial = (int)Math.pow(10, (numCifras - 1));
        int numFinal = (numInicial * 10) - 1;
        int cont = 0;
        
        System.out.println("Números narcisistas de " + numCifras + " cifras:");
        for(int c = numInicial; c <= numFinal; c++){
            if(esNarcisista(c)){
                System.out.print(c + "  ");
                cont++;
            }
        }
        System.out.println("\nTotal de numeros: " + cont);
    }
    
    public String pasarARomano(){
        int aux = getValor();
        
        if(aux > 0 && aux < 4001){
            int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] letras = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            int cont = 0;
            String resultado = "";
            
            while(aux != 0){
                while((aux / valores[cont]) > 0){
                    resultado = resultado + letras[cont];
                    aux = aux - valores[cont];
                }
                cont++;
            }
            return resultado;
        } else{
            System.out.println("Numero no valido. Debe ser entre 1 y 4000");
            return "";
        }
        
    }
    
    
}
