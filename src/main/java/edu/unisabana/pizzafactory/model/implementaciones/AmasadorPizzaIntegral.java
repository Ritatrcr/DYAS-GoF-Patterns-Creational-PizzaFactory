package edu.unisabana.pizzafactory.model.implementaciones;

// Importación de la interfaz Amasador, que define el comportamiento para amasar la masa de la pizza
import edu.unisabana.pizzafactory.model.interfaces.Amasador;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementación de la interfaz {@link Amasador} para pizzas integrales.
 * Esta clase define el proceso específico de amasado para una pizza integral.
 *
 * @author andresazcona
 */
public class AmasadorPizzaIntegral implements Amasador {

    /**
     * Método que ejecuta el proceso de amasado para una pizza integral.
     * Registra un mensaje en el log para indicar que se está amasando la masa.
     * <p>
     * También incluye una referencia al código que llamaría a un microcontrolador
     * encargado de realizar el proceso de amasado físico.
     */
    @Override
    public void amasar() {
        Logger.getLogger(AmasadorPizzaIntegral.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza integral con masa integral.");

        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
