


public class FundamentalsP6
{
    public static void main ( String[] args )
    {
         
    int [] array = new int[50];
    
    for (int index = 0; index < array.length ; index++)
    
    {
     array[index] = (int) (Math.random()*100);
    }
     for (int index = 0; index < array.length ; index++)
    
    {
     System.out.print(array[index] + " ");
    }
    
    }
}
 
