package com.iescomercio.tema5.eurosPesetas;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Numero n = new Numero(28568);

        //System.out.println(n.desglosarPesetas());

        //Dinero d = new Dinero(4268.89);

        //System.out.println(d.desglosar());

//        String texto = new String("3");
//        byte b = Byte.parseByte(texto);
//        System.out.println(Byte.toString(b));
//        short s = Short.parseShort(texto);
//        System.out.println(Short.toString(s));
//        int i = Integer.parseInt(texto);
//        System.out.println(Integer.toString(i));
//        long l = Long.parseLong(texto);
//        System.out.println(Long.toString(l));
//        float f = Float.parseFloat(texto);
//        System.out.println(Float.toString(f));
//        double dou = Double.parseDouble(texto);
//        System.out.println(Double.toString(dou));
        
//        double xd = 5.164;
//        Double xd2 = new Double(xd);
//        String xd3 = xd2.toString();
//        xd = Double.parseDouble(xd3);
//        xd3 = xd + "";
//        xd2 = Double.valueOf(xd3);
//        xd = xd2;
//        System.out.println(xd);

        Scanner sc = new Scanner(System.in);
        int aux = sc.nextInt();
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Random ran = new Random();
        for(int c = 0; c < aux; c++){
            lista.add(ran.nextInt(100));
        }
        System.out.println(lista.toString());

    }
}
