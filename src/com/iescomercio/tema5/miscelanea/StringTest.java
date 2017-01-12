package com.iescomercio.tema5.miscelanea;

import java.util.Scanner;

public class StringTest {

    public void ejercicio4() {

        String s1 = new String();
        String s2 = new String(" ababABAB ");
        String s3 = "Ejemplo";

        System.out.println(s1.compareTo(" "));
        System.out.println(s2.concat(s3));
        System.out.println(s1.indexOf('h'));
        System.out.println(s2.trim());
        System.out.println(s2.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s2.indexOf('b'));
        System.out.println(s2.lastIndexOf('b'));
        System.out.println(s3.length());
        System.out.println(s3.charAt(1));
        System.out.println(s2.replace('A', 'x'));
    }

    public void ejercicio5() {

        Scanner sc = new Scanner(System.in);
        String[] listaNumeros = new String[10];

        System.out.println("Introduce 10 numeros por teclado separados por comas (sin espacios)");
        listaNumeros = sc.next().trim().split(",");

        for (int c = 0; c < 10; c++) {
            System.out.println(listaNumeros[c]);
        }
    }

    public boolean ejercicio6() {

        Scanner sc = new Scanner(System.in);
        String aux;
        int tam;

        System.out.println("Introduce una cadena.");
        aux = sc.next().toLowerCase();
        tam = aux.length();

        for (int c = 0; c < (tam / 2); c++) {
            if (aux.charAt(c) != aux.charAt(tam - c - 1)) {
                return false;
            }
        }
        return true;
    }

}
