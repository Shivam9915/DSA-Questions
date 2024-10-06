public class StringMethods {
    // Srting length function :
    public static void stringLength(String str){
        System.out.println("The length of a string is : " +str.length());
    }

    public static void concatenate(String str1,String str2){
                System.out.println("Hello !  "+str1.concat(str2));

    }
    public static void subStrings(String str){
        System.out.println("The substring of a given string from 0 to 20 indices is : "+str.substring(0,20));
    }
    public static void main(String[] args) {
        String str="Awadesh Pratap Singh University";
        // strings length function call 
        stringLength(str);
        // Strings concatination 
        concatenate("Javed", "Ali");
        // substrings of given string str 
        subStrings(str);



    }
}