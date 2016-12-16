package com.iescomercio.tema4.arrays;

import java.util.Scanner;

public class Arrays {

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

    private void muestraCaracter(int n, char c) {
        for (int a = 0; a < n; a++) {
            System.out.print(c);
        }
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

    public void diezNumerosDeGolpe() {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        int aux, cont = 0, contMalos = 0;

        do {

        } while (nums[9] == 0);

    }

    public void ejercicioDavid() {
        Scanner sc = new Scanner(System.in);
        int acum = 0, aux, aux2;
        float media;
        int[] nums1 = new int[10];
        int[] nums2 = new int[10];
        
        System.out.println("Introduce 10 numeros :");
        for (int c = 0; c < 10; c++) {
            nums1[c] = sc.nextInt();
        }
        System.out.println("Introduce 10 numeros :");
        for (int c = 0; c < 10; c++) {
            nums2[c] = sc.nextInt();
        }
        for(int c = 0; c < 10; c++) {
            acum = acum + nums1[c];
        }
        System.out.println("Suma total del vector 1: " + acum);
        acum = 0;
        for(int c = 0; c < 10; c++) {
            acum = acum + nums2[c];
        }
        media = (float)(acum/10);
        System.out.println("Media del vector 2: " + media);
        
        for(int c = 0; c < 10; c++) {
            aux = nums1[c] + nums2[c];
            System.out.println("Suma de la posicion " + c + ": " + aux);
        }
    }

}
