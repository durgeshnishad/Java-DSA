import java.util.Scanner;

public class Basics {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a[][]= new int [3][3];
        // Creatin of a 2D Array
        System.out.println("Enter the 3X3 2D Array");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]= in.nextInt();
            }
        }
        // Reading between 2D Array
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
