package edu.unisabana.pizzafactory.model.implementaciones;

// Importación de la interfaz Amasador, que define el comportamiento para amasar la masa de la pizza
import edu.unisabana.pizzafactory.model.interfaces.Amasador;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AmasadorPizzaGruesa implements Amasador {
    public void amasar() {
        Logger.getLogger(AmasadorPizzaGruesa.class.getName())
                .log(Level.INFO, "Amasando pizza gruesa.");
    }
}