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

        if(str.equals(str2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
        /*
          str1.compareTo(str2):
          0= same
          +ve: str>str2
          -ve: str1<str2
         */
        if(str1.compareTo(str2)==0)
            System.out.println("Same");
    }   
}
