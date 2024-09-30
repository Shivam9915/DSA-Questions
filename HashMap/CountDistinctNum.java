import java.util.HashSet;
public class CountDistinctNum {
    public static void countNum(int num []){
        HashSet<Integer>set=new HashSet<>();
        for (int i=0;i<num.length;i++){
            set.add(num[i]);
    
        }
        System.out.println("The count of distinct number is : "+set.size());
    }
    public static void main(String[] args) {
        // count distinct numbers in an array :

        int num []={4,3,2,5,6,7,3,4,2,1};

        countNum(num);

        
    }
    
}
