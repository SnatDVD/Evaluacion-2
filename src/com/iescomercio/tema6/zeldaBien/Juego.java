package com.iescomercio.tema6.zeldaBien;

/**
 * Class Juego - The legend of Zelda.
 *
 * Esta es la clase principal del juego "The legend of Zelda".
 * Este juego es un juego de aventuras simple basado en interfaz textual.
 * Link se ha de desplazar por el Castillo de Hyrule en busca de la habitacion 
 * del tesoro.
 * 
 * Para jugar a este juego, basta con crear un objeto de esta clase 
 * e invocar al metodo jugar.
 *  
 * @author  Michael Kolling and David J. Barnes and Monica
 * @version 2011
 */

public class Juego 
{
    private Parser parser;
    private Habitacion habitacionActual;
        
    /**
     * Constructor por defecto. 
     * Crea el juego e inicializa su configuracion interna.
     */
    public Juego() 
    {
        crearHabitaciones();
        parser = new Parser();
    }

    /**
     * Metodo que crea las habitaciones con sus salidas.
    */
    private void crearHabitaciones()
    {
        Habitacion recibidor, salaTrono, salaTesoro, alaEste, alaOeste, salonPrincesa, mazmorrasEste, mazmorrasOeste;
      
        // Crear las habitaciones
        recibidor = new Habitacion("Entrada principal del Castillo de Hyrule");
        salaTrono = new Habitacion("Salon del trono");
        salaTesoro = new Habitacion("Sala del tesoro");
        alaEste = new Habitacion("Ala este");
        alaOeste = new Habitacion("Ala oeste");
        salonPrincesa = new Habitacion("Salon de la princesa");
        mazmorrasEste = new Habitacion("Mazmorra este");
        mazmorrasOeste = new Habitacion("Mazmorra oeste");
        
        // Crear las salidas
        recibidor.setSalida( "norte", salaTrono );
        
        salaTrono.setSalida( "norte", salaTesoro );
        salaTrono.setSalida( "sur", recibidor );
        salaTrono.setSalida( "este", alaEste );
        salaTrono.setSalida( "oeste", alaOeste );
        
        salaTesoro.setSalida( "arriba", salonPrincesa );
        salaTesoro.setSalida( "sur", salaTrono );
        
        alaEste.setSalida( "oeste", salaTrono );
        alaEste.setSalida( "abajo", mazmorrasEste );
        
        alaOeste.setSalida( "este", salaTrono );
        alaOeste.setSalida( "abajo", mazmorrasOeste );
        
        salonPrincesa.setSalida("abajo", salaTesoro);
        
        mazmorrasEste.setSalida("oeste", mazmorrasOeste);
        mazmorrasEste.setSalida("arriba", alaEste);
        
        mazmorrasOeste.setSalida("este", mazmorrasEste);
        mazmorrasOeste.setSalida("arriba", alaOeste);
        
        habitacionActual = recibidor;  // El juego comienza en el recibidor
    }

    /**
     *  Metodo juego.
     */
    public void juego() 
    {            
        bienvenido();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
                
       boolean haTerminado = false;
        while (! haTerminado) {
            Command command = parser.getCommand();
            haTerminado = procesarComando(command);
        }
        System.out.println("Gracias por jugar. Hasta pronto!!");
    }

    /**
     * Imprime un mensaje de bienvenida para el jugador.
     */
    private void bienvenido()
    {
        System.out.println();
        System.out.println("Bienvenido a The legend of Zelda!");
        System.out.println("Eres Link y tu mision sera encontrar el tesoro del Castillo de Hyrule para rescatar a la Princesa Zelda.");
        System.out.println("Si necesitas ayuda escribe 'ayuda'.");
        System.out.println();
        
        System.out.println(habitacionActual.getDescripcionLarga());
    }

    /**
     * Metodo que, dado un comando escrito por el jugador, lo ejecuta.
     * @param command Comando a procesar.
     * @return true Si el comando finaliza el juego, false en otro caso.
     */
    private boolean procesarComando(Command command) 
    {
        boolean finJuego = false;

        if(command.isUnknown()) {
            System.out.println("No te entiendo...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("ayuda"))
            printAyuda();
        else if (commandWord.equals("ir"))
            irA(command);
        else if (commandWord.equals("fin"))
            finJuego = fin(command);
        else if (commandWord.equals("ver"))
            habitacionActual.getDescripcionLarga();
            
        return finJuego;
    }

    // Implementacion de los comandos del jugador

    /**
     * Metodo que imprime informacion de ayuda.
     */
    private void printAyuda() 
    {
        System.out.println("Estas perdido. Estas solo. Entre tinieblas.");
        System.out.println("En el Castillo de Hyrule.");
        System.out.println();
        System.out.println("Para jugar escribe :");
        parser.showCommands();
    }

    /** 
     * Metodo que intenta que vayas en una direccion. 
     * Si hay salida en esa direccion, te lleva a la habitacion correspondiente.
     * En otro caso, imprime un mensaje de error.
     * 
     */
    private void irA(Command command) 
    {
        if(!command.hasSecondWord()) {
            // Si no hay segunda palabra no sabemos donde ir...
            System.out.println("Ir donde?");
            return;
        }

        String direccion = command.getSecondWord();
        
        // Intento abandonar la habitacion actual
        Habitacion habitacionVecina = habitacionActual.getSalida(direccion);

        if (habitacionVecina == null) {
            System.out.println("No hay puerta en esa direccion!");
        }
        else {
            habitacionActual = habitacionVecina;
            System.out.println(habitacionActual.getDescripcionLarga());
        }
    }

    /** 
     * Metodo que finaliza el juego. 
     * Este metodo verifica el resto del comando para ver si el usuario realmente
     * desea finalizar el juego.
     * @return true, si el comando es "fin", false en otro caso.
     */
    private boolean fin(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("fin que?");
            return false;
        }
        else
            return true;  // señal de que el usuario desea finalizar el juego
    }
}
