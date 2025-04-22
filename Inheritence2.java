
package java128;
class whatsappv1
{
    void chat()
    {
        System.out.println("chatting");
    }
}
class whatsappv2 extends whatsappv1{
    void call()
            {
               System.out.println("make a call"); 
            }
}
class whatsappv3 extends whatsappv2
{
    void status()
    {
        System.out.println("put a status");
    }
}
public class Inheritence2 {

    public static void main(String[] args) {
        whatsappv3 wh=new whatsappv3();
        wh.chat();
        wh.call();
        wh.status();
    }
    
}
