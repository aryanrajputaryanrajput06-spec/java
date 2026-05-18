public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000;
        double rate = 5;
        int years = 3;
        double amount = principal * Math.pow(1 + rate / 100, years);
        System.out.println("Compound Interest:");
        System.out.println("Amount = " + amount);
    }
