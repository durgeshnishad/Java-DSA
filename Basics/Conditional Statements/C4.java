/*  Program to calculate income tac according to the tax slabs
    Income<5L - 0%
    Income between 5L-10L - 20%
    Income>10L - 30%
 */
import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class C4 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int income,tax=0;
        System.out.println("Enter you income");
        income=sc.nextInt();
        if(income<=500000)
            System.out.println("Tax:"+tax);
        else if(income>500000 && income<=1000000){
            tax= (income*20)/100;
            System.out.println("Tax:"+tax);
        }
        else{
            tax=(income*30)/100;
            System.out.println("Tax:"+tax);
        } 
    }
}
