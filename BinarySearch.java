// BinarySearch alogorithm 
public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12};
        int target = 10;
        int left = 0;
        int right = numbers.length - 1;
        int answer = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                answer = mid;
                break;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Element found at index: " + answer);
    }
}
