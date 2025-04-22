
package java128;
class person
{
    void human()
    {
        System.out.println("He is a human");
    }
}
class walk extends person
{
  void disp()
  {
      System.out.println("Excuting walk");
  }
}
class run extends person
{
    void show()
    {
        System.out.println("Excuting run");
    }
}
public class Inheritence3 {
    public static void main(String[] args) {
        walk w=new walk();
        w.human();
        w.disp();
        run r=new run();
        r.human();
        r.show();
        
       
    }
    
}
