import java.util.Scanner;

class Vowels
{

  public static void main(String[] args)																																												

 {
  Scanner sc = new Scanner(System.in);
  char a = sc.next().charAt(0);
           
       switch (a) 
{
       case 'a':
    System.out.println(" a is Vowel");
       break;

      case 'e' :
    System.out.println("b is vowel");
       break;

      case 'i':
   System.out.println("c is Vowel");
       break;

      case 'o':
   System.out.println("d isvowel");
       break;

      case 'u' :
  System.out.println("e is Vowel");
       break;     
   
      default:
  System.out.println("Invalid Input");
       

} 
   



}




}