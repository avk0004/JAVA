import java.util.*;
public class newT{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = {1,4,2,5,3};
        for(int i = 0;i<ar.length;i++){
            if(ar[i]%2 ==0){
                for(int j =0;j<ar.length-1-i;j=j+2){
                    if(ar[i]>ar[j+2]){
                        int t = ar[j];
                        ar[j] = ar[j+2];
                        ar[j+2] =t;
                    }
                }
            }
            else{
                for(int k=1;k<ar.length-1-i;k=k+2){
                    if(ar[i]<ar[k+2]){
                        int t = ar[k];
                        ar[k] = ar[k+2];
                        ar[k+2] = t;
                    }    
                }

            }
        }
        System.out.println(Arrays.toString(ar));
        sc.close();
    }
}
// output = [5,2,3,4,1]