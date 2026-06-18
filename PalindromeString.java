public class PalindromeString {
    public static void main(String[] args) {
        String text = "level";
        int left = 0;
        int right = text.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("Palindrome: " + isPalindrome);
    }
}
