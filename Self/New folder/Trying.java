import java.util.*;
public class Trying{
  public static void main(String[] args) {
        int[] arr = {5, 2, 3, 4, 5};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[i]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    temp = arr[j+1];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}