public class CountLowerCase {
    public static int countLC(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i)))
                count++;
        }
        return count;
    }
    public static void main(String args[]){
        String str="Hey, I am Durgesh";
        System.out.println(countLC(str)); 
    }
}
