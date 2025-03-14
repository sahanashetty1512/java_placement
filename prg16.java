package java128;
class prg16{
    public static void main(String[] args)
    {
        int num=15;
        if(num%2==0&&num%3==0){
            System.out.println("java");
        }
        else if(num%2==0){
            System.out.println("python");
        }
        else if(num%3==0){
            System.out.println("c/c++");
        }
        else
            System.out.println(".net");
                
    }
}