import java.util.*;
public class Cal {
    public static void main (String[] args){
        int a = 20;
        int b = 30;
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        if (ch =='+') 
            System.out.println("add"+(a+b));
        else if (ch =='-') 
            System.out.println("Sub"+(a-b));
        else if (ch =='*') 
            System.out.println("mul"+(a*b));
        else if(ch == '/')
            System.out.println("divi"+(a/b));
        else if (ch == '%')
            System.out.println("mod"+(a%b));
        else
            System.out.println("Not Vaild"+ (a^b));


    }
    
}
