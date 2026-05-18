public class FindSmallestInArray {
    public static void main(String[] args) {
        int[] arr = {3, 9, 1, 14, 7};
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Smallest number = " + min);
    }
}
