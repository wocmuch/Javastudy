package Calculation;
import java.util.Objects;
import java.util.Scanner;
public class demo extends Exception{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入计算式如xxx");
            String s1=sc.nextLine();
            Cin cin=new Cin();
        try{
            cin.cin(s1);
        } catch (CinException e) {
            e.printStackTrace();
        }
        Integer i1=Integer.valueOf(s1.substring(0,1));
        int y1=i1.intValue();float x1=(float)y1;
        Integer i2=Integer.valueOf(s1.substring(2,3));
        int y2=i2.intValue();float x2=(float) y2;
        float n=1;
        switch (s1.substring(1,2)){
            case "+":n=x1+x2; break;
            case "-":n=x1-x2; break;
            case "*":n=x1*x2; break;
            case "/":n=x1/x2; break;
            case "^":for(int j=0;j<x2;j++){
                n*=x1;
            }; break;

            default:
                throw new IllegalStateException("Unexpected value: " + s1.substring(1, 2));
        }System.out.println(n);
    }
}
