public class Theater extends Restaurant {
    public Theater(String name, int priceRange) {
        super(name, priceRange);
    }

    public String toString() {
        String starPluralize;
        if (stars == 1) starPluralize = "Star"; else starPluralize = "Stars";
        String finalString = "Theater: " + name + "\nOverall Rating: " + stars + " " + starPluralize + "\nPrice Range: ";
        for (int i = 0; i < priceRange; i++) finalString += "$";
        return finalString;
    }
}
