public class Arrays {
    public static void main(String[] args) {
        int arr[] = {5,30,53,50,15};
        for(int i =0; i<arr.length;i++){
            if( arr[i]%2 == 0){
                System.out.println("Even"+i);
            }
            else{
                System.out.println("Odd"+i);
            }
        }
    }
}

