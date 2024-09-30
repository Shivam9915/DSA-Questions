import java.util.ArrayList;

public class Multidimensional {
    public static void main(String[] args) {
        // ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        // ArrayList<Integer> list =new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // mainlist.add(list);
        // ArrayList<Integer> list2=new ArrayList<>();
        // list2.add(5);
        // list2.add(6);
        // list2.add(7);
        // list2.add(8);
        // mainlist.add(list2);
        // // elemetns on mainlist
        // System.out.println(mainlist);
       

        // for(int i=0;i<mainlist.size();i++){
        //     ArrayList<Integer>currlist=mainlist.get(i);
        //     for(int j=0;j<=currlist.size()-1;j++){
        //      System.out.print(currlist.get(j)+" ");
        //     }
        //     System.out.println();
            
        //  }
         ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
         ArrayList<Integer>list1=new ArrayList<>();
         ArrayList<Integer>list2=new ArrayList<>();
         ArrayList<Integer>list3=new ArrayList<>();

         for(int i=1;i<=5;i++){
            list1.add(1*i);
            list2.add(2*i);
            list3.add(3*i);
         }
         mainlist.add(list1);
         mainlist.add(list2);
         mainlist.add(list3);
         System.out.println(mainlist);

        //  itertaion on mainlist elemnts:

        for(int i=0;i<mainlist.size();i++){
           ArrayList<Integer>currlist=mainlist.get(i);
           for(int j=0;j<=currlist.size()-1;j++){
            System.out.print(currlist.get(j)+" ");
           }
           System.out.println();
           
        }
        

        
    }
    
}
