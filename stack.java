
package java128;

public class stack {
    int stack[];
    int capacity;
    int top;
    stack(int size)
    {
        stack=new int[size];
        capacity=size;
        top=-1;
    }
    void push(int x)
    {
        if(top==capacity-1)
        {
            System.out.println("stack overflow");
        }
        else
        {
            top++;
            stack[top]=x;
            System.out.println(x + "is inserted");
        }
    }
    boolean isempty()
    {
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
            
    }
    void pop()
    {
        if(isempty())
        {
            System.out.println("stack overflow");
        }
        else
        {
            System.out.println(stack[top] + "is popped");
            top--;
        }
    }
    int topele()
    {
        return stack[top];
    }
    int size()
    {
        return top+1;
    }
    public static void main(String[] args) {
        stack s=new stack(3);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s.isempty());
        s.pop();
        s.pop();
        System.out.println(s.topele()+" "+s.size());
    }
    
}
