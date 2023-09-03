public class ShortestPath{
    public static void main(String args[]){
        String direction="NNNNNSWE";
        int i=0,j=0;
        for( int c=0;c<direction.length();c++){
            if(direction.charAt(c)=='N')
                j++;
            else if(direction.charAt(c)=='S')
                j--;
            else if(direction.charAt(c)=='E')
                i++;
            else
                i--;
        }
        double distance= Math.sqrt(Math.pow(i,2)+Math.pow(j, 2));
        System.out.println("Distance:"+distance);
    }
}