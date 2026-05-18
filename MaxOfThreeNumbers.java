public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        int a = 12, b = 25, c = 8;
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("Maximum = " + max);
    }
}
