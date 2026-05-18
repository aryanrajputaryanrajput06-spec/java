public class CountVowels {
    public static void main(String[] args) {
        String text = "programming";
        int count = 0;
        for (char ch : text.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) >= 0) {
                count++;
            }
        }
        System.out.println("Vowels in '" + text + "': " + count);
    }
}
