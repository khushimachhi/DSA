public class SecondMax{
    public static void main(String[] args){
        int [] arr ={1,6,2,8,10};

        
        int max = Integer.MIN_VALUE;
        int second= Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] > max){
             second = max;
             max = arr[i];
             
            }else if (second < arr[i]){
                second= arr[i];
            }
        }
        System.out.println("Secon max value " + second);

        
    }
}