package edu.unisabana.pizzafactory.model.implementaciones;
import edu.unisabana.pizzafactory.model.interfaces.Amasador;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AmasadorPizzaIntegral implements Amasador{
    public void amasar() {
        Logger.getLogger(AmasadorPizzaIntegral.class.getName())
                .log(Level.INFO, "Amasando pizza integral.");
    }
}

