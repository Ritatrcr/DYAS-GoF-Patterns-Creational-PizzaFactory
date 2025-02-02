package edu.unisabana.pizzafactory.model.fabricas;

import edu.unisabana.pizzafactory.model.interfaces.PizzaFactory;
import edu.unisabana.pizzafactory.model.interfaces.Amasador;
import edu.unisabana.pizzafactory.model.interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.interfaces.Horneador;
import edu.unisabana.pizzafactory.model.implementaciones.AmasadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.implementaciones.MoldeadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.implementaciones.HorneadorPizzaGruesa;


public class PizzaGruesaFactory implements PizzaFactory {
    public Amasador crearAmasador() {
        return new AmasadorPizzaGruesa();
    }
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaGruesa();
    }
    public Horneador crearHorneador() {
        return new HorneadorPizzaGruesa();
    }
}
