public class LinearSearchDemo {
    public static void main(String[] args) {
        int[] arr = {4, 8, 15, 16, 23, 42};
        int target = 16;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("Index of " + target + " = " + index);
    }
}
