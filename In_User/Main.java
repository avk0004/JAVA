import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = (int) a.charAt(0) -48;
		int d = a.length()/2;
        for (int i =0; i<a.length() ;i++){
            char ch = a.charAt(i);
            int c;
            switch(ch){
                case '+':{
                    c = a.charAt(i-d)-48;
                    b +=c;
                break;
                }
                 case '-':{
                    c = a.charAt(i-d)-48;
                    b-=c;
                break;
                }
                case '*':{
                    c = a.charAt(i-d)-48;
                    b*=c;
                break;
                }
                case '/':{
                    c = a.charAt(i-d)-48;
                    b/=c;
                break;
                }
                case '%':{
                    c = a.charAt(i-d)-48;
                    b/=c;
                break;
                }
            }
        }
	   System.out.println(b);

	    
	}
}