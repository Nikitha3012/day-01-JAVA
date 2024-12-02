import java.util.*;
public class acceptingstringformating
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=String.format("Congratulations %s you won 5 lakhs",a);
        System.out.println(b);
    }
}