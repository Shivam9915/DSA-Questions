import java.util.HashMap;
public class ValidAnagram{
    public static boolean isAnagram(String s, String t){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }
                else{
                    map.put(ch,map.get(ch)-1);
                }
            }
            else{
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        // Given two strings s and t returntrue if it is the anagram of s and return false othersise.
        // An anagram is a word or phrase which is formed of another word or phrase,typically using all the lettewrs at once.
        String s="race";
        String t="care";
        String s2="tulip";
        String t2="lupit";
        System.out.println("Is my string a valid anagram : "+isAnagram(s, t));
        

    }
}