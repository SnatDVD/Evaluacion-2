package com.iescomercio.tema4.arrays;

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

    public void ejercicio4(int n){
        for (int i = 1; i <= n; i++){
            for (int k = 1; k <= n; k++){
                if (i == 1 || i == n){
                    System.out.print("* ");
                } else if(k == 1 || k == n){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    
    public void ejercicioCuentaAtras(int n){
        int i = n+1, k;
        do {
            i--;
            k=i;
            do {
                System.out.print(k);
                k--;
            } while (k >= 0);
            System.out.println("");
        } while (i >0);
    }
    
    public void ejercicioImpares(int n){
        if (n%2 == 1){
            for (int cont=0; cont<2; cont++){
                for (int a = 1; a <= n; a=a+2){
                    System.out.print(a + ",");
                }
                for (int b = (n-2); b>=1; b=b-2){
                    System.out.print(b + ",");
                }
                System.out.println("");
            }
        }
    }
    
    
}
