 //package adder;

 
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
        
        int arb =0, sum=0, posOrNeg =0;
        
        if(args[0].equals("-"))
        {
            arb=1;
            posOrNeg=1; // for negative numbers we make it 1
            
        }
        
        for(int i= arb ;i<args.length;i++)
        {
            if(posOrNeg==0)
                sum+=Integer.valueOf(args[i]) ; // for positive numbers

            if(posOrNeg==1)
                sum-=Integer.valueOf(args[i]) ; // for negative numbers
    
        }

        return sum;
    }
}
