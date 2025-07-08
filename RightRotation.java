class RightRotation {
    public static void main(String[] args) {
        int[] arr ={ 5,6,1,2,3,4};
        int count = 0;
        for (int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                count++;
            }else if(arr[arr.length-1]> arr[0]){
                count++;
            }
            
        }
      
        System.out.print(count);
    }
}