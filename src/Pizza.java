import java.util.List;

public class Pizza {
    private final String size;
    private final String doughType;
    private final String sauce;
    private final List<String> toppings;
    private final String cheese;
    private final boolean isVegetarian;

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.doughType = builder.doughType;
        this.sauce = builder.sauce;
        this.toppings = builder.toppings;
        this.cheese = builder.cheese;
        this.isVegetarian = builder.isVegetarian;
    }

    public static class Builder{
        private String size;
        private String doughType;
        private String sauce;
        private List<String> toppings;
        private String cheese;
        private boolean isVegetarian;

        public Builder withSize(String size){
            this.size = size;
            return this;
        }

        public Builder doughType(String doughType){
            this.doughType = doughType;
            return this;
        }

        public Builder withSauce(String sauce){
            this.sauce = sauce;
            return this;
        }

        public Builder withToppings(List<String> toppings){
            this.toppings = toppings;
            return this;
        }

        public Builder withCheese(String cheese){
            this.cheese = cheese;
            return this;
        }

        public Builder Vegetarian(boolean isVegetarian){
            this.isVegetarian = isVegetarian;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return String.format(
                "%s pizza with %s dough, %s sauce, %s cheese, toppings: %s [%s]",
                size,
                doughType,
                sauce,
                cheese,
                toppings != null ? String.join(", ", toppings) : "none",
                isVegetarian ? "Vegetarian" : "Non-Vegetarian"
        );
    }
}
