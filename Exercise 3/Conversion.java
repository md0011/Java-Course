public class Conversion {

    // Write a function to convert Celsius temperature into Fahrenheit.
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        double celsius = 25.0;
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");

    }
}
