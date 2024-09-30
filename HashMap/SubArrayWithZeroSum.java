import java.util.HashMap;
public class SubArrayWithZeroSum {
    public static void zeroSum(int []arr){
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int length=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(map.containsKey(sum)){
                length=j-map.get(sum);
            }
            else{
                map.put(sum,j);
            }
        }
        System.out.println("The length of largest subarray with zro sum is : "+length);

    }
    public static void main(String[] args) {
        // Find Largest subarray with zero sum ? 
        int []arr={15,-2,2,-8,1,7,10};
        zeroSum(arr);

    }
    
}
