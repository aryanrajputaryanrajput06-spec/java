public class FahrenheitToCelsius {
    public static void main(String[] args) {
        double fahrenheit = 77;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Fahrenheit to Celsius:");
        System.out.println(fahrenheit + " F = " + celsius + " C");
    }
}
