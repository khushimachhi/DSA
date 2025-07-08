class Solution{


    public static int firstOccurrence(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] == num) {
                return start;
            } else if (arr[end] == num) {
                 end -=1;
            }
            start++;
            end--;
        }
        return -1;
    }

public static int lastOccurrence(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[end] == num) {
                 return end;
            }
            else if (arr[start] == num) {
                start+=1;
            } 
          
            start++;
            end--;
        }
        return -1;
    }
    




    public static void main(String[] args){
        int[] arr = {1,2,5,1,2};
        int num = 2;
        int[] result = {firstOccurrence(arr, num), lastOccurrence(arr, num)}
        System.out.println("print"+ result);
    }
}