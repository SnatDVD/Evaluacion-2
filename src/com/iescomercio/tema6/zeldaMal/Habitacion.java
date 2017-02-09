package com.iescomercio.tema6.zeldaMal;
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
    public String descripcion;
    public Habitacion salidaNorte;
    public Habitacion salidaSur;
    public Habitacion salidaEste;
    public Habitacion salidaOeste;
    public Habitacion salidaArriba;
    public Habitacion salidaAbajo;

    /**
     * Constructor que crea una habitacion descrita con el contenido de descripcion.
     * Por ejemplo, "Sala del trono".
     * Inicialmente la habitacion se crea sin salidas.
     * @param descripcion Descripcion de la habitacion.
     */
    public Habitacion(String descripcion) 
    {
        this.descripcion = descripcion;
    }

    /**
     * Metodo que define las salidas de la habitacion. 
     * Cada direccion lleva a otra habitacion o no hay salida (null).
     * @param norte Salida norte.
     * @param este Salida este.
     * @param sur Salida sur.
     * @param oeste Salida oeste.
     */
    public void setSalidas(Habitacion norte, Habitacion este, Habitacion sur, Habitacion oeste, Habitacion arriba, Habitacion abajo) 
    {
        if(norte != null)
            salidaNorte = norte;
        if(este != null)
            salidaEste = este;
        if(sur != null)
            salidaSur = sur;
        if(oeste != null)
            salidaOeste = oeste;
        if(arriba != null)
            salidaArriba = arriba;
        if(abajo != null)
            salidaAbajo = abajo;
    }

    /**
     * @return La descripcion de la habitacion.
     */
    public String getDescripcion()
    {
        return descripcion;
    }

}
