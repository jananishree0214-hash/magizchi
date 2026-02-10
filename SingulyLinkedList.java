class SinglyLinkedList 
{
    Node head;

    void insert(int data) 
	{
        Node newNode = new Node(data);

        if (head == null) 
		{
            head = newNode;
        } else 
		{
            Node temp = head;
            while (temp.next != null) 
			{
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void delete(int key) 
	{
        if (head != null && head.data == key) 
		{
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key) 
		{
            temp = temp.next;
        }

        if (temp.next != null) 
		{
            temp.next = temp.next.next;
        }
    }

    void display() 
	{
        Node temp = head;
        while (temp != null) 
		{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}