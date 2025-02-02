package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.interfaces.Amasador;
import edu.unisabana.pizzafactory.model.interfaces.Horneador;
import edu.unisabana.pizzafactory.model.interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.interfaces.PizzaFactory;

import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Tamano;

public class PreparadorPizza {

    private final PizzaFactory factory;

    public PreparadorPizza(PizzaFactory factory) {
        this.factory = factory;
    }

    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam) 
            throws ExcepcionParametrosInvalidos {
        Amasador am = factory.crearAmasador();
        Moldeador mp = factory.crearMoldeador();
        Horneador hp = factory.crearHorneador();

        am.amasar();
        if (tam == Tamano.PEQUENO) {
            mp.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp.moldearPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamaño de pizza inválido: " + tam);
        }
        hp.hornear();
    }
}
