import java.util.ArrayList;
// /brute force approach :
// fint if any sorted arraylist has target sum :
public class TwopairSum {
    public static boolean twopairSum(ArrayList<Integer>list,int target){
        int sum=0;
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size()-1;j++){
            if(list.get(i)+list.get(j)==target){
               return true;
            }
            
             }
            }
            return false;
        }
        // two pointwr approach :

        public static boolean twopairSum2(ArrayList<Integer>list,int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            // updating pointer
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;


        }

       

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=5;
        System.out.println(twopairSum(list, target));
        System.out.println(twopairSum2(list, target));

        
    }
    
}
