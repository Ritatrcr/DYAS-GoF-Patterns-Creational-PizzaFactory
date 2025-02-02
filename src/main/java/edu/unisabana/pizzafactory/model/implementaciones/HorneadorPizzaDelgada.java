package edu.unisabana.pizzafactory.model.implementaciones;

// Importación de la interfaz Horneador, que define el comportamiento para hornear la pizza
import edu.unisabana.pizzafactory.model.interfaces.Horneador;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementación de la interfaz {@link Horneador} para pizzas delgadas.
 * Esta clase define el proceso específico de horneado para una pizza delgada.
 *
 * @author andresazcona
 */
public class HorneadorPizzaDelgada implements Horneador {

    /**
     * Método que ejecuta el proceso de horneado para una pizza delgada.
     * Registra un mensaje en el log para indicar que se está horneando la pizza.
     * <p>
     * También incluye una referencia al código que llamaría a un microcontrolador
     * encargado de realizar el proceso de horneado físico.
     */
    @Override
    public void hornear() {
        Logger.getLogger(HorneadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[~~] Horneando la pizza delgada con masa convencional.");

        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
