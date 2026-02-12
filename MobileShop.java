package mobileshopmanagement;


public class MobileShop 
{
   Node head;

    public void insertAtHead(int id, String brand, double price) 
    {
        Node newNode = new Node(id, brand, price);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtTail(int id, String brand, double price) 
    {
        Node newNode = new Node(id, brand, price);

        if (head == null) 
        {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) 
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() 
    {
        Node temp = head;
        while (temp != null) 
        {
            System.out.println(temp.mobileId + "  " + temp.brandName + "  " + temp.price);
            temp = temp.next;
        }
    } 
}
