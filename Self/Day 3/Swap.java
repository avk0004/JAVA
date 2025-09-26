public class Swap {
    public static void main(String[] args) {
        int a =5;
        int b =10;
        int c;
        c = b;
        b = a;
        a = c;
        System.out.println(b);
        System.out.println(a);
        a = a^b;
        b = a^b;
        System.out.println(b);
        a = a^b;
        System.out.println(a);
        a = a+b;
        b = a - b;
        System.out.println(b);
        a = a -b;
        System.out.println(a);
    }
}
