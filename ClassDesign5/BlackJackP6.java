
public class BlackJackP6
{
 public static void main ( String[] args )
 
    {
         int Value;
        String [] Dealer = new String[2];
        String [] Player1 = new String[2];
        String [] Player2 = new String[2];
        String [] Player3 = new String[2];
        String [] Player4 = new String[2];
        String [] Player5 = new String[2];
        
        String [] Cards =  {"1", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"};
        String [] Suit = {"♥", "♦", "♣", "♠"};
       
        
       for( int i = 0; i < Dealer.length; i++)
       {
        int a = ((int) (Math.random()*12));
        int b = ((int)(Math.random()*4)); 
        Dealer[i] = Cards[a];
        System.out.print("Dealer:" +Dealer[i]);
       
        }
        
         
       for( int i = 0; i < Dealer.length; i++)
       {
             if (Dealer[i] == ("J") )
             {
                Value = 10;
            }
            else if (Dealer[i] ==("Q") )
             {
                Value = 10;
            }
            else if  (Dealer[i] == ("K") )
             {
                Value = 10;
            }
           else if (Dealer[i] == ("1") )
             {
                Value = 11;
            }
            else it (Dealer[i]) 
        }
        
        
 
        System.out.print("\n");
        System.out.print("\n");
        for( int i = 0; i < Player1.length; i++)
       {
        int a = ((int) (Math.random()*12));
        int b = ((int)(Math.random()*4)); 
        Player1[i] = Cards[a] + Suit[b];
        System.out.print("Player1 : " +Player1[i]);
        }
         System.out.print("\n");
         System.out.print("\n");
         for( int i = 0; i < Player2.length; i++)
       {
        int a = ((int) (Math.random()*12));
        int b = ((int)(Math.random()*4)); 
        Player2[i] = Cards[a] + Suit[b];
        System.out.print("Player2 : " +Player2[i]);
        }
         System.out.print("\n");
         System.out.print("\n");
         for( int i = 0; i < Player3.length; i++)
       {
        int a = ((int) (Math.random()*12));
        int b = ((int)(Math.random()*4)); 
        Player3[i] = Cards[a] + Suit[b];
        System.out.print("Player3 : " +Player3[i]);
        }
         System.out.print("\n");
         System.out.print("\n");
         for( int i = 0; i < Player4.length; i++)
       {
        int a = ((int) (Math.random()*12));
        int b = ((int)(Math.random()*4)); 
        Player4[i] = Cards[a] + Suit[b];
        System.out.print("Player4 : " +Player4[i]);
        }
         System.out.print("\n");
         System.out.print("\n");
         for( int i = 0; i < Player5.length; i++)
       {
        int a = ((int) (Math.random()*12));
        int b = ((int)(Math.random()*4)); 
        Player5[i] = Cards[a] + Suit[b];
        System.out.print("Player5 : " +Player5[i]);
        }
         System.out.print("\n");
         System.out.print("\n");
      
    }
}
