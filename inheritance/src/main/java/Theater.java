import java.util.ArrayList;
import java.util.List;

public class Theater extends Restaurant {
    protected List<Movie> movies = new ArrayList<>();

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

    @Override
    public void addReview(String author, String body, int stars, String movie) {
        super.addReview(author, body, stars, getMovie(movie));
    }

    protected Movie getMovie (String name) {
        for (Movie movie : movies) {
            if (movie.name == name) return movie;
        }
        return null;
    }

    public void addMovie(String name, float length, String[] times){
        for (Movie movie : movies) {
            if (movie.name == name) {
                movie = new Movie(name, length, times);
                return;
            }
        }
        movies.add(new Movie(name, length, times));
    }

    public void removeMovie(String name) {
        for (Movie movie : movies) {
            if (movie.name == name) {
                movies.remove(movie);
                return;
            }
        }
    }
}
