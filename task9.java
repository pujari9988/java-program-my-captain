import java.util.Scanner;
public class task9 
 {

  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = in.nextDouble();
        System.out.print("Enter the Second number: ");
        double num2= in.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = in.nextDouble();
        System.out.print("The smallest number  is " + smallest(num1,num2,num3)+"\n" );
    }

   public static double smallest(double num1, double num2, double num3)
    {
        return Math.min(Math.min(num1,num2),num3);
    }
}