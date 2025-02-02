package edu.unisabana.pizzafactory.model.implementaciones;
import edu.unisabana.pizzafactory.model.interfaces.Horneador;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HorneadorPizzaDelgada implements Horneador{
    public void hornear() {
        Logger.getLogger(HorneadorPizzaDelgada.class.getName())
                .log(Level.INFO, "Horneando pizza delgada.");
    }
}
