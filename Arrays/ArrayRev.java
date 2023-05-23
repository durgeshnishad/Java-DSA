//program to reverse an array
public class ArrayRev {
    public static void main(String args[]){
        int n[]={1,21,11,33,12,1,87,98};
        int start=0, last=n.length-1, temp=0;
        while(start<last){
            temp= n[start];
            n[start]= n[last];
            n[last]= temp;

            start++;
            last--;
        }
        System.out.print("Reversed Array: ");
        for(int j=0;j<n.length;j++)
            System.out.print(n[j]+" ");
    }
}
