
package linkedlist;


public class Linkedlist 
{
    
    public static void main(String[] args)
    {
        DoublyLinkedList in = new DoublyLinkedList();
        in.addForword(10);
        in.addForword(20);
        in.addForword(40);
        in.addForword(50);
        in.display();
        in.insertMiddle(30, 3);
         in.display();
    }
}

  
    
    
