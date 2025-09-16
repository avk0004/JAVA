import java.util.*;
public class Temperatrue_convertor{
    public static void main(String ... args){
        Scanner sc = new Scanner(System.in);
        float C= sc.nextFloat();
        float F= sc.nextFloat();
        float K = sc.nextFloat();
        double ctof = (C*9)/5 +32;
        double ftoc = (F-32)*5/9;
        double ctok = C+273.15;
        double ktoc = K -237.15;
        double ftok = (F-32)*5/9 +273.15;
        double ktof = (K-273.15)*9/5 +32;
        System.out.println("Celsius to Fahrenheit \t"+ctof);
        System.out.println("Fahrenheit to Celsius \t"+ftoc);
        System.out.println("Celsius to Kelvin \t"+ctok);
        System.out.println("Kelvin to Celsius \t"+ktoc);
        System.out.println("Fahrenheit to Kelvin \t"+ftok);
        System.out.println("Kelvin to Fahrenheit \t"+ktof);
        sc.close();
    } 
}