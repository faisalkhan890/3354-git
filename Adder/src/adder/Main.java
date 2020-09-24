package adder;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        try {
            int result = addArguments(args);
            System.out.println("The sum of the Arbitrary numbers is: " + result);
        } catch (Exception e) {
            System.err.println("Please provide the number of positive integer number to add");
        }
    }

    private static int addArguments(String[] args) {
        int arb,sum=0;
                  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the arbitrary number you want sum of: ");
        arb = sc.nextInt();
        int a[]=new int[arb]; 

        System.out.println("enter the "+arb+" numbers ");
        for(int i=0;i<arb;i++)
        {      
      System.out.println("enter  number "+(i+1)+":");
                a[i]=sc.nextInt();
                sum += a[i];
        }
      return sum;
        //return Integer.valueOf(args[0]) + Integer.valueOf(args[1]);
    }
}
