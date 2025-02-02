package edu.unisabana.pizzafactory.consoleview;

// Importación de las fábricas de pizza
import edu.unisabana.pizzafactory.model.fabricas.PizzaDelgadaFactory;
import edu.unisabana.pizzafactory.model.fabricas.PizzaGruesaFactory;
import edu.unisabana.pizzafactory.model.fabricas.PizzaIntegralFactory;

// Importación de las interfaces necesarias para el proceso de preparación
import edu.unisabana.pizzafactory.model.interfaces.Amasador;
import edu.unisabana.pizzafactory.model.interfaces.Horneador;
import edu.unisabana.pizzafactory.model.interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.interfaces.PizzaFactory;

// Importación de clases adicionales del modelo
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Tamano;

// Importación de utilidades de Java
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase encargada de gestionar la preparación de pizzas mediante un menú interactivo.
 * Permite al usuario seleccionar un tipo de pizza, un tamaño y proceder con la preparación.
 *
 * @author andresazcona & cesarvefe
 */
public class PreparadorPizza {

    // Scanner para la entrada de datos del usuario
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Método principal que ejecuta el programa en un bucle hasta que el usuario elija salir.
     */
    public static void main(String[] args) {
        while (true) {
            mostrarMenu(); // Mostrar el menú de opciones al usuario

            int opcion = scanner.nextInt(); // Leer la opción seleccionada
            scanner.nextLine(); // Consumir el salto de línea para evitar problemas con el siguiente input

            if (opcion == 4) { // Opción para salir del programa
                System.out.println("Saliendo del programa...");
                break;
            }

            PizzaFactory factory = seleccionarFabrica(opcion); // Seleccionar la fábrica según la opción
            if (factory == null) { // Validar si la opción es incorrecta
                System.out.println("Opción no válida. Intente de nuevo.");
                continue;
            }

            try {
                // Solicitar el tamaño de la pizza al usuario
                System.out.println("Seleccione el tamaño de la pizza (1: Pequeño, 2: Mediano):");
                int tamanoOpcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                // Determinar el tamaño en función de la opción ingresada
                Tamano tamano = (tamanoOpcion == 1) ? Tamano.PEQUENO : Tamano.MEDIANO;

                // Definir los ingredientes por defecto de la pizza
                Ingrediente[] ingredientes = new Ingrediente[]{
                        new Ingrediente("queso", 1),
                        new Ingrediente("jamon", 2)
                };

                // Crear una instancia de PreparadorPizza y proceder con la preparación
                PreparadorPizza pp = new PreparadorPizza();
                pp.prepararPizza(factory, ingredientes, tamano);

            } catch (ExcepcionParametrosInvalidos ex) { // Manejo de excepciones en caso de error en la preparación
                Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE,
                        "Problema en la preparación de la Pizza", ex);
            }
        }
        scanner.close(); // Cerrar el scanner al finalizar el programa
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
