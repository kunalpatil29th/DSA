public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 11, 7};
        int target = 11;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        System.out.println("Element found at index: " + index);
    }
}
