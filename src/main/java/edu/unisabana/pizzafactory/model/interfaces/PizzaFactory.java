package edu.unisabana.pizzafactory.model.interfaces;


public interface PizzaFactory {
    Amasador crearAmasador();
    Moldeador crearMoldeador();
    Horneador crearHorneador();
}
