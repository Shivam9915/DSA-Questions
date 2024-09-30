import java.util.ArrayList;


public class Maximum{

    public static int maximumNum(ArrayList<Integer> list){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=list.size()-1;i++){
            max=Math.max(max,list.get(i));
            // if(max<list.get(i)){
            //     max=list.get(i);
            // }
        }
        return max;

    }
    public static void swapTwo( ArrayList<Integer> list,int num1,int num2){
        int temp=list.get(num1);
        list.set(num1,list.get(num2));
        list.set(num2,temp);
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(8);
        list.add(12);
        list.add(15);
        list.add(19);
        System.out.println(list);
        int num1=3;
        int num2=5;
        Maximum.swapTwo(list, num1, num2);
        System.out.println(list);
        // int superior=maximumNum(list);
        // System.out.println("The greatest number ammong the  above list is " +superior);
        


    }

}