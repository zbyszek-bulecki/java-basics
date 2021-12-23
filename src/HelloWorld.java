public class HelloWorld {
    public static void main(String[] args) {

      int dayOfTheWeek = 5;
      boolean holiday;

      if (dayOfTheWeek >= 1 && dayOfTheWeek < 6) {
          holiday = true;
          if (!holiday) {
              System.out.println("Sleep in!");
          } else System.out.println("Wake up at 7:00.");
        }

    }
}