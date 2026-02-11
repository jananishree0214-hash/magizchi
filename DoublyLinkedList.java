
package linkedlist;

public class DoublyLinkedList 
{
   Node head;
   Node tail;
   
   void addForword(int data)
   {
       Node n = new Node(data);
       
       if (head==null)
       {
         head=n;
         tail=n;
       }
       else
       {
         tail.next=n;
         n.prev=tail;
         tail=n;
       }
   }
   void addBackword(int data)
   {
       Node n = new Node(data);
       
       if (tail==null)
       {
           head = n;
           tail = n;
       }
       else
       {
         n.next = head;
         head.prev = n;
         head = n;
       }
      
   }
   void insertMiddle(int data, int position) 
   {
        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; i < position - 1; i++) 
        {
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) 
        {
            temp.next.prev = newNode;
        }

        temp.next = newNode;
    }
   void display()
   {
       Node temp = head;
       
       if (head==null)
       {
           System.out.println("list is empty");
       }
       else
       {
           while(temp!=null)
           {
               System.out.println(temp.data+"->" );
               temp = temp.next;
               
                       
           }
       }
       System.out.println("");
      }
   void display1()
   {
       Node temp = tail;
       
       if (tail==null)
       {
           System.out.println("list is empty");
       }
       else
       {
           while(temp!=null)
           {
               System.out.println(temp.data+" ->");
               temp = temp.prev;
           }
       }
   }
}
