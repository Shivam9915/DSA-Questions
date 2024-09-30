import java.util.HashMap;
public class Majority {
    public static void main(String[] args) {
        // Given an integer array of size n, Find all elemnts that apppear more tha n/3 times.
        int []nums={1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer>map=new HashMap<>();
        for( int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault((nums[i]), 0)+1);
            
        
    }
    for(Integer keys:map.keySet()){
        if(map.get(keys)>nums.length/3){
            System.out.print(keys);
        }
    
    }

    
}
}
