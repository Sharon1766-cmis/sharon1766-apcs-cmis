
public class CardDriver
{
 public static void main ( String[] args )
 
    {
        String [] MyHand = new String[3];
        String [] Cards =  {"1", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"};
        String [] Suit = {"♥", "♦", "♣", "♠"};
        Card Card=new Card();
        Card Car2 = new Card(  "Ferrari" , 2 );
        
        System.out.println(Card);
        System.out.println( Car2);
        
    }
}
