public class MainClass 
{
    public static void main(String[] args) 
    {
        Person p = new Person();
        System.out.print(p.getName() + " ");
        p.setName("John");
        p.setAge(21);
        System.out.print(p.getName() + " ");
        System.out.println(p.getAge());
    }
}