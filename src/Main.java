import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pizza myPizza = new Pizza.Builder()
                .withSize("30 cm")
                .doughType("Thin")
                .withSauce("burger sauce")
                .withCheese("Mozzarella")
                .withToppings(Arrays.asList("Chicken", "Ranch sauce", "Spicy chicken chorizo", "sweet pepper", "red onion", "tomatoes", "garlic"))
                .Vegetarian(false)
                .build();

        System.out.println(myPizza);
    }
}
