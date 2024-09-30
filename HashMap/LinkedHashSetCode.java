import java.util.LinkedHashSet;
public class LinkedHashSetCode {
    public static void main(String[] args) {
    //  LinkedHashSet is similar to HashSet but ony the the key differnce is it gives output in insertion order.
    // it uses LinkedHashMap for its internal implementation.
    // all the operations are similar to hashset and takes exactly the same time O(1).

        LinkedHashSet<Integer> lh=new LinkedHashSet<>();
        //  add operation O(1)
         lh.add(1);
         lh.add(2);
         lh.add(3);
         lh.add(2);
         lh.add(3);
         lh.add(6);
        System.out.println(lh);  
        
          // remove operation O(1)
            lh.remove(6);
            System.out.println(lh);

          // conatins opearartion O(1)
          System.out.println("Do we have 5 in the set : "+lh.contains(5));

          
            // just like map and hashset it also contains all other method :
            // size()-to get size of the set.
            // clear()-to clear all the elemnts from the set.
            // isEmpty-to check whether the set is empty or not.
    }
}
