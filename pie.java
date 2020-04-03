import java.util.Scanner;
public class pie
{
    public static void main(String args[])
    {
        try
        {
            m1();
        }
         catch(Exception e)
        {
            System.out.println(e.toString());
            StackTraceElement[] x=e.getStackTrace();
            for(StackTraceElement i:x)
            {
                System.out.println(i.getClassName());
                System.out.println(i.getLineNumber());
                System.out.println(i.getMethodName());
                System.out.println(i.getFileName()+"\n----------");

            }
        }
    }
    static void m1()
    {
        m2();
    }
     static void m2()
    {
        m3();
    }
     static void m3()
    {
        m4();
    }
     static void m4()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        double x=n/m;
    }
}