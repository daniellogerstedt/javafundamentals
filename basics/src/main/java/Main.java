import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        int turtleCount = 2;
        int dogCount = 1;
        int catCount = 0;

        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount));
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount));
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount));

        flipNHeads(5);
        flipNHeads(2);

        clock();

    }

    public static String pluralize(String type, int number) {
        if (number != 1) {
            return type + "s";
        }
        return type;
    }

    public static void flipNHeads(int n) {
        int flipCount = 0;
        int headCount = 0;
        while (headCount != n) {
            double flip = Math.random();
            if (flip > 0.5){
                headCount++;
                System.out.println("Heads");
            } else {
                headCount = 0;
                System.out.println("Tails");
            }
            flipCount++;
        }
        System.out.println("It took " + flipCount + " to flip " + n + " heads in a row");
    }

    public static void clock() {
        String current = "HH:mm:ss";
        float cycleCount = 0;
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            String hour = now.getHour() > 9? "" + now.getHour() : "0" + now.getHour();
            String min = now.getMinute() > 9? "" + now.getMinute() : "0" + now.getMinute();
            String sec = now.getSecond() > 9? "" + now.getSecond() : "0" + now.getSecond();
            String time = hour + ":" + min + ":" + sec;
            if (!current.equals(time)) {
                current = hour + ":" + min + ":" + sec;
                String cycles = cycleCount > 1000000000? cycleCount/1000000000 + " GHz"
                        : cycleCount > 1000000? cycleCount/1000000 + " MHz"
                        : cycleCount > 1000? cycleCount/1000 + " KHz"
                        : cycleCount + " Hz";
                System.out.println(current + " " + cycles);
                cycleCount = 0;
            } else {
                cycleCount++;
            }
        }
    }
}

