public class Operator {
    public static void main(String[] args){
        int a =10, b =20;
        System.err.println(a+ " "+b);
        int[] c = {1,2,3,4,5};
        System.out.println(c.length);
        System.out.println(c.getClass().getName());
        for (int i =0;i<c.length;i++){
            for (int j =0; j<c.length;j++){
                if(c[i]+c[j] == 7){
                    System.out.println(i+""+c[i]+"\t"+c[j]);
                    // break;
                }
                // System.out.print("\n"+c[j]+"\t"+j);
            }
        }
    }
}
