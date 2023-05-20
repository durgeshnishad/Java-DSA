// Program to check if a person is eligible to vote or not.

import java.util.*;
public class C1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int age;
        System.out.println("Enter the Age");
        age=sc.nextInt();
        if(age>=18)
            System.out.println("Eligible to Vote");
        else   
            System.out.println("No Eligible to Vote");
    }
}