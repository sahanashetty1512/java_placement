
package java128;
class Hotel
{
    void eat(int a)
    {
     System.out.println("Dosa");
    }
    void eat(double a)
    {
        System.out.println("Idly");
    }
    void eat(char a)
    {
        System.out.println("vada");
    }
}

public class Methodoverloading_Type {

    public static void main(String[] args) {
        Hotel H1=new Hotel();
        H1.eat(10);
        H1.eat(12.1);
        H1.eat('a');
    }
    
}
