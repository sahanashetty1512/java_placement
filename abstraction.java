
package java128;
abstract class Hostar
{
    void login()
    {
        System.out.println("Login successful");
    }
    abstract void watch();
}
class Hostarfree extends Hostar
{
    void watch()
    {
        System.out.println("Watch with adds");
    }
}
class Hostarpreimium extends Hostar
{
 void watch()
 {
     System.out.println("Watch without adds");
 }
}
public class abstraction{
    public static void main(String[] args)
    {
        Hostarfree hf=new Hostarfree();
        Hostarpreimium hp=new Hostarpreimium();
        hf.login();
        hf.watch();
        hp.login();
        hp.watch();
    }
}
