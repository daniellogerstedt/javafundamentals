import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    protected List<Review> reviews = new ArrayList<>();
    protected String name;
    protected int stars = 0;
    protected int priceRange;

    public Restaurant(String name, int priceRange) {
        this.name = name;
        this.stars = 0;
        this.priceRange = priceRange;
    }

    public String getName () {
        return this.name;
    }

    public int getStars () {
        return this.stars;
    }

    public int getPriceRange () {
        return this.priceRange;
    }

    public String toString() {
        String finalString = "Restaurant: " + name + "\n" + "Overall Rating: " + stars + " Stars\n" + "Price Range: ";
        for (int i = 0; i < this.priceRange; i++) {
            finalString += "$";
        }
        return finalString;
    }

    public void addReview (String author, String body, int stars) {
        Review review = new Review(author, body, stars, this);
        reviews.add(review);
        averageStars();

    }

    private void averageStars () {
        int starCount = 0;
        for (Review review : reviews) {
            starCount += review.stars;
        }
        this.stars = starCount/reviews.size();
    }


}
