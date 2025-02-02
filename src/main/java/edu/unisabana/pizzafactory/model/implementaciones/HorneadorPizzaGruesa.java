package edu.unisabana.pizzafactory.model.implementaciones;

// Importación de la interfaz Horneador, que define el comportamiento para hornear la pizza
import edu.unisabana.pizzafactory.model.interfaces.Horneador;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementación de la interfaz {@link Horneador} para pizzas gruesas.
 * Esta clase define el proceso específico de horneado para una pizza gruesa.
 *
 * @author andresazcona
 */
public class HorneadorPizzaGruesa implements Horneador {

    /**
     * Método que ejecuta el proceso de horneado para una pizza gruesa.
     * Registra un mensaje en el log para indicar que se está horneando la pizza.
     *<p>
     * También incluye una referencia al código que llamaría a un microcontrolador
     * encargado de realizar el proceso de horneado físico.
     */
    @Override
    public void hornear() {
        Logger.getLogger(HorneadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[~~] Horneando la pizza gruesa con masa gruesa.");

        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
