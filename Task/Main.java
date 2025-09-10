public class Main {
    public static void main(String[] args) {
        String n = "aAzZ";
        for (int j = 0; j < n.length(); j++) {
            char ch = n.charAt(j);
            if (ch >= 'a' && ch <= 'z') {
                System.out.print((char)(ch - 32));
            } else if (ch >= 'A' && ch <= 'Z') {
                System.out.print((char)(ch + 32));
            } else {
                System.out.print(ch);
            }
        }
    }
}
