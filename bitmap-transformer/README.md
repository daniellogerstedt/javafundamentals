##Bitmap Transformer

###GreyScale (greyScale)
* ####What it does:
    Takes the input image and creates a copy with all colors muted to a grey value representing each color.
* ####How it works:
    Averages the RGB values for each pixel applying the average to all three colors.
* ####Efficiency:
    Big O(n<sup>2</sup>) Time and Big O(n) Space

###Negative (negative)
* ####What it does:
    Takes the input image and creates a copy with all colors are the negative of their original value.
* ####How it works:
    Takes the RGB values and subtracts them from 255 to find the value that is the negative. Applies calculated value to RGB in image data.
* ####Efficiency:
    Big O(n<sup>2</sup>) Time and Big O(n) Space

###Rotate Colors (rotateColors)
* ####What it does:
    Takes the input image and creates a copy with all colors rotated to the next color in the pixel.
* ####How it works:
    Finds and sets each value to next color in the new image.

    (Ex: Red -> Green, Green -> Blue, Blue -> Red)
* ####Efficiency:
    Big O(n<sup>2</sup>) Time and Big O(n) Space

###Randomize (randomize)
* ####What it does:
    Produces a random image.
* ####How it works:
    Takes each pixel and applies a random value to Red, Green, and Blue.
* ####Efficiency:
    Big O(n<sup>2</sup>) Time and Big O(n) Space

###Randomize Structured (randomizeStructured)
* ####What it does:
    Takes the input image and returns an image containing the same structure with random colors replacing all prior colors
* ####How it works:
    When a pixel is looked at if the original color exists in a Hashmap of Color to Integer values (HashMap<Color, Integer>) it will use the integer assigned to that color for the RGB value. If the Color does not exist it will create a random RGB value and put it into the HashMap before assigning the pixel that color.
* ####Efficiency:
    Big O(n<sup>2</sup>) Time and Big O(n) Space