import java.util.Scanner;
import java.util.InputMismatchException;
public class expp
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      int n,m;
      n=sc.nextInt();
      m=sc.nextInt();
      try{
      double x=n/m;
    }
    catch(InputMismatchException e)
    {
        System.err.println(e.toString()+" Exception 1");
        
    }
    catch(ArithmeticException e)
    {
        System.err.println(e.toString()+" Exception 2");
    }
    finally
    {
        System.out.println("Bye Bye !!");
    }
}
}