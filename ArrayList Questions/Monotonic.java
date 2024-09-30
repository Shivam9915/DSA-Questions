import java.util.ArrayList;

public class Monotonic {
    public static boolean monotonic(  ArrayList<Integer>list){
        boolean increasing=true;
        boolean decreasing=true;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                increasing=false;
            }
            if(list.get(i+1)>list.get(i)){
                decreasing=false;
            }
        }
        return increasing || decreasing;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println("Is list monotonic or not : "+monotonic(list));
        
    }
    
}
