package edu.unisabana.pizzafactory.model.fabricas;

import edu.unisabana.pizzafactory.model.interfaces.PizzaFactory;
import edu.unisabana.pizzafactory.model.interfaces.Amasador;
import edu.unisabana.pizzafactory.model.interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.interfaces.Horneador;
import edu.unisabana.pizzafactory.model.implementaciones.AmasadorPizzaIntegral;
import edu.unisabana.pizzafactory.model.implementaciones.MoldeadorPizzaIntegral;
import edu.unisabana.pizzafactory.model.implementaciones.HorneadorPizzaIntegral;


public class PizzaIntegralFactory implements PizzaFactory {
    public Amasador crearAmasador() {
        return new AmasadorPizzaIntegral();
    }
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaIntegral();
    }
    public Horneador crearHorneador() {
        return new HorneadorPizzaIntegral();
    }
}
