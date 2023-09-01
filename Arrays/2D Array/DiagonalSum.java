import java.util.*;

public class DiagonalSum {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        int a[][]={{1,2,3}, {4,5,6}, {7,8,9}};
        int sum=0;
        for(int i=0, j=0; i<a.length && j<a[0].length; i++,j++){
            sum+= a[i][j];
        }
        for(int i=0, j=0; i<a.length && j<a[0].length; i++,j++){
            sum+= a[i][j];
        }
        System.out.println("Sum:"+sum);
    }
}
