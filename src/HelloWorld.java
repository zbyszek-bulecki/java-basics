public class HelloWorld {
    public static void main(String[] args) {

        /**
         * Takes temperature in Fahrenheit and converts it to Celsius.
         *
         * @param fahrenheit temperature in Fahrenheit
         * @return temperature in Celsius
         */

        public double fahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }

        /**
         * Prints temperature in both Fahrenheit and Celsius degrees.
         *
         * @param fahrenheit Temperature in degrees Fahrenheit.
         */

        public void printTemperature(double fahrenheit) {
            System.out.println("F: " + fahrenheit);
            System.out.println("C: " + fahrenheitToCelsius(fahrenheit));
        }

    }
}