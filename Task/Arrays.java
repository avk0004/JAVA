import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i =0; i<a;i++){
            System.out.println("input"+a+" "+(i+1));
            arr[i] = sc.nextInt();
        }
    System.err.println(Arrays.tostrings(arr));
    }
}

