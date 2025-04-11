
public class num5 {

    public static void main(String[] args) {
        int n=1010;
        int r=0;
        int base=2;
        int power=0;
        int sum=0;
        while(n>0)
        {
            r=n%10;
            sum=(int) (sum+r*Math.pow(base,power));
            power++;
            n=n/10;
        }
        System.out.println("Decimal number of corresponding binary number is:"+" "+sum);
    }
    
}
