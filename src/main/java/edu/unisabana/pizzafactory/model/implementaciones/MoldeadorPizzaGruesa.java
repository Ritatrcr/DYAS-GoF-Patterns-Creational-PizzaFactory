package edu.unisabana.pizzafactory.model.implementaciones;
import edu.unisabana.pizzafactory.model.interfaces.Moldeador;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MoldeadorPizzaGruesa implements Moldeador {

    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza pequena de masa gruesa.");

    }

    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza mediana de masa gruesa.");

    }
}
