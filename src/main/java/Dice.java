public class Dice {
    // Method for generating numbers 1-6
    public int roll() {
        int minValue = 1; // Lowest dice value
        int maxValue = 6; // Highest dice value
        // Generating a random number between 1 and 6
        int randomNumber = (int)(Math.random() * (maxValue - minValue + 1)) + minValue;
        // Returning random number
        return randomNumber;
    }
    public static void main(String[] args) {
        // Creating dice object
        Dice dice = new Dice();

        // Variables to store dice rolls
        int roll1;
        int roll2;

        // Counters for sums
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        // for loop 100 times
        for (int i = 1; i <= 100; i++) {
            // rolling both dice
            roll1 = dice.roll();
            roll2 = dice.roll();

            // Calculating sum
            int sum = roll1 + roll2;

            // Printing out the roll
            System.out.printf("Roll %d: %d - %d Sum: %d%n",i, roll1, roll2, sum);

            // Using switch to count sums
            switch(sum) {
                case 2-> twoCounter++;
                case 4-> fourCounter++;
                case 6-> sixCounter++;
                case 7-> sevenCounter++;
            }
        }
        // Printing results
        System.out.println("twoCounter: " + twoCounter);
        System.out.println("fourCounter: " + fourCounter);
        System.out.println("sixCounter: " + sixCounter);
        System.out.println("sevenCounter: " + sevenCounter);
    }
}
