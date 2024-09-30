import java.util.LinkedHashMap;
public class LinkedHashMaps{
    public static void main(String[] args) {
            LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        // Linkedhasmap is data structure which use to store data in the form of key value pair.
        // its a in built data structure .The only difference betwwen LinkedhashMap and hashmap is that linkedhasmap 
         // provide output in isertion order
        // //  its operation also  takes O(1) time .
         //Linkedhasmap internally uses array of doubly-linked list data structure .

            // put operations in hasmap
            lhm.put("India",50);
            lhm.put("Srilanka",90);
            lhm.put("austarlia",80);
            lhm.put("china",90);
            lhm.put("qatar",40);
            System.out.println("Below here we have the list of countries with their population :");
            System.out.println(lhm);

            // get opearation
            int india=lhm.get("India");
            System.out.println("The population of India is : "+india);

            // remove operation
            lhm.remove("china");
            System.out.println("I have removed the china's data from the list : ");
            System.out.println(lhm);

            // containsKey operations 
           boolean ans= lhm.containsKey("qatar");
           System.out.println("Do we have qatar in the list or not : "+ans);

        //    size of the map
        System.out.println("The size of the map is : "+lhm.size());

        // is empty method
        System.out.println("Is our map empty : "+lhm.isEmpty());

        // clear() map.clear() methopd will delete all data from the map;

        // how to iteraste in map
        for(String keys:lhm.keySet()){
            if(lhm.get (keys)>20){
                System.out.print(keys+" : " +lhm.get(keys)+" ");
            }
        }       
         // all of the above opearion take O(1) time in map.
        


    }
        
    }
