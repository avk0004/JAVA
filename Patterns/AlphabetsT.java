public class AlphabetsT {
    public static void main(String[] args) {
        for(int i=65;i<70;i++){
            for(int j=65;j<=i;j++){
                char ch = (char) j;
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
