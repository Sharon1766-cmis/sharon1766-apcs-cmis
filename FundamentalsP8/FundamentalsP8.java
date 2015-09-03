public class FundamentalsP8
{
    public static void main ( String[] args )
    {
    
        
    String[] art = {"EXO", "BTS", "GOT7"};
    for (int index = 0;index< art.length; index++ )
    {
    System.out.println(art[index] );
    }
    {
     System.out.print("\n\n");
    }
    
    art [((int) (3*Math.random()))] = "Michael Jackson";
    
    for (int index = 0; index<art.length; index++)
    {
        System.out.println(art[index]);
    }
      {
     System.out.print("\n\n");
     
    }
    
     for (int index = 0; index<art.length; index++) 
     {
     if (art[index].equals ("Michael Jackson"))
     {
         System.out.println ("We found Michael !");
        }
        else
        {
             System.out.println ("Michael not found in music" + "["+index+"]");
        }
    }
    
  
    }
}
 