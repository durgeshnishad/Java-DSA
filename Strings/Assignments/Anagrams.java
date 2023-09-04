import java.util.*;
public class Anagrams{
    public static void main(String args[]){
        String str1= "Earth";
        String str2= "hearts";

        str1=str1.toLowerCase();
        str2= str2.toLowerCase();

        if(str1.length()== str2.length()){
            
            char ch1[]= str1.toCharArray();
            char ch2[]= str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if(Arrays.equals(ch1, ch2))
                System.out.println("Is an Anagram");
            else
                System.out.println("Not an Anagram");
        }
        else
            System.out.println("Not an Anagram");
    }
}