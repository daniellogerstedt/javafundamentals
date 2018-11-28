import java.util.concurrent.ThreadLocalRandom;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Library {
    /*
     * This is a method that takes in a number of dice and rolls that many d6.
     * It has an input of a primitive integer and an output of an integer array.
     * The rolls are done with the helper function rollDSix which rolls a single d6.
     */
    public static int[] rolls(int numDice) {
        /* Declaration of returned array for storage */
        int[] finalRolls = new int[numDice];
        for (int i = 0; i < numDice; i++) {
            finalRolls[i] = rollDSix();
        }
        return finalRolls;
    }

    /*
     * This method checks for any duplicates in an integer array passed into it.
     * It does this by passing the provided array into a nested for loop that compares each index to all other indexes.
     * For the sake of optimization it uses a third variable to move the starting point of the inside loop as it progresses.
     * This eliminates the duplicate checks against the previously checked indexes decreasing the Time used.
     * It also starts the inside loop at the next index from the one being checked.
     *
     * Meaning after the first cycle the first index is checked against all other indexes,
     * so the inside loop when checking the second index can begin at the third instead of itself or the first.
     */

    public static boolean duplicates(int[] toBeChecked) {
        int start = 0;
        for (int i = 0; i < toBeChecked.length; i++) {
            for (int j = 1 + start; j < toBeChecked.length; j++) {
                if (toBeChecked[i] == toBeChecked[j]) return true;
            }
            start++;
        }
        return false;
    }

    /*
     * This method calculates the average of an integer array.
     * It does this by looping through and adding all numbers to a running total then dividing that total by the length.
     */

    public static int averageValue(int[] arrayOfNumbers) {
        int run = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            run += arrayOfNumbers[i];
        }
        return run/arrayOfNumbers.length;
    }

    /*
     * This method is used to compare the averages of a series of arrays and provide which is lowest.
     * It does this by utilizing the previous averageValue method to find the average and comparing it to a previously stored array average.
     * In the event that it finds a lower average it replaces the previously stored data with the new minimum.
     * It then returns the minimum array.
     */

    public static int[] lowestAverageArray (int[][] matrixToAverage) {
        int currentMinimum = averageValue(matrixToAverage[0]);
        int lowestArrayIndex = 1;
        for (int i = 1; i < matrixToAverage.length; i++) {
            int currentAverage = averageValue(matrixToAverage[i]);
            if (currentMinimum > currentAverage) {
                currentMinimum = currentAverage;
                lowestArrayIndex = i;
            }
        }
        return matrixToAverage[lowestArrayIndex];
    }

    /*
     * This is a helper function intended to just return a single random int between 1 and 6.
     * It does this with the use of the ThreadLocalRandom utility added in Java 1.7
     * the nextInt() method attached takes an origin and boundry and produces
     * the next random integer starting at the origin but before the boundry in the local random seed.
     */

    public static int rollDSix () {
        return ThreadLocalRandom.current().nextInt(1, 7);
    }
}
