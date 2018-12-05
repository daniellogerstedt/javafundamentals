import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void testConstructor() {
        Shop testShop = new Shop("Test", 2);
        assertEquals("Shop should have 0 stars before getting reviews", 0, testShop.stars);
        assertEquals("Shop should have a name of Test", "Test", testShop.name);
        assertEquals("Shop should have a priceRange value of 2", 2, testShop.priceRange);
        assertEquals("Shop should have no reviews on creation", 0, testShop.reviews.size());
    }

    @Test
    public void testGetName () {
        Shop testShop = new Shop("Test", 1);
        Shop testShopTwo = new Shop("TestTwo", 2);
        Shop testShopThree = new Shop("TestThree", 3);
        assertEquals("Gets Name", testShop.name, testShop.getName());
        assertEquals("Gets Name", testShopTwo.name, testShopTwo.getName());
        assertEquals("Gets Name", testShopThree.name, testShopThree.getName());
    }

    @Test
    public void testGetStars() {
        Shop testShop = new Shop("Test", 1);
        Shop testShopTwo = new Shop("TestTwo", 2);
        Shop testShopThree = new Shop("TestThree", 3);
        assertEquals("Gets Stars", testShop.stars, testShop.getStars());
        assertEquals("Gets Stars", testShopTwo.stars, testShopTwo.getStars());
        assertEquals("Gets Stars", testShopThree.stars, testShopThree.getStars());
    }

    @Test
    public void getPriceRange() {
        Shop testShop = new Shop("Test", 1);
        Shop testShopTwo = new Shop("TestTwo", 2);
        Shop testShopThree = new Shop("TestThree", 3);
        assertEquals("Gets Price Range", testShop.priceRange, testShop.getPriceRange());
        assertEquals("Gets Price Range", testShopTwo.priceRange, testShopTwo.getPriceRange());
        assertEquals("Gets Price Range", testShopThree.priceRange, testShopThree.getPriceRange());
    }

    @Test
    public void testToString() {
        Shop testShop = new Shop("Test", 1);
        Shop testShopTwo = new Shop("TestTwo", 2);
        Shop testShopThree = new Shop("TestThree", 3);
        assertEquals("Should return a String containing the name, stars, and price of a Shop", "Shop: Test\nOverall Rating: 0 Stars\nPrice Range: $", testShop.toString());
        assertEquals("Should return a String containing the name, stars, and price of a Shop", "Shop: TestTwo\nOverall Rating: 0 Stars\nPrice Range: $$", testShopTwo.toString());
        assertEquals("Should return a String containing the name, stars, and price of a Shop", "Shop: TestThree\nOverall Rating: 0 Stars\nPrice Range: $$$", testShopThree.toString());
    }

    @Test
    public void addReview() {
        Shop testShop = new Shop("Test", 2);
        assertEquals("Shop should have no reviews on creation", 0, testShop.reviews.size());
        testShop.addReview("Someone", "Something", 5);
        assertEquals("Shop should have one review", 1, testShop.reviews.size());
        assertEquals("The one review should be written by 'Someone'", "Someone", testShop.reviews.get(0).author);
        assertEquals("The one review should contain a body saying 'Something'", "Something", testShop.reviews.get(0).body);
        assertEquals("The one review should have 5 stars", 5, testShop.reviews.get(0).stars);
        assertEquals("The one review should be for the Test Shop", testShop, testShop.reviews.get(0).restaurant);
    }
}