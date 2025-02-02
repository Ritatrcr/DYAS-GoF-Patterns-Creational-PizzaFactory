package edu.unisabana.pizzafactory.model.fabricas;

// Importación de las interfaces necesarias para la fábrica de pizza
import edu.unisabana.pizzafactory.model.interfaces.PizzaFactory;
import edu.unisabana.pizzafactory.model.interfaces.Amasador;
import edu.unisabana.pizzafactory.model.interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.interfaces.Horneador;

// Importación de las implementaciones específicas para la pizza gruesa
import edu.unisabana.pizzafactory.model.implementaciones.AmasadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.implementaciones.MoldeadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.implementaciones.HorneadorPizzaGruesa;

/**
 * Fábrica específica para la creación de pizzas gruesas.
 * Implementa la interfaz {@link PizzaFactory} para proporcionar las
 * instancias adecuadas de amasador, moldeador y horneador.
 *
 * @author andresazcona & cesarvefe
 */
public class PizzaGruesaFactory implements PizzaFactory {

    /**
     * Crea y devuelve un objeto de tipo {@link AmasadorPizzaGruesa},
     * que se encargará de amasar la masa de la pizza gruesa.
     *
     * @return instancia de {@link AmasadorPizzaGruesa}
     */
    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaGruesa();
    }

    /**
     * Crea y devuelve un objeto de tipo {@link MoldeadorPizzaGruesa},
     * que se encargará de moldear la pizza gruesa en la forma deseada.
     *
     * @return instancia de {@link MoldeadorPizzaGruesa}
     */
    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaGruesa();
    }

    /**
     * Crea y devuelve un objeto de tipo {@link HorneadorPizzaGruesa},
     * que se encargará de hornear la pizza gruesa a la temperatura y tiempo adecuados.
     *
     * @return instancia de {@link HorneadorPizzaGruesa}
     */
    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaGruesa();
    }
}
