import java.util.Arrays;

public class LeftRotation{
    public static int[] rotateLeft(int[] arr, int rotation) {
        int n = arr.length;
        rotation = rotation % n;

        for (int i = 0; i < rotation; i++) {
            int first = arr[0];
           
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;  
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotation = 1;

        int[] rotatedArr = rotateLeft(arr, rotation);
        System.out.println(Arrays.toString(rotatedArr));
    }
}
