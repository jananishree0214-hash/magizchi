
package mobileshopmanagement;


public class Node 
{
    int mobileId;
    String brandName;
    double price;
    Node next;
    
    public Node( int mobileId,String brandName,double price,Node next)
    {
        int mobileID = 0;
        this.mobileId = mobileID;
        this.brandName = brandName;
        this.price = price;
        this.next = next;
    }

    Node(int id, String brand, double price) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
