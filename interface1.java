
package java128;
interface person1
{
int age=24;
void eat();
}
public class interface1 implements person1
{
   @Override
   public void eat()
   {
       System.out.println("uma loves to eat sweet");
   }
   public static void main(String[] args)
   {
       interface1 u=new interface1();
       u.eat();
       System.out.println(u.age);
   }
}

    



   