public class FundamentalsP5
{
    public static void main ( String[] args )
    {
    
        
    String[] movies = {"Minions", "Pixels", "Avengers"};
    for (int index = 0;index< movies.length; index++ )
    {
    System.out.println(movies[index] );
    }
    {
     System.out.print("\n\n");
    }
    String[] song = {"BAD", "Just Right", "Ring My Bell"};
    
    int num = 0;
    
    while (num< song.length-1)
    
   {
       System.out.print(song[num]+ ",");
       num++;
       
    }    
    
    System.out.print(song[song.length-1]);
    }
}
 