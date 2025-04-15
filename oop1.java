
package java128;
class student {
    int age=10;
    String name="Tom";
    void read(){
        System.out.println("Reading");
    }

    public static void main(String[] args) {
        student s=new student();
        System.out.println("program starts");
        System.out.println(s.age);
        System.out.println(s.name);
        s.read();
        System.out.println("program ends");
       
    }
    
}
