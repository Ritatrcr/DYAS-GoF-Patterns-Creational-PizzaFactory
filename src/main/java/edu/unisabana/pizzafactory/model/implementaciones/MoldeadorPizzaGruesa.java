package edu.unisabana.pizzafactory.model.implementaciones;

// Importación de la interfaz Moldeador, que define el comportamiento para moldear la pizza
import edu.unisabana.pizzafactory.model.interfaces.Moldeador;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementación de la interfaz {@link Moldeador} para pizzas gruesas.
 * Esta clase define el proceso específico de moldeado para pizzas gruesas.
 *
 * @author andresazcona
 */
public class MoldeadorPizzaGruesa implements Moldeador {

    /**
     * Método que ejecuta el proceso de moldeado para una pizza pequeña de masa gruesa.
     * Registra un mensaje en el log para indicar que se está moldeando la pizza pequeña.
     * <p>
     * También incluye una referencia al código que llamaría a un microcontrolador
     * encargado de realizar el proceso de moldeado físico.
     */
    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza pequena de masa gruesa.");

        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

    /**
     * Método que ejecuta el proceso de moldeado para una pizza mediana de masa gruesa.
     * Registra un mensaje en el log para indicar que se está moldeando la pizza mediana.
     * <p>
     * También incluye una referencia al código que llamaría a un microcontrolador
     * encargado de realizar el proceso de moldeado físico.
     */
    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza mediana de masa gruesa.");

        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
