public class Pyramid {
    public static void main(String[] args) {
        int n =5;
        for(int i =n;i>=1;i--){
            for(int j =i;j>1;j--){
                System.out.print(" ");
            }
            for(int k=2*n-1;k>=2*i-1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
