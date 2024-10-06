public class Palindrome {
    public static boolean isPalindrome(String str){
        for (int i=0;i<str.length()/2;i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i)){
                // Not a palindrome
                return false;

            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        System.out.println("Is my given string a vaid palindrome : "+isPalindrome(str));
    }
    
}
