import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test
    public void testConstructor() {
        Theater testTheater = new Theater("Test", 2);
        assertEquals("Theater should have 0 stars before getting reviews", 0, testTheater.stars);
        assertEquals("Theater should have a name of Test", "Test", testTheater.name);
        assertEquals("Theater should have a priceRange value of 2", 2, testTheater.priceRange);
        assertEquals("Theater should have no reviews on creation", 0, testTheater.reviews.size());
    }

    @Test
    public void testGetName () {
        Theater testTheater = new Theater("Test", 1);
        Theater testTheaterTwo = new Theater("TestTwo", 2);
        Theater testTheaterThree = new Theater("TestThree", 3);
        assertEquals("Gets Name", testTheater.name, testTheater.getName());
        assertEquals("Gets Name", testTheaterTwo.name, testTheaterTwo.getName());
        assertEquals("Gets Name", testTheaterThree.name, testTheaterThree.getName());
    }

    @Test
    public void testGetStars() {
        Theater testTheater = new Theater("Test", 1);
        Theater testTheaterTwo = new Theater("TestTwo", 2);
        Theater testTheaterThree = new Theater("TestThree", 3);
        assertEquals("Gets Stars", testTheater.stars, testTheater.getStars());
        assertEquals("Gets Stars", testTheaterTwo.stars, testTheaterTwo.getStars());
        assertEquals("Gets Stars", testTheaterThree.stars, testTheaterThree.getStars());
    }

    @Test
    public void getPriceRange() {
        Theater testTheater = new Theater("Test", 1);
        Theater testTheaterTwo = new Theater("TestTwo", 2);
        Theater testTheaterThree = new Theater("TestThree", 3);
        assertEquals("Gets Price Range", testTheater.priceRange, testTheater.getPriceRange());
        assertEquals("Gets Price Range", testTheaterTwo.priceRange, testTheaterTwo.getPriceRange());
        assertEquals("Gets Price Range", testTheaterThree.priceRange, testTheaterThree.getPriceRange());
    }

    @Test
    public void testToString() {
        Theater testTheater = new Theater("Test", 1);
        Theater testTheaterTwo = new Theater("TestTwo", 2);
        Theater testTheaterThree = new Theater("TestThree", 3);
        assertEquals("Should return a String containing the name, stars, and price of a Theater", "Theater: Test\nOverall Rating: 0 Stars\nPrice Range: $", testTheater.toString());
        assertEquals("Should return a String containing the name, stars, and price of a Theater", "Theater: TestTwo\nOverall Rating: 0 Stars\nPrice Range: $$", testTheaterTwo.toString());
        assertEquals("Should return a String containing the name, stars, and price of a Theater", "Theater: TestThree\nOverall Rating: 0 Stars\nPrice Range: $$$", testTheaterThree.toString());
    }

    @Test
    public void addReview() {
        Theater testTheater = new Theater("Test", 2);
        assertEquals("Theater should have no reviews on creation", 0, testTheater.reviews.size());
        testTheater.addReview("Someone", "Something", 5);
        assertEquals("Theater should have one review", 1, testTheater.reviews.size());
        assertEquals("The one review should be written by 'Someone'", "Someone", testTheater.reviews.get(0).author);
        assertEquals("The one review should contain a body saying 'Something'", "Something", testTheater.reviews.get(0).body);
        assertEquals("The one review should have 5 stars", 5, testTheater.reviews.get(0).stars);
        assertEquals("The one review should be for the Test Theater", testTheater, testTheater.reviews.get(0).restaurant);
    }
}