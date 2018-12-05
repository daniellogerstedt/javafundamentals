public class Review {
    protected Restaurant restaurant;
    protected String author;
    protected String body;
    protected int stars;
    protected Movie movie;

    public Review(String author, String body, int stars, Restaurant restaurant) {
        this.restaurant = restaurant;
        this.author = author;
        this.body = body;
        this.stars = stars;
    }

    public Review(String author, String body, int stars, Restaurant restaurant, Movie movie) {
        this.restaurant = restaurant;
        this.author = author;
        this.body = body;
        this.stars = stars;
        this.movie = movie;
    }

    public String toString() {
        String finalString = "";
        String starString;
        if (this.stars == 1) starString = "Star"; else starString = "Stars";
        finalString += "Author: " + this.author + "\nRating: " + stars + " " + starString + "\n\n" + body;
        return finalString;
    }


}
