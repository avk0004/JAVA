import java.util.*;
public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OP:
        while(true){
            System.out.print("Rectangle R Triangle T Cricle C Square S Parallelogram P Trapezo if T1 else Q to Quit");
                String str = sc.next();
                if( str.equalsIgnoreCase("Q")) break;
                switch(str){
                    case "C":
                        System.out.print("Enter r");
                        float r = sc.nextFloat();
                        double areaC = Math.PI *r*r;
                        System.out.println("Area of Cricle "+areaC);
                    break;
                    case "S":
                        System.out.print("Enter a");
                        int sl = sc.nextInt();
                        double areaS = sl*sl;
                        System.out.println("area of Square "+areaS);
                    break;
                    case "R":
                        System.out.print("Enter R");
                        int rl = sc.nextInt();
                        System.out.print("Enter L");
                        int rw = sc.nextInt();
                        double areaR = rl*rw;
                        System.out.println("area of Square "+areaR);
                    break;
                    case "T":
                        System.out.print("Enter Tb");
                        double tb = sc.nextDouble();
                        System.out.print("Enter Th");
                        double th = sc.nextDouble();
                        double areaT =tb*th/2;
                        System.out.println("area of Square "+areaT);
                    break;
                    case "P":
                        System.out.print("Enter Tb");
                        double pB = sc.nextDouble();
                        System.out.print("Enter Th");
                        double pH = sc.nextDouble();
                        double areaP =pB*pH/2;
                        System.out.println("area of Square "+areaP);
                    break;
                    case "T1":
                        System.out.print("Enter B1");
                        double B1 = sc.nextDouble();
                        System.out.print("Enter B2");
                        double B2 = sc.nextDouble();
                        System.out.print("Enter B2");
                        double h1 = sc.nextDouble();
                        double areap =(B1+B2)/2 *h1;
                        System.out.println("area of Square "+areap);
                    break;
                    default:
                        System.out.println("Working on it");
                    break OP;
            }

        }
        sc.close();
    }
    
}
