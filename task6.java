import java.util.*;
 
class task6
{
    public static void main(String []s)
    {
        int num;
              Scanner sc=new Scanner(System.in);
         
        System.out.print("Enter any integer number: ");
        num=sc.nextInt();
         
              if(num>0)
            System.out.println("  ENTERED NUMBER IS POSITIVE NUMBER.");
        else if(num<0)
            System.out.println(" ENTERED NUMBER IS NEGATIVE NUMBER.");
        else
            System.out.println("ENTERED NUMBER IS  ZERO.");
         
    }
}
