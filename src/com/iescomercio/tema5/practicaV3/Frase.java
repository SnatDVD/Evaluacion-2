
package com.iescomercio.tema5.practicaV3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Frase {
    
    private String cadena;
    private HashMap<String,String> diccionario;
    
    public Frase(){
        cadena = "";
        diccionario = new HashMap();
        rellenaDiccionario();
    }

    public Frase(String cadena){
        this.cadena = cadena;
        diccionario = new HashMap();
        rellenaDiccionario();
    }
    
//==============================================================
//      METODOS PRIVADOS
//==============================================================
    
    private void rellenaDiccionario(){
        diccionario.put("amigos", "friends");
        diccionario.put("azucar", "sugar");
        diccionario.put("zorro", "fox");
        diccionario.put("Hola", "Hello");
        diccionario.put("PIANO", "PIANO");
    }
    
    private String buscaTraduccion(String palabra){
        if(diccionario.containsKey(palabra)){
            return diccionario.get(palabra);
        } else{
            return "Desconocida";
        }
    }
    
//==============================================================
//      METODOS PUBLICOS
//==============================================================
    
    public String getContenido(){
        return cadena;
    }
    
    public String invertir(){
        String aux = "";
        
        for(int c = cadena.length() - 1; c >= 0; c--){
            aux = aux + cadena.charAt(c);
        }
        return aux;
    }
    
    public int numPalabras(){
        return cadena.split(" ").length;
    }
    
    public int numPalabrasDistintas(){
        HashSet<String> palabras = new HashSet<String>();
        String[] aux = new String[cadena.split(" ").length];
        
        aux = cadena.split(" ");
        for(int c = 0; c < aux.length; c++){
            palabras.add(aux[c]);
        }
        return palabras.size();
    }
    
    public String ordenar(){
        String[] aux;
        int tam;
        String resultado = "";
        
        aux = cadena.split(" ");
        tam = aux.length;
        Arrays.sort(aux);
        for(int c = 0; c < tam; c++){
            resultado = resultado + aux[c] + " ";
        }
        return resultado;
    }
    
    public String ordenarTreeSet(){
        String[] aux;
        int tam;
        String resultado = "";
        TreeSet<String> palabras = new TreeSet();
        Iterator<String> it;
        
        aux = cadena.split(" ");
        tam = aux.length;
        for(int c = 0; c < tam; c++){
            palabras.add(aux[c]);
        }
        it = palabras.iterator();
        while(it.hasNext()){
            resultado = resultado + it.next() + " ";
        }
        return resultado;
    }
    
    public String palabraMasLarga(){
        String[] aux;
        int tam;
        String resultado = "";
        
        aux = cadena.split(" ");
        tam = aux.length;
        for(int c = 0; c < tam; c++){
            if(aux[c].length() > resultado.length()){
                resultado = aux[c];
            }
        }
        return resultado;
    }
    
    public boolean palabraRepetida(){
        return this.numPalabras() == this.numPalabrasDistintas();
    }
    
    public String revolver(){
        String[] aux;
        int intAux;
        String resultado = "", palabraRan;
        ArrayList<String> palabras = new ArrayList();
        Random ran = new Random();
        
        aux = cadena.split(" ");
        intAux = aux.length;
        for(int c = 0; c < intAux; c++){
            palabras.add(aux[c]);
        }
        while(palabras.size() != 0){
            intAux = ran.nextInt(palabras.size());
            palabraRan = palabras.get(intAux);
            resultado = resultado + palabraRan + " ";
            palabras.remove(intAux);
        }
        return resultado;
    }
    
    public String traducir(){
        String[] aux;
        int intAux;
        String resultado = "";
        
        aux = cadena.split(" ");
        intAux = aux.length;
        for(int c = 0; c < intAux; c++){
            resultado = resultado + buscaTraduccion(aux[c]) + " ";
        }
        return resultado;
    }
    
}
