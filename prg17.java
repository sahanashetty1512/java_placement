package java128;
class prg17{
    public static void main(String[] args){
        int age=62;
        if(age<12){
            System.out.println("Minor");
        }
        else if(age>=12&&age<=60){
            System.out.println("Noraml");
        }
        else if(age>60){
            System.out.println("senior citizen");
        }
    }
}