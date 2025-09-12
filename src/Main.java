import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pizza myPizza = new Pizza.Builder()
                .size("30 cm")
                .doughType("Thin")
                .sauce("burger sauce")
                .cheese("Mozzarella")
                .toppings(Arrays.asList("Chicken", "Ranch sauce", "Spicy chicken chorizo", "sweet pepper", "red onion", "tomatoes", "garlic"))
                .isVegetarian(false)
                .build();

        System.out.println(myPizza);
    }
}
