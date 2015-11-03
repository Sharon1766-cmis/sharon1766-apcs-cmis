
public class CardDriver
{
 public static void main ( String[] args )
 
    {
        String [] MyHand = new String[3];
        String [] Cards =  {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String [] Suit = {"♥", "♦", "♣", "♠"};
       
        
       for( int i = 0; i < MyHand.length; i++)
       {
        int a = ((int) (Math.random()*13));
        int b = ((int)(Math.random()*4)); 
        MyHand[i] = Cards[a] + Suit[b];
        System.out.println(MyHand[i]);
        }
        
    }
}
