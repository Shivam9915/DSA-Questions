import java.util.*;
public class FrequentNum {
    public static int mostFrequentNumber(ArrayList <Integer> list,int key){
        Map<Integer,Integer>ma=new HashMap<>();
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)==key){
                ma.put(list.get(i+1),ma.getOrDefault(list.get(i+1), 0)+1);
            }

        }
        int maxCount=0;
        int mostFrequentNum=-1;
        for(Map.Entry <Integer,Integer> entry:ma.entrySet()){
            if(entry.getValue()> maxCount){
                maxCount=entry.getValue();
                mostFrequentNum=entry.getKey();
            }


        }
        return mostFrequentNum;
    }
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        int key=2;

        System.out.println("The most frequent number follwing key is : "+mostFrequentNumber(list, key));
        
    }
    
}
