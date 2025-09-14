public class zz {
    public static void main(String[] args) {
        String  m = "aAZz";
        for (int j =0; j<m.length();j++){
            char ch = m.charAt(j);
            if((ch>='a') && (ch<='z') ){
                System.out.print((char) (ch-31));
                if(ch == 'z'){
                    ch-=58;
                }
            }
            else 
            {if ((ch>='A') && (ch<='Z')){
                System.out.print((char) (ch+32));
                if(ch == 'Z'){
                    ch+=8;
                }
            }
            }
            
        }

    }
}
