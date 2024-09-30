import java.util.TreeSet;

public class TreeSets {

    public static void main(String[] args) {
    //  Tree is similar to HashSet but ony the the key differnce is it gives output in  order.
    // it uses TreeMap for its internal implementation.
    // all the operations are similar to hashset and but takes O(logn) time as it is sorted.

        TreeSet<Integer> tset=new TreeSet<>();
        //  add operation O(1)
         tset.add(1);
         tset.add(2);
         tset.add(3);
         tset.add(2);
         tset.add(3);
         tset.add(6);
        System.out.println(tset);  
        
          // remove operation O(1)
            tset.remove(6);
            System.out.println(tset);

          // conatins opearartion O(1)
          System.out.println("Do we have 5 in the set : "+tset.contains(5));

          
            // just like map and hashset and its types also contains all other method :
            // size()-to get size of the set.
            // clear()-to clear all the elemnts from the set.
            // isEmpty-to check whether the set is empty or not.
    }
}

    

