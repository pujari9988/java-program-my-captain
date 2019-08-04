import java.util.*;
class task1
  {
    public static void main(String args[])
       {
	
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the  radius of circle");
                double rad=sc.nextDouble();
                double p=3.141,soln1,soln2;
                soln1=p*rad*rad;
               soln2=2*p*rad;
              System.out.println("Area of circle"+soln1);
              System.out.println("perimeter of circle"+soln2);

      }


  }