public class HelloWorld {
    public static void main(String[] args) {

        public int rollDice() {
            // random num between 0 and (almost) 1
            double randomNumber=(Math.random()*6)+1;
            return (int) randomNumber;
        }
        int roll1 = rollDice;
        int roll2 = rollDice;

        if (roll1 != roll2) {
            System.out.println(roll1+roll2);
        } else {
            int roll3 = rollDice;
            int roll4 = rollDice;
            System.out.println(roll1+roll2+roll3+roll4);
        }

    }
}