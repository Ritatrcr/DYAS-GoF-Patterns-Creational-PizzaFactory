package edu.unisabana.pizzafactory.model.fabricas;

import edu.unisabana.pizzafactory.model.interfaces.PizzaFactory;
import edu.unisabana.pizzafactory.model.interfaces.Amasador;
import edu.unisabana.pizzafactory.model.interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.interfaces.Horneador;

import edu.unisabana.pizzafactory.model.implementaciones.AmasadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.implementaciones.MoldeadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.implementaciones.HorneadorPizzaDelgada;

import edu.unisabana.pizzafactory.model.*;

public class PizzaDelgadaFactory implements PizzaFactory {
    public Amasador crearAmasador() {
        return new AmasadorPizzaDelgada();
    }
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaDelgada();
    }
    public Horneador crearHorneador() {
        return new HorneadorPizzaDelgada();
    }
}
