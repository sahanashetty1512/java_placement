
package java128;
public class constructor2 {
    int capacity;
    constructor2(int a)
    {
        capacity=a;
    }
    public static void main(String[] args) {
        constructor2 c=new constructor2(500);
        System.out.println(c.capacity);
        constructor2 c1=new constructor2(1200);
        System.out.println(c1.capacity);
        constructor2 c2=new constructor2(1400);
        System.out.println(c2.capacity);
        
    }
    
}
