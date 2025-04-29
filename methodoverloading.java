
package java128;
class Amazon
{
    void payment()
    {
        System.out.println("COD");
        
    }
    void payment(String name)
    {
        System.out.println("UPI payment");
    }
    void payment(long cardno,int otp)
    {
        System.out.println("card payment");
    }
    void payment(String username,String pass)
    {
        System.out.println("netbanking");
    }
}
    

public class methodoverloading {

    public static void main(String[] args) {
        Amazon a=new Amazon();
        a.payment();
        a.payment("user");
        a.payment(2424354623131L,4356);
        a.payment("user@123","pass@123");
    }
    
}
