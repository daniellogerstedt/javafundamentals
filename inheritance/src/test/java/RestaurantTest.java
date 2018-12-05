import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void testConstructor() {
        Restaurant testRestaurant = new Restaurant("Test", 2);
        assertEquals("Restaurant should have 0 stars before getting reviews", 0, testRestaurant.stars);
        assertEquals("Restaurant should have a name of Test", "Test", testRestaurant.name);
        assertEquals("Restaurant should have a priceRange value of 2", 2, testRestaurant.priceRange);
        assertEquals("Restaurant should have no reviews on creation", 0, testRestaurant.reviews.size());
    }

    @Test
    public void testGetName () {
        Restaurant testRestaurant = new Restaurant("Test", 1);
        Restaurant testRestaurantTwo = new Restaurant("TestTwo", 2);
        Restaurant testRestaurantThree = new Restaurant("TestThree", 3);
        assertEquals("Gets Name", testRestaurant.name, testRestaurant.getName());
        assertEquals("Gets Name", testRestaurantTwo.name, testRestaurantTwo.getName());
        assertEquals("Gets Name", testRestaurantThree.name, testRestaurantThree.getName());
    }

    @Test
    public void testGetStars() {
        Restaurant testRestaurant = new Restaurant("Test", 1);
        Restaurant testRestaurantTwo = new Restaurant("TestTwo", 2);
        Restaurant testRestaurantThree = new Restaurant("TestThree", 3);
        assertEquals("Gets Stars", testRestaurant.stars, testRestaurant.getStars());
        assertEquals("Gets Stars", testRestaurantTwo.stars, testRestaurantTwo.getStars());
        assertEquals("Gets Stars", testRestaurantThree.stars, testRestaurantThree.getStars());
    }

    @Test
    public void getPriceRange() {
        Restaurant testRestaurant = new Restaurant("Test", 1);
        Restaurant testRestaurantTwo = new Restaurant("TestTwo", 2);
        Restaurant testRestaurantThree = new Restaurant("TestThree", 3);
        assertEquals("Gets Price Range", testRestaurant.priceRange, testRestaurant.getPriceRange());
        assertEquals("Gets Price Range", testRestaurantTwo.priceRange, testRestaurantTwo.getPriceRange());
        assertEquals("Gets Price Range", testRestaurantThree.priceRange, testRestaurantThree.getPriceRange());
    }

    @Test
    public void testToString() {
        Restaurant testRestaurant = new Restaurant("Test", 1);
        Restaurant testRestaurantTwo = new Restaurant("TestTwo", 2);
        Restaurant testRestaurantThree = new Restaurant("TestThree", 3);
        assertEquals("Should return a String containing the name, stars, and price of a restaurant", "Restaurant: Test\nOverall Rating: 0 Stars\nPrice Range: $\n", testRestaurant.toString());
        assertEquals("Should return a String containing the name, stars, and price of a restaurant", "Restaurant: TestTwo\nOverall Rating: 0 Stars\nPrice Range: $$\n", testRestaurantTwo.toString());
        assertEquals("Should return a String containing the name, stars, and price of a restaurant", "Restaurant: TestThree\nOverall Rating: 0 Stars\nPrice Range: $$$\n", testRestaurantThree.toString());
    }

    @Test
    public void addReview() {
        Restaurant testRestaurant = new Restaurant("Test", 2);
        assertEquals("Restaurant should have no reviews on creation", 0, testRestaurant.reviews.size());
        testRestaurant.addReview("Someone", "Something", 5);
        assertEquals("Restaurant should have one review", 1, testRestaurant.reviews.size());
        assertEquals("The one review should be written by 'Someone'", "Someone", testRestaurant.reviews.get(0).author);
        assertEquals("The one review should contain a body saying 'Something'", "Something", testRestaurant.reviews.get(0).body);
        assertEquals("The one review should have 5 stars", 5, testRestaurant.reviews.get(0).stars);
        assertEquals("The one review should be for the Test restaurant", testRestaurant, testRestaurant.reviews.get(0).restaurant);
    }
}