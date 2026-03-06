package junit.demo;

public class StringOperations 
{

    public static int length(String s) 
    {
        return s.length();
    }

    public static String reverse(String s) 
    {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static String uppercase(String s) 
    {
        return s.toUpperCase();
    }
}