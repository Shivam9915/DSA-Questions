public class LargestString {
    public static void largestString(String []fruits){
        String largest=fruits[0];
       for(int i=1;i<fruits.length;i++){
         if(largest.compareTo(fruits[i])< 0){
            largest=fruits[i];
         }

       }
       System.out.println("The largest string in fruits arr is : "+largest);
    }
    public static void main(String[] args) {
        String []fruits={"Apple","Bananna","Guava","promamgranate"};
        largestString(fruits);
        
    }
    
}
