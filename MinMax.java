public class MinMax(){
    public static void main{
        int [] arr ={1,6,2,8,10}

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for(int=0;int < arr.length; int ++){
            min = Math.min(min , arr[i]);
            max = Math.max(max , arr[i]);
        }

        System.out.println("Min value " + min);
        System.out.println("Max value " + max);

        
    }
}