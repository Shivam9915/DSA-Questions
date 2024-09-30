import java.util.HashMap;
public class HashMapCode{
    public static void main(String[] args) {
            HashMap<String,Integer> map=new HashMap<>();
        // hasmap is data structure which use to store data in the form of key value pair.
        // its a in built data structure .
        // it provides unorederd keys as an output and all its operation takes O(1) time .
         //hasmap interanlly uses array of linked list data structure .

            // put operations in hasmap
            map.put("India",50);
            map.put("Srilanka",90);
            map.put("austarlia",35);
            map.put("china",90);
            map.put("qatar",40);
            System.out.println("Below here we have the list of countries with their population :");
            System.out.println(map);

            // get opearation
            int india=map.get("India");
            System.out.println("The population of India is : "+india);

            // remove operation
            map.remove("china");
            System.out.println("I have removed the china's data from the list : ");
            System.out.println(map);

            // containsKey operations 
           boolean ans= map.containsKey("qatar");
           System.out.println("Do we have qatar in the list or not : "+ans);

        //    size of the map
        System.out.println("The size of the map is : "+map.size());

        // is empty method
        System.out.println("Is our map empty : "+map.isEmpty());

        // clear() map.clear() methopd will delete all data from the map;

        // how to iteraste in map
        for(String keys:map.keySet()){
            if(map.get (keys)>20){
                System.out.print(keys+" : " +map.get(keys)+" ");
            }
        }       
         // all of the above opearion take O(1) time in map.
        


    }
    
}