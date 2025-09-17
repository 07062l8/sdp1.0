import java.util.List;

// Concrete implementation of the builder for creating a Pizza object
public class PizzaBuilder implements Builder {
    private Pizza pizza;

    public PizzaBuilder() {
        this.pizza = new Pizza();
    }

    // Implementation of each build step with builder return (for call chain)
    @Override
    public Builder buildSize(String size) {
        this.pizza.setSize(size);
        return this;
    }

    @Override
    public Builder buildDough(String dough) {
        this.pizza.setDoughType(dough);
        return this;
    }

    @Override
    public Builder buildSauce(String sauce) {
        this.pizza.setSauce(sauce);
        return this;
    }

    @Override
    public Builder buildToppings(List<String> toppings){
        this.pizza.setToppings(toppings);
        return this;
    }

    @Override
    public Builder buildCheese(String cheese) {
        this.pizza.setCheese(cheese);
        return this;
    }

    @Override
    public Builder buildVegetarian(boolean vegetarian) {
        this.pizza.setVegetarian(vegetarian);
        return this;
    }

    // Return the finished Pizza object
    @Override
    public Pizza buildPizza() {
        return pizza;
    }

}
