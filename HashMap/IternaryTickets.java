import java.util.HashMap;
public class IternaryTickets{
    public static String getStart(HashMap<String,String>map){
        HashMap<String,String> revmap=new HashMap<>();
        for(String key:map.keySet()){
            revmap.put(map.get(key),key);

        }
        for(String key:map.keySet()){
            if(!revmap.containsKey(key)){
              return key;//start point
            }
        
            
        }
        return null;
    }
    public static void main (String[]args){
        HashMap<String,String>map= new HashMap<>();
        map.put("Chennai","bengalore");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");
        String start=getStart(map);
        System.out.print(start);
        for(String keys:map.keySet()){
            System.out.print("==>"+map.get(start));
            start=map.get(start);
            

        }
       
    }
}