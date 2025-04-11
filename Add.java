import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int sum=0;
        sum=(int) Math.pow(a,b);
        System.out.println(sum);
}}