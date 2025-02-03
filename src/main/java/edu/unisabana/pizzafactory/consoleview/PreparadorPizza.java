package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.fabricas.PizzaDelgadaFactory;
import edu.unisabana.pizzafactory.model.fabricas.PizzaGruesaFactory;
import edu.unisabana.pizzafactory.model.fabricas.PizzaIntegralFactory;
import edu.unisabana.pizzafactory.model.interfaces.Amasador;
import edu.unisabana.pizzafactory.model.interfaces.Horneador;
import edu.unisabana.pizzafactory.model.interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.interfaces.PizzaFactory;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Tamano;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PreparadorPizza {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();

            int opcion = scanner.nextInt(); 
            scanner.nextLine(); 

            if (opcion == 4) { 
                System.out.println("Saliendo del programa...");
                break;
            }

            PizzaFactory factory = seleccionarFabrica(opcion); 
            if (factory == null) { 
                System.out.println("Opción no válida. Intente de nuevo.");
                continue;
            }

            try {
                System.out.println("Seleccione el tamaño de la pizza (1: Pequeño, 2: Mediano):");
                int tamanoOpcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                Tamano tamano = (tamanoOpcion == 1) ? Tamano.PEQUENO : Tamano.MEDIANO;

                Ingrediente[] ingredientes = new Ingrediente[]{
                        new Ingrediente("queso", 1),
                        new Ingrediente("jamon", 2)
                };

                PreparadorPizza pp = new PreparadorPizza();
                pp.prepararPizza(factory, ingredientes, tamano);

            } catch (ExcepcionParametrosInvalidos ex) { 
                Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE,
                        "Problema en la preparación de la Pizza", ex);
            }
        }
        scanner.close(); 
    }

    /**
     * Muestra el menú de selección de tipos de pizza al usuario.
     */
    private static void mostrarMenu() {
        System.out.println("Seleccione el tipo de pizza:");
        System.out.println("1. Pizza Delgada");
        System.out.println("2. Pizza Gruesa");
        System.out.println("3. Pizza Integral");
        System.out.println("4. Salir");
        System.out.print("Ingrese su opción: ");
    }

    /**
     * Devuelve la fábrica de pizza correspondiente a la opción seleccionada.
     *
     * @param opcion número de la opción seleccionada
     * @return una instancia de la fábrica correspondiente o null si la opción es inválida
     */
    private static PizzaFactory seleccionarFabrica(int opcion) {
        switch (opcion) {
            case 1:
                return new PizzaDelgadaFactory(); // Fábrica de pizza delgada
            case 2:
                return new PizzaGruesaFactory(); // Fábrica de pizza gruesa
            case 3:
                return new PizzaIntegralFactory(); // Fábrica de pizza integral
            default:
                return null; // Opción inválida
        }
    }

    /**
     * Realiza el proceso de preparación de una pizza, incluyendo amasado, moldeado,
     * aplicación de ingredientes y horneado.
     *
     * @param factory      la fábrica de pizzas seleccionada
     * @param ingredientes lista de ingredientes de la pizza
     * @param tam          tamaño de la pizza
     * @throws ExcepcionParametrosInvalidos si el tamaño de la pizza es inválido
     */
    public void prepararPizza(PizzaFactory factory, Ingrediente[] ingredientes, Tamano tam)
            throws ExcepcionParametrosInvalidos {
        // Crear instancias de los diferentes procesos de preparación
        Amasador am = factory.crearAmasador();
        Horneador hpd = factory.crearHorneador();
        Moldeador mp = factory.crearMoldeador();

        am.amasar(); // Iniciar el amasado de la masa

        // Determinar el tipo de moldeado según el tamaño de la pizza
        if (tam == Tamano.PEQUENO) {
            mp.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp.moldearPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamaño de pizza inválido: " + tam);
        }

        aplicarIngredientes(ingredientes); // Aplicar los ingredientes a la pizza
        hpd.hornear(); // Hornear la pizza
    }

    /**
     * Aplica los ingredientes a la pizza.
     *
     * @param ingredientes lista de ingredientes a aplicar
     */
    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!: {0}", Arrays.toString(ingredientes));

        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
