public class Shop extends Restaurant {

    public Shop(String name, int priceRange) {
        super(name, priceRange);
    }

    public String toString() {
        String starPluralize;
        if (stars == 1) starPluralize = "Star"; else starPluralize = "Stars";
        String finalString = "Shop: " + name + "\nOverall Rating: " + stars + " " + starPluralize + "\nPrice Range: ";
        for (int i = 0; i < priceRange; i++) finalString += "$";
        return finalString;
    }

}
