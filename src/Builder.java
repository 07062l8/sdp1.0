import java.util.List;

public interface Builder {
    Builder buildSize(String size);
    Builder buildDough(String dough);
    Builder buildSauce(String sauce);
    Builder buildToppings(List<String> toppings);
    Builder buildCheese(String cheese);
    Builder buildVegetarian(boolean vegetarian);
    Pizza buildPizza();
}

