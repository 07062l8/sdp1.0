import java.util.List;

// Builder interface defining the steps for making a pizza
public interface Builder {
    Builder buildSize(String size);
    Builder buildDough(String dough);
    Builder buildSauce(String sauce);
    Builder buildToppings(List<String> toppings);
    Builder buildCheese(String cheese);
    Builder buildVegetarian(boolean vegetarian);
    Pizza buildPizza();
}

