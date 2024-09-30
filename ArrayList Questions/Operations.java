import java.util.ArrayList;

public class Operations{
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        //  Operation on ArrayList :
        // 1. add element

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("The ArrayList with added elements are "+list);

        //2. get element 
       int numb= list.get(3);
       System.out.println("The number of index 3 is "+numb);

    // 3. remove element
    list.remove(4);
    System.out.println("The list after deleting an element from the list :"+list);
    // 4. set element
    list.set(4,7);
    System.out.println("The list after adding the del element : "+list);

    // 5. contains elemnt

     System.out.println(list.contains(4));
     System.out.println(list.contains(11));

    //  size of ArrayList
    System.out.println("The size of the ArrayList is :"+list.size());


     //How to print the reverse of an ArrayList
     System.out.println("The reversed List is ");

     for(int i=list.size()-1;i>=0;i--){
        System.out.print(list.get(i));
        System.out.print(" ");
     }
     

    }

}