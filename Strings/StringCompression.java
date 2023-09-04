public class StringCompression {
    public static String sCompression(String str){
        StringBuilder s= new StringBuilder("");
        char ch= str.charAt(0);
        int count =1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==ch)
                count++;
            else{
                s.append(ch).append(count);
                ch=str.charAt(i);
                count=1;
            }
        }
        return s.toString();
    }
    public static void main(String args[]){
        String str= "aaadderrtttthhhhbbb";
        System.out.println(sCompression(str));
    }
}
