package edu.unisabana.pizzafactory.model.implementaciones;

// Importación de la interfaz Moldeador, que define el comportamiento para moldear la pizza
import edu.unisabana.pizzafactory.model.interfaces.Moldeador;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementación de la interfaz {@link Moldeador} para pizzas delgadas.
 * Esta clase define el proceso específico de moldeado para pizzas delgadas.
 *
 * @author andresazcona & cesarvefe
 */
public class MoldeadorPizzaDelgada implements Moldeador {

    /**
     * Método que ejecuta el proceso de moldeado para una pizza pequeña de masa delgada.
     * Registra un mensaje en el log para indicar que se está moldeando la pizza pequeña.
     * <p>
     * También incluye una referencia al código que llamaría a un microcontrolador
     * encargado de realizar el proceso de moldeado físico.
     */
    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza pequena de masa convencional.");

        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

    /**
     * Método que ejecuta el proceso de moldeado para una pizza mediana de masa delgada.
     * Registra un mensaje en el log para indicar que se está moldeando la pizza mediana.
     * <p>
     * También incluye una referencia al código que llamaría a un microcontrolador
     * encargado de realizar el proceso de moldeado físico.
     */
    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza mediana de masa convencional.");

        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
