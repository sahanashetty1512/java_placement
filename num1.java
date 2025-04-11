
public class num1 {
    public static void main(String[] args) {
        int n=1234;
        int rem=0;
        int count=0;
        while(n>0)
        {
            rem=n%10;
            count++;
            n=n/10;
        }
        System.out.println("count of digits is"+ count);
               
    
}}

