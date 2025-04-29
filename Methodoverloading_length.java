
package java128;
class city{
    void visit(int a)
    {
        System.out.println("udupi");
    }
    void visit(int a,int b)
    {
        System.out.println("Mumbai");
    }
    void visit(int a,int b,int c)
    {
        System.out.println("Pune");
    }
}
public class Methodoverloading_length {
    public static void main(String[] args) {
        city c=new city();
        c.visit(10);
        c.visit(10,20);
        c.visit(10,20,30);
       
    }
    
}
