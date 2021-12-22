public class HelloWorld {
    public static void main(String[] args) {
        String firstName = "Zbyszek";
        String lastName = "Bulecki";
        String fullName = firstName + " " + lastName;

        System.out.println("Hello, my name is " + fullName + ".");
        int lettersInName = firstName.length() + lastName.length();
        System.out.println("There are " + lettersInName + " of letters in my name.");
    }
}
