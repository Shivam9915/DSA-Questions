import java.util.HashSet;
public class HashSetCode {
    public static void main(String[] args) {
    // Hashset is a data structure which contains collection of unique elemnts in the set.
    // 1.It is onorderd;
    // 2.It can also contain null values;
    // 3.it contains unique elements.
    // 4.Internally it makes use of hashmap data structure for its implementation.
    // 5.All the operations take O(1) time.
    // 6. we can iterate over  sets using iterartor and by using enhanced loop both.
    // set is basically of three types:
    // 1.HashSet  2.LinkedHashSet  3.TreeSet

     HashSet<Integer> set =new HashSet<>();
            //  add operation O(1)
            set.add(1);
            set.add(2);
            set.add(3);
            set.add(2);
            set.add(3);
            set.add(6);
            System.out.println(set);

            // remove operation O(1)
            set.remove(6);
            System.out.println(set);

            // conatins opearartion O(1)
            System.out.println("Do we have 5 in the set : "+set.contains(5));

            // just like map it also contains all other method :
            // size()-to get size of the set.
            // clear()-to clear all the elemnts from the set.
            // isEmpty-to check whether the set is empty or not.
    }
}
