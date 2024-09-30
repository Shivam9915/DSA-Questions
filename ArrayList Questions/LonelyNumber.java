import java.util.ArrayList;
import java.util.HashMap;

public class LonelyNumber {
    public static ArrayList<Integer> findLonelyNumber(ArrayList<Integer>list){
        ArrayList<Integer>lonely=new ArrayList<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int nums:list){
            if (hm.containsKey(nums)){
                hm.put(nums,hm.get(nums)+1);
            }
            else{
                hm.put(nums,1);
            }

        }
        for(int nums:list){
            if(hm.get(nums)==1 && !hm.containsKey(nums+1) && !hm.containsKey(nums-1)){
                lonely.add(nums);
            }
            
        }
        return lonely;

    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
       System.out.println("The lonely numbers are : "+findLonelyNumber(list));
        
    }
    
}
