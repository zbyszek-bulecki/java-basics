public class HelloWorld {
    public static void main(String[] args) {

      boolean isSnowing = false;
      boolean isRaining = true;
      double temperature = 60;

      if (isRaining || isSnowing || temperature < 50) {
          System.out.println("Let's stay at home.");
          } else System.out.println("Let's go out!");

    }
}