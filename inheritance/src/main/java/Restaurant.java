import java.util.ArrayList;

public class Restaurant {
    ArrayList<Review> reviews;
    String name;
    int stars;
    int priceRange;

    public Restaurant(String name, int stars, int priceRange) {
        this.name = name;
        this.stars = stars;
        this.priceRange = priceRange;
    }

    public String toString() {
        String finalString = "Restaurant: " + name + "\n" + "Rating: " + stars + " Stars\n" + "Price Range: ";
        for (int i = 0; i < this.priceRange; i++) {
            finalString += "$";
        }
        finalString += "\n";
        return finalString;
    }


}
