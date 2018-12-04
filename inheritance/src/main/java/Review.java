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
        finalString += "Author: " + this.author + "\nRating: " + stars + "Stars\n\n" + body;
        return finalString;
    }
}
