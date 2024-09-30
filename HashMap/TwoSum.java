import java.util.Arrays;
import java.util.HashMap;
public class TwoSum {
    public static int[] twoSum(int []arr,int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int req_key=target-arr[i];
            if(map.containsKey(req_key)){
                int[]arr2={map.get(req_key),i};
                return arr2;
            
            }
            else{
                map.put(arr[i],i);
            }
        }
        return null;
        
    }
    public static void main(String[] args) {
        int []arr={2,7,11,15};
        int target=9;
        System.out.println("The number that combine to summ of target are from index   "+Arrays.toString(twoSum(arr, target)));

    }
    
}
