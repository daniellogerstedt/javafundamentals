public class Review {
    Restaurant restaurant;
    String author;
    String body;
    int stars;

    public Review(String author, String body, int stars, Restaurant restaurant) {
        this.restaurant = restaurant;
        this.author = author;
        this.body = body;
        this.stars = stars;
    }

    public String toString() {
        String finalString = "";
        String starString;
        if (this.stars == 1) starString = "Star"; else starString = "Stars";
        finalString += "Author: " + this.author + "\nRating: " + stars + " " + starString + "\n\n" + body;
        return finalString;
    }


}
