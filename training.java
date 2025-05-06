
package java128;
interface jpractical
{
    void javatraining();
}
interface tpractical
{
    void testingtraining();
}
class Bepractical
{
    void training()
    {
        System.out.println("Training on technologies");
    }
}
public class training extends Bepractical implements jpractical,tpractical {
    public void javatraining()
    {
        System.out.println("training students on java");
    }
    public void testingtraining()
    {
        System.out.println("training students on manual and automation training");
    }
    public static void main(String[] args) {
        training t=new training();
        t.training();
        t.javatraining();
        t.testingtraining();
        
    }
    
}
