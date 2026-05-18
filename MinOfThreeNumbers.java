public class MinOfThreeNumbers {
    public static void main(String[] args) {
        int a = 12, b = 25, c = 8;
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        System.out.println("Minimum = " + min);
    }
}
