import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        if (str == null){
            return 0;
        }else{
            int count = 0;
            for(int i = 0; i < str.length(); i ++){
                if(str.charAt(i) == 'a' || str.charAt(i) == 'b' || str.charAt(i) == 'c'){
                    count ++;
                }
            }
            return count;
        }
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        if(str.contains("The") || str.contains("the")){
            return true;
        }
        return false;
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        if(str.length() <= 1){
            if(str != null){
                return true;
            }else{
                return false;
            }
        }else{
        int i = 0;
        int j = str.length() - 1;
        
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i ++;
            j --;
        }
        return true;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String test = "theABBAeh";

        //System.out.println("Hi, this is Kelvin, your voice assistant. Please enter a string and hit enter to initiate...eh...bonding activities!");
        System.out.println("Please Enter a string.");
        String input = scan.nextLine();


        System.out.println("Your string contains " + countABC(input) +" a's, b's, or c's");
        System.out.println("Your string DOES " + (containsThe(input) ? "" : "NOT") + " contain the");
        System.out.println("Your string IS " + (isPalindrome(input) ? "":"NOT") + " a palindrome");
    }
}

