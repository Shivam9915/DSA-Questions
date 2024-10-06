import java.util.Arrays;

public class Anagram {
    public static void isAnagram(String str1,String str2){
        // conert the strings to lower case ...why?...to avoid uppercase comparisons
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()==str2.length()){
            char [] str1charArray=str1.toCharArray();
            char [] str2charArray=str2.toCharArray();

           Arrays.sort(str1charArray);
           Arrays.sort(str2charArray);
           

          boolean results=str1charArray.equals(str2charArray);
           if(results){
               System.out.println("The string "+str1 +" and "+ str2 + " are vaid anagrams");
              }
              else {
               System.out.println("The string "+ str1 +" and "+ str2 + " are not vaid anagrams");
   
   
              }
            
        }
        //   case when lengths are not equal
        else{
          System.out.println("The string "+ str1 + " and "+ str2 +  " are not vaid anagrams");

        }

       
    }
    public static void main(String[] args) {
        String str1="earth";
        String str2="hearth";
        isAnagram(str1, str2);

        
    }
    
}
