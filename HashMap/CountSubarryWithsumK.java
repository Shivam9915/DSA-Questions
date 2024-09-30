import java.util.HashMap;
public class CountSubarryWithsumK {
    public static void kSum(int []arr,int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            else{
                map.put(sum,map.getOrDefault(sum, 0)+1);
            }


        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int []arr={15,-2,2,-8,1,7,10};
        int k=10;
        kSum(arr, k);
        
    }
    
}
