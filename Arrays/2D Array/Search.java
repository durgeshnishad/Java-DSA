public class Search {
    public static void main(String args[]){
        int a[][]={{1,2,3,4}, 
                    {5,6,7,8}, 
                    {9,10,11,12},
                    {13,14,15,16}};
        int row=0, col=a[0].length-1, key=15;
        while(row<a.length && col>=0){
            if(a[row][col]==key){
                System.out.println("Found at:"+row+++","+col++);
                break;
            }
            else if(a[row][col]>key)
                col--;
            else
                row++;
        }
    }
}
