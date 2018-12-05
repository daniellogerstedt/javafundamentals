# Inheritance Lab 06

##Classes
###Restaurant Class

####Constructor

The Constructor for the restaurant class takes in 2 arguments:

1. Name of Restaurant : String
2. Price Range of Restaurant : int

These arguments are then applied to the instance variables on instantiation. As is the value of 0 for the number of stars.

####getName & getStars & getPriceRange
These methods provide external access to the instance variables by returning the one requested.

####toString (Override)

This method takes the instance variables and returns a string containing them with labels in a human readable format.

####addReview

This method takes in 3 arguments.

1. Author of the review : String
2. Body of the review : String
3. Number of stars : int

It passes the three arguments and "this" into the Review constructor.
This then takes the returned Review instance and adds it to the ArrayList that holds the reviews. After doing so it runs the averageStars method setting the returned value to the stars variable.

####averageStars

This method takes the ArrayList of reviews and iterates through adding all the stars for every review then returns that count divided by the number of reviews.


###Review Class

####Constructor

The Constructor takes in 4 arguments:

1. Author : String
2. Body : String
3. Stars : int
4. Restaurant : Restaurant (Class)

These 4 arguments are then placed inside instance variables.

####toString (Override)

This method uses the instance variables and returns a human readable string containing them.

##Testing

###Command Line/Terminal

Run the following command inside the base directory:

`./gradlew test`