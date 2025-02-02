package edu.unisabana.pizzafactory.model.implementaciones;
import edu.unisabana.pizzafactory.model.interfaces.Horneador;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HorneadorPizzaGruesa implements Horneador {
    public void hornear() {
        Logger.getLogger(HorneadorPizzaGruesa.class.getName())
                .log(Level.INFO, "Horneando pizza gruesa.");
    }
}