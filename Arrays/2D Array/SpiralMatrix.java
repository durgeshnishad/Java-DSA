public class SpiralMatrix {
    public static void main(String args[]){
        int a[][]={{1,2,3,4}, 
                    {5,6,7,8}, 
                    {9,10,11,12},
                    {13,14,15,16}};
        int startRow=0, startCol=0, endRow=a.length-1, endCol= a[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            for(int i=startCol;i<=endCol;i++){
                System.out.print(a[startRow][i]+" ");
            }
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(a[i][endCol]+" ");
            }
            for(int i=endCol-1;i>=startCol;i--){
                System.out.print(a[endRow][i]+ " ");
            }
            for(int i=endRow-1;i>=startRow+1;i--){
                System.out.print(a[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }
}
