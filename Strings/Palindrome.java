public class Palindrome {
    public static boolean checkPalindrome(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!= s.charAt(s.length()-i-1))
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        String str="noon";
        if(checkPalindrome(str))
            System.out.println("Palindrome");
        else
            System.out.println("No a Palindrome");
    }
}
