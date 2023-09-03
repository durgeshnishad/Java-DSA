import java.util.*;
public class Basics {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String str= "Hey", str1, str2;
        // input a word
        str1=in.next();
        // input a sentence
        str2= in.nextLine();
        System.out.println(str+" "+str1+" "+str2);
        System.out.println(str.length());
        System.out.println(str.charAt(1));
    }
}
