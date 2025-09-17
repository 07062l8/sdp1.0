import java.util.Arrays;

// The director class manages the process of assembling a pizza according to a given recipe
public class PizzaDirector {
    private Builder builder;

    public PizzaDirector(Builder builder) {
        this.builder = builder;
    }

    // Method for creating a specific "Arriva" pizza with predefined parameters
    public Pizza createArrivaPizza() {
        return builder
                .buildSize("30 cm")
                .buildDough("traditional")
                .buildSauce("burger sauce")
                .buildToppings(Arrays.asList("chicken", "ranch sauce", "spicy chicken chorizo", "sweet pepper", "red onion", "tomatoes", "garlic"))
                .buildCheese("mozzarella cheese")
                .buildVegetarian(false)
                .buildPizza();
    }
}
