
package java128;
class game
{
void play(int n,String name)
{
System.out.println("cricket");
}
void play(String name,int n)
{
    System.out.println("Football");
}
}

public class methodoverloading_sequence {

    public static void main(String[] args) {
        game g=new game();
        g.play("Dhoni", 7);
        g.play(10,"Messi");
    }
    
}
