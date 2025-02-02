package edu.unisabana.pizzafactory.model.fabricas;

// Importación de las interfaces necesarias para la fábrica de pizza
import edu.unisabana.pizzafactory.model.interfaces.PizzaFactory;
import edu.unisabana.pizzafactory.model.interfaces.Amasador;
import edu.unisabana.pizzafactory.model.interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.interfaces.Horneador;

// Importación de las implementaciones específicas para la pizza integral
import edu.unisabana.pizzafactory.model.implementaciones.AmasadorPizzaIntegral;
import edu.unisabana.pizzafactory.model.implementaciones.MoldeadorPizzaIntegral;
import edu.unisabana.pizzafactory.model.implementaciones.HorneadorPizzaIntegral;

/**
 * Fábrica específica para la creación de pizzas integrales.
 * Implementa la interfaz {@link PizzaFactory} para proporcionar las
 * instancias adecuadas de amasador, moldeador y horneador.
 *
 * @author andresazcona & cesarvefe
 */
public class PizzaIntegralFactory implements PizzaFactory {

    /**
     * Crea y devuelve un objeto de tipo {@link AmasadorPizzaIntegral},
     * que se encargará de amasar la masa de la pizza integral.
     *
     * @return instancia de {@link AmasadorPizzaIntegral}
     */
    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaIntegral();
    }

    /**
     * Crea y devuelve un objeto de tipo {@link MoldeadorPizzaIntegral},
     * que se encargará de moldear la pizza integral en la forma deseada.
     *
     * @return instancia de {@link MoldeadorPizzaIntegral}
     */
    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaIntegral();
    }

    /**
     * Crea y devuelve un objeto de tipo {@link HorneadorPizzaIntegral},
     * que se encargará de hornear la pizza integral a la temperatura y tiempo adecuados.
     *
     * @return instancia de {@link HorneadorPizzaIntegral}
     */
    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaIntegral();
    }
}
