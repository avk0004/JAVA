public class abc1 {
    public static void main(String[] args) {
        String a = "z";
        for (int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if((ch>='a') && (ch<'z')){
                System.out.println( (char)ch-32); 
                if ( ch == 'z'){
                System.out.println((char) (ch-32)-25); 
                }
            }
        }
    }
}
