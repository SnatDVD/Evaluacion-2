package com.iescomercio.tema6.zeldaBien;

import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Class Habitacion - habitacion en el Castillo de Hyrule.
 *
 * Una habitacion representa cualquier localizacion en la escena del juego
 * conectada a otras habitaciones mediante salidas. 
 * Las salidas se etiquetan como norte, este, sur, oeste.
 * Para cada direccion la habitacion almacena una referencia a la habitacion
 * vecina o null si no existe ninguna habitacion en esa direccion.
 * 
 * 
 * @author  Michael Kolling and David J. Barnes and Monica
 * @version 2011
 */

public class Habitacion 
{
    private String descripcion;
            
    private Elemento elemento;
    private Habitacion salidaNorte;
    private Habitacion salidaSur;
    private Habitacion salidaEste;
    private Habitacion salidaOeste;
    private Habitacion salidaArriba;
    private Habitacion salidaAbajo;

    /**
     * Constructor que crea una habitacion descrita con el contenido de descripcion.
     * Por ejemplo, "Sala del trono".
     * Inicialmente la habitacion se crea sin salidas.
     * @param descripcion Descripcion de la habitacion.
     */
    public Habitacion(String descripcion) 
    {
        this.descripcion = descripcion;
        elemento = null;
        salidaNorte = null;
        salidaSur = null;
        salidaEste = null;
        salidaOeste = null;
        salidaArriba = null;
        salidaAbajo = null;
    }
    
    public Habitacion(String descripcion, Elemento elemento) 
    {
        this.descripcion = descripcion;
        this.elemento = elemento;
        salidaNorte = null;
        salidaSur = null;
        salidaEste = null;
        salidaOeste = null;
        salidaArriba = null;
        salidaAbajo = null;
    }
    
    /**
     * Metodo que define una de las salidas de la habitacion. 
     * @param direccion Direccion en la que se encuentra la salida.
     * @param vecina  Habitacion a la que se llega mediante la salida.
     */
    public void setSalida(String direccion, Habitacion vecina) 
    {
        if( direccion.equals("norte") )
           salidaNorte = vecina;
        else if( direccion.equals("sur") ) 
           salidaSur = vecina;
        else if( direccion.equals("este") )
           salidaEste = vecina;
        else if( direccion.equals("oeste") )
           salidaOeste = vecina;
        else if( direccion.equals("arriba") )
           salidaArriba = vecina;
        else if( direccion.equals("abajo") )
           salidaAbajo = vecina;
    }

    /**
     * @return La descripcion de la habitacion.
     */
    public String getDescripcion()
    {
        return descripcion;
    }
    
    private Elemento getElemento(){
        if(elemento == null){
            return null;
        } else{
            return elemento;
        }
    }
    
    public String getDescripcionElemento(){
        if(getElemento() != null)
            return "En la habitacion hay " + getElemento().getDescripcion();
        else
            return "No hay ningun elemento";
    }

    /**
     * Metodo que devuelve la descripcion de la habitacion en la forma
     *     "Estas en la Sala del trono"
     *     "Salidas: norte sur este oeste"
     * @return La descripcion larga de la habitacion.
     */
    public String getDescripcionLarga()
    {
        return "Estas en " + descripcion + ".\n" + getStringDeSalidas();
    }

    /**
     * Metodo que devuelve un String describiendo las salidas de la habitacion.
     * Por ejemplo:
     * "Salidas: norte sur este oeste".
     * @return Los detalles de las salidas de la habitacion.
     */
    private String getStringDeSalidas()
    {
        String returnString = "Salidas";
        
        if( !(salidaNorte == null) )
            returnString += " " + "norte";
        if( !(salidaSur == null) )
            returnString += " " + "sur";
        if( !(salidaEste == null) )
            returnString += " " + "este";
        if( !(salidaOeste == null) )
            returnString += " " + "oeste";
        if( !(salidaArriba == null) )
            returnString += " " + "arriba";
        if( !(salidaAbajo == null) )
            returnString += " " + "abajo";
            
        return returnString;
    }

    /**
     * Metodo que devuelve la habitacion a la que se llega mediante la salida 
     * en la direccion determinada por el parametro.
     * Si no hay salida en esa direccion, devuelve null.
     * @param direccion Direccion de salida.
     * @return La habitacion existente en la direccion dada.
     */
    public Habitacion getSalida(String direccion) 
    {           
        if( direccion.equals("norte") )
           return salidaNorte;
        else if( direccion.equals("sur") ) 
           return salidaSur;
        else if( direccion.equals("este") )
           return salidaEste;
        else if( direccion.equals("oeste") )
           return salidaOeste;
        else if( direccion.equals("arriba") )
           return salidaArriba;
        else if( direccion.equals("abajo") )
           return salidaAbajo;
        else
           return null;
    }
}

