import java.util.*;
public class NameandAge
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int b=sc.nextInt();
        String c=String.format("The name of the person is "+a+" and age is "+b);
        System.out.println(c);
    }
}