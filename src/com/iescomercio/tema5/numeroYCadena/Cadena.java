
package com.iescomercio.tema5.numeroYCadena;

import java.util.HashMap;
import java.util.Random;

public class Cadena {
    
    private String cadena;
    private HashMap<Character,Character> codificacion;
    
    public Cadena(){
        cadena = "";
        codificacion = new HashMap();
        rellenarCodificacion();
    }
    
    public Cadena(String cadena){
        this.cadena = cadena;
        codificacion = new HashMap();
        rellenarCodificacion();
    }
    
    private void rellenarCodificacion(){
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int aux, tam = caracteres.length();
        Random rand = new Random();
        
        for(int c = 0; c < tam; c++){
            aux = rand.nextInt(tam);
            codificacion.put(caracteres.charAt(c), caracteres.charAt(aux));
        }
    }
    
    private char codificaCaracter(char caracter){
        if(codificacion.containsKey(caracter)){
            return codificacion.get(caracter);
        } else{
            return '*';
        }
    }
    
    private static int valorRomano(char letra){
        char aux = Character.toUpperCase(letra);
        switch(aux){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
    
    public String codificar(){
        String aux = "";
        int tam = cadena.length();
        
        for(int c = 0; c < tam; c++){
            aux = aux + codificaCaracter(cadena.charAt(c));
        }
        return aux;
    }
    
    public int pasarADecimal(){
        char[] letras = cadena.toCharArray();
        int max = 0, aux, resultado = 0;
        
        for(int c = letras.length - 1; c >= 0; c--){
            aux = valorRomano(letras[c]);
            if(aux == 0){
                System.out.println("Numero no valido, la cadena tiene letras "
                        + "que no son numeros romanos");
                return -1;
            }else if(aux < max){
                resultado = resultado - aux;
            }else{
                resultado = resultado + aux;
                max = aux;
            }
        }
        return resultado;
    }
    
    public static boolean quitarLetraEnPosicion(String mensaje,int posicion){
        int tam = mensaje.length();
        if(posicion < 0 || posicion >= tam){
            return false;
        } else{
            StringBuilder mens = new StringBuilder(mensaje);
            
            mens = mens.deleteCharAt(posicion);
            mensaje = mens.toString();
            return true;
        }
    }
    
    public String quitarLetras(String letras){
        int tam = letras.length();
        int tam2 = cadena.length();
        
        if(tam > 0 && tam2 > 0){
            String aux = cadena;
            
            for(int c = 0; c < tam; c++){
                for(int b = 0; b < tam2; b++){
                    if(aux.charAt(b) == letras.charAt(c)){
                        quitarLetraEnPosicion(aux, b);
                    }
                }
            }
            return aux;
        } else{
            return cadena;
        }
        
        
    }
    
}
