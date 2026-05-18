public class FindLargestInArray {
    public static void main(String[] args) {
        int[] arr = {3, 9, 1, 14, 7};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Largest number = " + max);
    }
}
