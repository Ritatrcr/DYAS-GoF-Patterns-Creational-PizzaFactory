package edu.unisabana.pizzafactory.model.implementaciones;

// Importación de la interfaz Amasador, que define el comportamiento para amasar la masa de la pizza
import edu.unisabana.pizzafactory.model.interfaces.Amasador;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementación de la interfaz {@link Amasador} para pizzas delgadas.
 * Esta clase define el proceso específico de amasado para una pizza delgada.
 *
 * @author andresazcona & cesarvefe
 */
public class AmasadorPizzaDelgada implements Amasador {

    /**
     * Método que ejecuta el proceso de amasado para una pizza delgada.
     * Registra un mensaje en el log para indicar que se está amasando la masa.
     *
     * También incluye una referencia al código que llamaría a un microcontrolador
     * encargado de realizar el proceso de amasado físico.
     */
    @Override
    public void amasar() {
        Logger.getLogger(AmasadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza delgada con masa convencional.");

        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
