import java.util.List;

public class Pizza {
    private String size;
    private String doughType;
    private String sauce;
    private List<String> toppings;
    private String cheese;
    private boolean isVegetarian;

    public String getSize() {
        return size;
    }

    public String getDoughType() {
        return doughType;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public String getCheese() {
        return cheese;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setSize(String size){
        this.size = size;
    }

    public void setDoughType(String doughType) {
        this.doughType = doughType;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    @Override
    public String toString() {
        return "🍕 Pizza Details:\n" +
                "- Size: " + size + "\n" +
                "- Dough Type: " + doughType + "\n" +
                "- Sauce: " + sauce + "\n" +
                "- Toppings: " + String.join(", ", toppings) + "\n" +
                "- Cheese: " + cheese + "\n" +
                "- Vegetarian: " + (isVegetarian ? "Yes" : "No");
    }
}