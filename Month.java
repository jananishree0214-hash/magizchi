import java.util.Scanner;

class Month
{

  public static void main(String[] args)																																												

 {
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
           
       switch (a) 
{
       case 1:
    System.out.println(" jan and it has 31 days");
       break;

      case 2 :
    System.out.println("feb and it has 29 days");
       break;

      case 3:
   System.out.println("mar and its has 31 days");
       break;

      case 4:
   System.out.println("apr and it has 30 days");
       break;

      case 5 :
  System.out.println("may and it has 31 days");
       break; 

      case 6:    
   System.out.println("june and it has 30 days");

      case 7:
   System.out.println("jul and it has 31 days");

     case 8:
   System.out.println("aug and it has 31 days");

     case 9:
   System.out.println("sep and it has 30 days");
  
     case 10:
   System.out.println("oct and it has 31 days");

     case 11:
   System.out.println("nov and it has 30 days");

     case 12:
   System.out.println("dec and it has 31 days");

      default:
  System.out.println("Invalid Input");
       

} 
   



}




}