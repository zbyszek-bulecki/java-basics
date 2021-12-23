public class HelloWorld {
    public static void main(String[] args) {

        boolean canSeePlayer = true;
        boolean playerPoweredUp = false;

        if (canSeePlayer) {
            if (!playerPoweredUp) {
                System.out.println("Attack!");
            } else {
                System.out.println("Run away!");
            }
        } else {
            System.out.println("Wander.");
        }


    }
}