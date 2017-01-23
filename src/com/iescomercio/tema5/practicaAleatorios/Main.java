
package com.iescomercio.tema5.practicaAleatorios;

public class Main {
    public static void main(String[] args) {
        
        Sorteo s = new Sorteo();
        
        //s.listarQuiniela(40, 30, 30);
        
        //s.primitiva();
        
        //s.sorteoSemanal();
        
        //System.out.println(s.terminacionNumFijo(4) + "%");
        
        //System.out.println(s.terminacionNumAleatorio() + "%");
        
        Moneda m = new Moneda();

        //System.out.println(m.lanzar(10));
        
        //m.lanzarConsecutivas(20);
        
        //m.lanzarCanto();
        
        Dado d = new Dado();
        
        //d.lanzarIguales();
        
        Dado d20 = new Dado(20);
        
        //System.out.println(d20.lanzarIguales());
        
        //d20.lanzarTrucado(10);
        
        Bolsa b = new Bolsa(2,8);
        
        //System.out.println("Blancas: " + b.getBlancas());
        //System.out.println("Rojas: " + b.getRojas());
        
        //System.out.println(b.sacarBola());
        //System.out.println(b.sacarBola());
        //System.out.println(b.sacarBola());
        
        //System.out.println("Blancas: " + b.getBlancas());
        //System.out.println("Rojas: " + b.getRojas());
        
        //b.sacarTodas();
        
        BolsaArrayList bol = new BolsaArrayList(1, 3);
        
        bol.sacarTodas();
        bol.reiniciarBolsa();
        bol.sacarTodas();
    }
}
