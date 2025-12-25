import java.util.Scanner;

class TrafficLight
{

  public static void main(String[] args)																																												

 {
  Scanner sc = new Scanner(System.in);
  String a = sc.nextLine();
           
       switch (a) 
{
       case "Red":
    System.out.println(" stop");
       break;

      case "Yellow" :
    System.out.println("wait");
       break;

      case "Green":
   System.out.println("go");
       break;

      default:
  System.out.println("Invalid Input");
       

} 
   



}




}