import java.util.Scanner;
class Area
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
{
System.out.print("Choose your option : ");
int value = sc.nextInt();
switch(value)
{
case 1:
System.out.print("Enter r=");
int r=sc.nextInt();
double area=3.14*r*r;
System.out.print("Area of the circle="+area);
break;

case 2:
System.out.print("Enter a=");
int a=sc.nextInt();
area=a*a;
System.out.print("Area of square="+area);
break;

case 3:
System.out.print("Enter l=");
int l=sc.nextInt();
System.out.print("Enter b=");
int b=sc.nextInt();
area=l*b;
System.out.print("Area of rectangle="+area);
break;

case 4:
System.out.print("Enter k=");
int k=sc.nextInt();
System.out.print("Enter h=");
int h=sc.nextInt();
area=0.5*k*h;
System.out.print("Area of triangle"+area);
break;

default:
System.out.print("Invalid shape");
}
}
}
}