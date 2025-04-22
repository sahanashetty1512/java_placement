
package java128;
class Beta
{
    void print()
    {
        System.out.println("Excuting print()...");
    }
}
class Gama extends Beta
{
    
}

public class Inheritence1 {

    public static void main(String[] args) {
        Gama g=new Gama();
        g.print();
        
    }
    
}
