public class HelloWorld {
    public static void main(String[] args) {

     int dayOfWeek = 1;
     String schedule;

     switch(dayOfWeek) {
         case 1: schedule = "ARD";
             break;
         case 2: schedule = "POPMAM";
             break;
         case 3: schedule = "chill";
             break;
         case 4: schedule = "studio time";
             break;
         case 5: schedule = "movie night";
             break;
         case 6: schedule = "shopping & chores";
             break;
         case 7: schedule = "studio time";
             break;
         default: schedule = "free";
     } System.out.println(schedule);

    }
}