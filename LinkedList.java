
package java128;

class LinkedList {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    void insertAtEnd(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
            head=newNode;
        else
        {
          Node temp=head;
          while(temp.next!=null)
              temp=temp.next;
          temp.next=newNode;
        }
    }
    void deleteByValue(int value)
    {
        if(head==null)
            return;
        if(head.data==value)
            head=head.next;
        else
        {
            Node temp=head;
            while(temp.next!=null && temp.next.data!=value)
                temp=temp.next;
            if(temp.next!=null)
                temp.next=temp.next.next;
        }
    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) 
    {
      LinkedList list=new LinkedList();
      list.insertAtEnd(10);
      list.insertAtEnd(20);
      list.display();
      list.deleteByValue(10);
      list.display();
      
    }  
}
