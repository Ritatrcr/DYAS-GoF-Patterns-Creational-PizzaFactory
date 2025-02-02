package edu.unisabana.pizzafactory.model.interfaces;

/**
 * Interfaz que define el comportamiento de un horneador.
 * La clase que implemente esta interfaz debe proporcionar la implementación
 * del método {@link #hornear()} para realizar el proceso de horneado de la pizza.
 *
 * @author andresazcona
 */
public interface Horneador {

    /**
     * Método para hornear la pizza.
     * La implementación de este método debe realizar las acciones necesarias para
     * hornear la pizza después de que haya sido amasada y moldeada.
     */
    void hornear();
}
