public class FirstOccurence {
    public static int firstOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] == target) {
                return start;
            } else if (arr[end] == target) {
                return end;
            }
            start++;
            end--;
        }
        return -1;
    

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;
        System.out.println(firstOccurrence(arr, target));  // Output: 4
    }
}
