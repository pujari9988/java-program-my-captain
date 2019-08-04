import java.util.*;
public class task10
  {

   public static void main(String[] args)

  {
    int i,n;

    System.out.print("Give input number of terms  : ");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();

      for(i=1;i<=n;i++)
     {
     System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));     
    }
 }
}
