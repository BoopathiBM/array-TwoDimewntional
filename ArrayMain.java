


public class ArrayMain{
    
    int[][] original;

    public void arrayMain(){

        // method to update values
        EnterValues update = new EnterValues();
        this.original = update.enterValues();
        
        // method to print 2D Array
        PrintArray print1 = new PrintArray();
        print1.printArray(original);
   
       
    }
}
