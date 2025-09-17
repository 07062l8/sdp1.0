public class Client {
    public static void main(String[] args) {
        // Create a concrete builder for pizza
        Builder pizzaBuilder = new PizzaBuilder();
        // Pass the builder to the director, who manages the build process
        PizzaDirector director = new PizzaDirector(pizzaBuilder);
        // Build a specific pizza using a predefined recipe
        Pizza arriva = director.createArrivaPizza();

        System.out.println(arriva);
    }
}
