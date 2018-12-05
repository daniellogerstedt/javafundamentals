import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void testConstructor () {
        Restaurant testRestaurant = new Restaurant("Somewhere", 5);
        Review testReview = new Review("Test", "Test One", 1, testRestaurant);
        assertEquals("Should make a review containing an Author of Test", "Test", testReview.author);
        assertEquals("Should make a review containing a Body of 'Test One'", "Test One", testReview.body);
        assertEquals("Should make a review containing a Stars of 1", 1, testReview.stars);
        assertEquals("Should make a review containing a restaurant of 'testRestaurant'", testRestaurant, testReview.restaurant);

    }

    @Test
    public void testToString() {
        Restaurant testRestaurant = new Restaurant("Somewhere", 5);
        Review testReview = new Review("Test", "Test One", 1, testRestaurant);
        Review testReviewTwo = new Review("TestTwo", "Test Two", 2, testRestaurant);
        Review testReviewThree = new Review("TestThree", "Test Three", 3, testRestaurant);
        assertEquals("Should return a string containing author, body, and stars", "Author: Test\nRating: 1 Star\n\nTest One", testReview.toString());
        assertEquals("Should return a string containing author, body, and stars", "Author: TestTwo\nRating: 2 Stars\n\nTest Two", testReviewTwo.toString());
        assertEquals("Should return a string containing author, body, and stars", "Author: TestThree\nRating: 3 Stars\n\nTest Three", testReviewThree.toString());
    }
}