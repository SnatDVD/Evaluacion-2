package com.iescomercio.tema4.arrays;

import java.util.Scanner;

public class Arrays {

    /*
    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    METODOS PRIVATE
    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    */
    
    private void muestraCaracter(int n, char c) {
        for (int a = 0; a < n; a++) {
            System.out.print(c);
        }
    }
    
    private int sumatorioVector(int[] vector) {
        int tam = vector.length;
        int acum = 0;
        for (int c = 0; c < tam; c++) {
            acum = acum + vector[c];
        }
        return acum;
    }

    private void rellenaVectorInt(int[] vector) {
        int tam = vector.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca " + tam + " números enteros.");
        for (int c = 0; c < tam; c++) {
            System.out.println("Número " + (c + 1));
            vector[c] = sc.nextInt();
        }
    }

    private void rellenaArrayAleatorio(int[] array, int min, int max) {
        for (int c = 0; c < array.length; c++) {
            array[c] = (int) (Math.random() * (max - min) + min);
        }
    }
    
    private void muestraArrayInt(int[] vector){
        for(int c = 0; c < vector.length; c++){
            System.out.println("Posición: " + c + ": " + vector[c]);
        }
    }
    
    private int[] combinaArraysDeXEnX(int[] array1, int[] array2, int x){
        int c1 = 0, c2 = 0, c3 = 0, aux, i;
        int viAux = array1.length + array2.length;
        int[] arrayAux = new int[viAux];
        while (c3 < arrayAux.length && (c1 < array1.length || c2 < array2.length)){
            for(i = 0; i < 3 && c1 < array1.length; i++){
                arrayAux[c3] = array1[c1];
                c3++;
                c1++;
            }
            for(i = 0; i < 3 && c2 < array2.length; i++){
                arrayAux[c3] = array2[c2];
                c3++;
                c2++;
            }
        }
        return arrayAux;
    }
    
    /*
    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    METODOS PUBLIC
    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    */

    public void ejercicio1() {
        for (int i = 1; i < 11; i++) {
            System.out.println("5 x " + i + " = " + (i * 5));
        }
    }

    public void ejercicio2() {
        for (int x = 1; x < 11; x++) {
            System.out.println("======================");
            System.out.println("TABLA DEL " + x);
            System.out.println("======================");
            for (int y = 1; y < 11; y++) {
                System.out.println(x + " x " + y + " = " + (x * y));
            }
        }
    }

    public void ejercicio2DoWhile() {
        int x = 1, y;
        do {
            y = 1;
            System.out.println("======================");
            System.out.println("TABLA DEL " + x);
            System.out.println("======================");
            do {
                System.out.println(x + " x " + y + " = " + (x * y));
                y++;
            } while (y < 11);
            x++;
        } while (x < 11);
    }

    public void ejercicio3(int n) {
        int cont = 0;
        while (cont < n) {
            for (int x = 1; x < 11; x++) {
                System.out.println("======================");
                System.out.println("TABLA DEL " + x);
                System.out.println("======================");
                for (int y = 1; y < 11; y++) {
                    System.out.println(x + " x " + y + " = " + (x * y));
                }
            }
            cont++;
        }
    }

    public void ejercicio4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n; k++) {
                if (i == 1 || i == n) {
                    System.out.print("* ");
                } else if (k == 1 || k == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public void ejercicioCuentaAtras(int n) {
        int i = n + 1, k;
        do {
            i--;
            k = i;
            do {
                System.out.print(k);
                k--;
            } while (k >= 0);
            System.out.println("");
        } while (i > 0);
    }

    public void ejercicioImpares(int n) {
        if (n % 2 == 1) {
            for (int cont = 0; cont < 2; cont++) {
                for (int a = 1; a <= n; a = a + 2) {
                    System.out.print(a + ",");
                }
                for (int b = (n - 2); b >= 1; b = b - 2) {
                    System.out.print(b + ",");
                }
                System.out.println("");
            }
        }
    }

    public void ejercicioScanner() {
        Scanner sc = new Scanner(System.in);
        int e, b, resultado;
        do {
            resultado = 1;
            System.out.println("Introduce dos números.");
            b = sc.nextInt();
            e = sc.nextInt();
            if (b != 0 || e != 0) {
                for (int i = 0; i < e; i++) {
                    resultado = resultado * b;
                }
                System.out.println("Resultado: " + resultado);
            }
        } while (e != 0 || b != 0);
    }

    public void ejercicioScanner2() {
        Scanner s = new Scanner(System.in);
        int e, b, resultado;
        String aux;
        do {
            resultado = 1;
            System.out.println("Introduce dos números sepradaos por comas.");
            aux = s.nextLine();
            Scanner sc = new Scanner(aux).useDelimiter(",");
            b = sc.nextInt();
            e = sc.nextInt();
            if (b != 0 || e != 0) {
                for (int i = 0; i < e; i++) {
                    resultado = resultado * b;
                }
                System.out.println("Resultado = " + resultado);
            }
        } while (e != 0 || b != 0);
        System.out.println("FIN");
    }

    public void ejercicioScannerMultiplicacion() {
        Scanner sc = new Scanner(System.in);
        int a, b, cont = 0, resultado;
        do {
            resultado = 0;
            System.out.print("Intoduce el valor de a: ");
            a = sc.nextInt();
            System.out.print("Intoduce el valor de b: ");
            b = sc.nextInt();
            if (a != 0 || b != 0) {
                do {
                    resultado = resultado + a;
                    cont++;
                } while (cont < b);
                System.out.println("Resultado: " + resultado);
            }
        } while (a != 0 || b != 0);
        System.out.println("FIN");
    }

    public void rombo(int tam) {
        if (tam % 2 == 1) {
            int fila = 1;
            int espIzq = (tam / 2), espCen = 1;
            for (fila = 1; fila <= (tam / 2); fila++) {
                if (fila == 1) {
                    muestraCaracter(espIzq, ' ');
                    System.out.print("*");
                    espIzq--;
                } else {
                    muestraCaracter(espIzq, ' ');
                    System.out.print("*");
                    muestraCaracter(espCen, ' ');
                    System.out.print("*");
                    espIzq--;
                    espCen = espCen + 2;
                }
                System.out.println("");
            }
            for (fila = ((tam / 2) + 1); fila <= tam; fila++) {
                if (fila == tam) {
                    muestraCaracter(espIzq, ' ');
                    System.out.print("*");
                } else {
                    muestraCaracter(espIzq, ' ');
                    System.out.print("*");
                    muestraCaracter(espCen, ' ');
                    System.out.print("*");
                    espCen = espCen - 2;
                    espIzq++;
                }
                System.out.println("");
            }
        } else {
            System.out.println("Debe ser un valor impar.");
        }
    }

    public void diezNumeros() {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        int aux, cont = 0;
        System.out.println("Introduce 10 números.");
        do {
            System.out.println("Número " + (cont + 1) + ": ");
            aux = sc.nextInt();
            if (aux > 0) {
                nums[cont] = aux;
                cont++;
            } else {
                System.out.println("Número no válido. Debe ser mayor que 0.");
            }
        } while (nums[9] == 0);
        for (cont = 0; cont < 10; cont++) {
            System.out.println("Número " + (cont + 1) + ": " + nums[cont]);
        }
    }

    /*
    public void diezNumerosDeGolpe() {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        int aux, cont = 0, contMalos = 0;

        do {

        } while (nums[9] == 0);

    }
     */
    
    public void ejercicioDavid() {
        int aux;
        int[] nums1 = new int[10];
        int[] nums2 = new int[10];
        System.out.println("Rellenar vector 1");
        rellenaVectorInt(nums1);
        System.out.println("Rellenar vector 2");
        rellenaVectorInt(nums2);
        System.out.println("Suma vector 1: " + sumatorioVector(nums1));
        System.out.println("Media del vector 2: " + (sumatorioVector(nums1) / nums2.length));
        for (int c = 0; c < 10; c++) {
            aux = nums1[c] + nums2[c];
            System.out.println("Suma de la posicion " + c + ": " + aux);
        }
    }

    public void ejercicio21() {
        int[] vector = new int[5];
        int tam = vector.length - 1;
        rellenaVectorInt(vector);
        for (int c = tam; c >= 0; c--) {
            System.out.println("Numero de la posicion " + c + ": " + vector[c]);
        }
    }

    public void ejercicio22() {
        int[] vector = new int[10];
        rellenaVectorInt(vector);
        int aux = 0;
        while (aux < 5) {
            System.out.println("Numero: " + vector[aux]);
            aux++;
            System.out.println("Numero: " + vector[vector.length - aux]);
        }
    }

    public void ejercicio23() {
        int[] vector = new int[5];
        rellenaVectorInt(vector);
        int acum1 = 0, acum2 = 0, contCeros = 0;
        int contPos = 0, contNeg = 0;
        for (int c = 0; c < vector.length; c++) {
            if (vector[c] > 0) {
                acum1 = acum1 + vector[c];
                contPos++;
            } else if (vector[c] < 0) {
                acum2 = acum2 + vector[c];
                contNeg++;
            } else {
                contCeros++;
            }
        }
        System.out.println("Media positivos: " + (float) (acum1 / contPos));
        System.out.println("Media negativos: " + (float) (acum2 / contNeg));
        System.out.println("Numero de ceros: " + contCeros);
    }

    public void ejercicio24() {
        int[] vector1 = new int[10];
        int[] vector2 = new int[10];
        rellenaArrayAleatorio(vector1, 1, 25);
        rellenaArrayAleatorio(vector2, 1, 25);
        muestraArrayInt(vector1);
        muestraArrayInt(vector2);
        for(int c = 0; c < vector1.length; c++){
            System.out.println("Array 1 Posicion " + c + ": " + vector1[c]);
            System.out.println("Array 2 Posicion " + c + ": " + vector2[c]);
        }
    }

    /*
    Instanciar dos objetos de la clase action
        uno del paquete javax.xml.ws
        otro del paquete javax.swing
    
    javax.xml.ws.Action obj1 = new javax.xml.ws.Action();
    new javax.swing.Action obj2 =new javax.swing.Action();
    */
    
    /*
    Instancia un objeto de la clase camisa que se encuentra
    en el paquete tienda.articulos usando import.
    e instanciar un objeto de la clase cliente sin usar import
    y que esta en el paquete tienda.usuarios
    
    import tienda.articulos.Camisa
    Camisa c = new Camisa();
    tienda.usuarios.Cliente cli = new tienda.usuarios.Cliente();
    */
    
    public void ejercicio25(){
        int[] vector1 = new int[5];
        int[] vector2 = new int[7];
        int aux = vector1.length + vector2.length;
        int[] vector3 = new int[aux];
        rellenaArrayAleatorio(vector1, 1, 25);
        rellenaArrayAleatorio(vector2, 1, 25);
        vector3 = combinaArraysDeXEnX(vector1, vector2, 3);
        muestraArrayInt(vector3);
    }
    
    public void ejercicioContinue(){
        int i = 0;
        do {
            i++;
            if (i == 5){
                continue;
            }
            System.out.println("Numero: " + i);
        } while (i < 10);
    }
    
    public void ejercicio19(){
        for (int i = 1; i <= 50; i++){
            if(i == 5 || i == 10 || i == 15 || i == 25 || i == 30){
                continue;
            }
            System.out.println("Numero: " + i);
        }
    }
    
    public void ejercicio20(){
        Scanner sc = new Scanner(System.in);
        int aux, acum = 0, sumatorio = 0;
        float media;
        do {
            System.out.println("Introduce un numero: ");
            aux = sc.nextInt();
            if (aux == -1){
                break;
            }
            acum++;
            sumatorio = sumatorio + aux;
            System.out.println("Suma: " + sumatorio);
            media = (float)(sumatorio/acum);
            System.out.println("Media: " + media);
        } while (true);
        System.out.println("FIN");
    }
    
    public void ejercicio32(){
        int[][] tabla = new int[4][4];
        int i, j;
        for (i = 0; i < 4; i++){
            rellenaArrayAleatorio(tabla[i], 0, 9);
        }
        for (i = 0; i < 4; i++){
            System.out.println("\n-----------------");
            for (j = 0; j < 4; j++){
                System.out.print("| " + tabla[i][j] + " ");
            }
            System.out.print("|");
        }
        System.out.println("\n-----------------");
    }
    
}
