public class MainClass 
{
    public static void main(String[] args) 
	{

        SinglyLinkedList list = new SinglyLinkedList();

        int[] elements = {25, 32, 45, 6, 24, 52};
        for (int e : elements) 
		{
            list.insert(e);
        }

        list.delete(6);
        list.display();
    }
}