 //package adder;

 
 public class Main {

    public static void main(String[] args) {


        try 
        {
            int result = addArguments(args);
            if (args.length == 0 ) // checks if arguments are provided and throws error if they are no arguements
            {
                throw new ArrayIndexOutOfBoundsException();
            } 
            System.out.println("The sum of the Arbitrary numbers is: " + result);

        } 
        
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.err.println("Invalid number of arguements/numbers");
        }
        catch(NumberFormatException n)
        {
            System.out.println("Invalid characters");
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
