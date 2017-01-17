package com.iescomercio.ejPropuestos.navidad;

import java.util.Scanner;

public class EjerciciosNavidad {

    public void asaltoAlCastillo() {
        Scanner sc = new Scanner(System.in);
        int num, conf = 1;

        do {
            System.out.println("Intoduce el numero de soldados entre 1 y 500.000.");
            System.out.println("Para terminar, introduzca un cero.");
            num = sc.nextInt();
            if (num > 0 && num < 500001) {
                for(int c = 1; c <= num/2; c++){
                    if(num%c == 0){
                        conf++;
                    }
                }
                System.out.println("Numero de posibles configuraciones: " + conf);
                conf = 1;
            } else if (num == 0) {
                System.out.println("Fin.");
            } else {
                System.out.println("Numero no válido");
            }
        } while (num != 0);
    }

    public void losDalton(){
        Scanner sc = new Scanner(System.in);
        int num;
        String aux;
        String[] alturas, altAux;
        
        
        do{
            System.out.println("Introduzca el numero de personas en la viñeta. \n(Indroduzca un cero para terminar)");
            num = sc.nextInt();
            if(num > 0){
                System.out.println("Introduzca en orden el tamaño de los "
                + num + "personajes separados por comas. \n(Solo se procesarán los " + num + " primeros)");
                aux = sc.nextLine();
                
            }
        } while (num != 0);
        
    }
    
}
