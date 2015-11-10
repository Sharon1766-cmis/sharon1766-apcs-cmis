
public class CardDriver
{
 public static void main ( String[] args )
 
    {
        SimpleCard [] MyHand = new SimpleCard [52];
        String [] rank =  {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String [] suit = {"♥", "♦", "♣", "♠"};
       
        for (int i=0; i<MyHand.length; i++)
        {
            MyHand[i] = rank[i] +suit[i];
        }
        
    }
}
