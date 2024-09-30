
import java.util.TreeMap;
public class TreeMaps {

    public static void main(String[] args) {
            TreeMap<String,Integer> tm=new TreeMap<>();
        // Treemap is data structure which use to store data in the form of key value pair.
        // its a in built data structure .it provides keys in an sorted order.
        // //  its operation also  takes O(logn) time .
         //Treemap internally uses red black tree which is a self balncing BST.

            // put operations in hasmap
            tm.put("India",50);
            tm.put("Srilanka",90);
            tm.put("austarlia",80);
            tm.put("china",90);
            tm.put("qatar",40);
            System.out.println("Below here we have the list of countries with their population :");
            System.out.println(tm);

            // get opearation
            int india=tm.get("India");
            System.out.println("The population of India is : "+india);

            // remove operation
            tm.remove("china");
            System.out.println("I have removed the china's data from the list : ");
            System.out.println(tm);

            // containsKey operations 
           boolean ans= tm.containsKey("qatar");
           System.out.println("Do we have qatar in the list or not : "+ans);

        //    size of the map
        System.out.println("The size of the map is : "+tm.size());

        // is empty method
        System.out.println("Is our map empty : "+tm.isEmpty());

        // clear() map.clear() methopd will delete all data from the map;

        // how to iteraste in map
        for(String keys:tm.keySet()){
            if(tm.get (keys)>20){
                System.out.print(keys+" : " +tm.get(keys)+" ");
            }
        }       
         // all of the above opearion take O(1) time in map.
        


    }
        
    }

    

