
public class BlackJackP6
{
 public static void main ( String[] args )
 
    {
        int Value = 0;
        int TotalValue = 0;
        int TotalValuePlayer = 0;
        
      
        int [] a = new int [2];
        int [] b = new int [2];
        String Winner;
        String [] Dealer = new String[2];
        String [] Player1 = new String[2];
        String [] Player2 = new String[2];
        String [] Player3 = new String[2];
        String [] Player4 = new String[2];
        String [] Player5 = new String[2];
        
        String [] Cards =  {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String [] Suit = {"♥", "♦", "♣", "♠"};
       
       System.out.print("----Dealer----"); 
       System.out.print("\n");
       for( int i = 0; i < Dealer.length; i++)
       {
        a[i] = ((int) (Math.random()*13));
        b[i] = ((int) (Math.random()*4));
       Player1[i]= Cards[a[i]] + Suit[b[i]];
        System.out.print( " Dealer Card: " +Player1[i] + "\n");
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
            else if (Dealer[i] == ("2") )
             {
                Value = 2;
             }   
            else if (Dealer[i] == ("3") )
             {
                Value = 3;
             }   
           else if (Dealer[i] == ("4") )
             {
                Value = 4;
             }    
           else if (Dealer[i] == ("5") )
             {
                Value = 5;
             }   
            else if (Dealer[i] == ("6") )
             {
                Value = 6;
             }   
           else if (Dealer[i] == ("7") )
             {
                Value = 7;
             }       
             else if (Dealer[i] == ("8") )
             {
                Value = 8;
             }   
            else if (Dealer[i] == ("9") )
             {
                Value = 9;
             }   
           else if (Dealer[i] == ("10") )
             {
                Value = 10;
             }     
           TotalValue += Value;
           System.out.print(" Dealer Value : "+Value+ "\n");
          
        }
        System.out.print(" Total Value for Dealer: "+TotalValue+ "\n");
        
             
        System.out.print("\n");
        System.out.print("\n");
       System.out.print("----PLAYER 1----"); 
       System.out.print("\n");
          for( int i = 0; i < Player1.length; i++)
       {
        int a = ((int) (Math.random()*12));
        Player1[i] = Cards[a];
        System.out.print( " Player Card: " +Cards[a] + "\n");
        }
        
       for( int i = 0; i < Player1.length; i++)
       {
             if (Player1[i] == ("J") )
             {
                Value = 10;
            }
            else if (Player1[i] ==("Q") )
             {
                Value = 10;
            }
            else if  (Player1[i] == ("K") )
             {
                Value = 10;
            }
           else if (Player1[i] == ("1") )
             {
                Value = 11;
            }
            else if (Player1[i] == ("2") )
             {
                Value = 2;
             }   
            else if (Player1[i] == ("3") )
             {
                Value = 3;
             }   
           else if (Player1[i] == ("4") )
             {
                Value = 4;
             }    
           else if (Player1[i] == ("5") )
             {
                Value = 5;
             }   
            else if (Player1[i] == ("6") )
             {
                Value = 6;
             }   
           else if (Player1[i] == ("7") )
             {
                Value = 7;
             }       
             else if (Player1[i] == ("8") )
             {
                Value = 8;
             }   
            else if (Player1[i] == ("9") )
             {
                Value = 9;
             }   
           else if (Player1[i] == ("10") )
             {
                Value = 10;
             }     
           TotalValuePlayer += Value;
           System.out.print(" Player Value : "+Value+ "\n");
        }
        
        System.out.print( " Total Value for Player : "+TotalValuePlayer+ "\n");
        System.out.print("\n");
        
        if (TotalValuePlayer==21)
        {
            Winner = "Player 1";
            System.out.print(" RESULT : Player 1 Won Dealer with 21 Points");
        }  
        else if( TotalValuePlayer > 21)
        {
            System.out.print(" RESULT : Player 1 Lost");
        }
        else if (TotalValuePlayer > TotalValue)
        {
            Winner = "Player 1";
            System.out.print(" RESULT : Player 1 Won Dealer with " +TotalValuePlayer+" Points while Dealer lost with " +TotalValue+ " Points.");
        }  
          else 
        {
            Winner = "Dealer";
            System.out.print(" RESULT : Dealer Won Player 1 with " +TotalValue+" Points while Player 1 lost with " +TotalValuePlayer+ " Points.");
        } 
        
        
        TotalValuePlayer = 0;
            
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("----PLAYER 2----"); 
       System.out.print("\n");
          for( int i = 0; i < Player2.length; i++)
       {
        int a = ((int) (Math.random()*12));
        Player2[i] = Cards[a];
        System.out.print( " Player Card: " +Cards[a] + "\n");
        }
        
       for( int i = 0; i < Player2.length; i++)
       {
             if (Player2[i] == ("J") )
             {
                Value = 10;
            }
            else if (Player2[i] ==("Q") )
             {
                Value = 10;
            }
            else if  (Player2[i] == ("K") )
             {
                Value = 10;
            }
           else if (Player2[i] == ("1") )
             {
                Value = 11;
            }
            else if (Player2[i] == ("2") )
             {
                Value = 2;
             }   
            else if (Player2[i] == ("3") )
             {
                Value = 3;
             }   
           else if (Player2[i] == ("4") )
             {
                Value = 4;
             }    
           else if (Player2[i] == ("5") )
             {
                Value = 5;
             }   
            else if (Player2[i] == ("6") )
             {
                Value = 6;
             }   
           else if (Player2[i] == ("7") )
             {
                Value = 7;
             }       
             else if (Player2[i] == ("8") )
             {
                Value = 8;
             }   
            else if (Player2[i] == ("9") )
             {
                Value = 9;
             }   
           else if (Player2[i] == ("10") )
             {
                Value = 10;
             }     
           TotalValuePlayer += Value;
           System.out.print(" Player Value : "+Value+ "\n");
        }
        
        System.out.print( " Total Value for Player : "+TotalValuePlayer+ "\n");
        System.out.print("\n");
        
        if (TotalValuePlayer==21)
        {
            Winner = "Player 2";
            System.out.print(" RESULT : Player 2 Won Dealer with 21 Points");
        }  
        else if( TotalValuePlayer > 21)
        {
            System.out.print(" RESULT : Player 2 Lost");
        }
        else if (TotalValuePlayer > TotalValue)
        {
            Winner = "Player 2";
            System.out.print(" RESULT : Player 2 Won Dealer with " +TotalValuePlayer+" Points while Dealer lost with " +TotalValue+ " Points.");
        }  
          else 
        {
            Winner = "Dealer";
            System.out.print(" RESULT : Dealer Won Player 2 with " +TotalValue+" Points while Player 2 lost with " +TotalValuePlayer+ " Points.");
        } 
        
        
        TotalValuePlayer = 0;
            
        System.out.print("\n");
        System.out.print("\n");
        
       System.out.print("----PLAYER 3----"); 
       System.out.print("\n");
          for( int i = 0; i < Player3.length; i++)
       {
        int a = ((int) (Math.random()*12));
        Player3[i] = Cards[a];
        System.out.print( " Player Card: " +Cards[a] + "\n");
        }
        
       for( int i = 0; i < Player3.length; i++)
       {
             if (Player3[i] == ("J") )
             {
                Value = 10;
            }
            else if (Player3[i] ==("Q") )
             {
                Value = 10;
            }
            else if  (Player3[i] == ("K") )
             {
                Value = 10;
            }
           else if (Player3[i] == ("1") )
             {
                Value = 11;
            }
            else if (Player3[i] == ("2") )
             {
                Value = 2;
             }   
            else if (Player3[i] == ("3") )
             {
                Value = 3;
             }   
           else if (Player3[i] == ("4") )
             {
                Value = 4;
             }    
           else if (Player3[i] == ("5") )
             {
                Value = 5;
             }   
            else if (Player3[i] == ("6") )
             {
                Value = 6;
             }   
           else if (Player3[i] == ("7") )
             {
                Value = 7;
             }       
             else if (Player3[i] == ("8") )
             {
                Value = 8;
             }   
            else if (Player3[i] == ("9") )
             {
                Value = 9;
             }   
           else if (Player3[i] == ("10") )
             {
                Value = 10;
             }     
           TotalValuePlayer += Value;
           System.out.print(" Player Value : "+Value+ "\n");
        }
        
        System.out.print( " Total Value for Player : "+TotalValuePlayer+ "\n");
        System.out.print("\n");
        
         if (TotalValuePlayer==21)
        {
            Winner = "Player 3";
            System.out.print(" RESULT : Player 3 Won Dealer with 21 Points");
        }  
        else if( TotalValuePlayer > 21)
        {
            System.out.print(" RESULT : Player 3 Lost");
        }
        else if (TotalValuePlayer > TotalValue)
        {
            Winner = "Player 3";
            System.out.print(" RESULT : Player 3 Won Dealer with " +TotalValuePlayer+" Points while Dealer lost with " +TotalValue+ " Points.");
        }  
          else 
        {
            Winner = "Dealer";
            System.out.print(" RESULT : Dealer Won Player 3 with " +TotalValue+" Points while Player 3 lost with " +TotalValuePlayer+ " Points.");
        } 
        TotalValuePlayer = 0;
            
        System.out.print("\n");
        System.out.print("\n");
        
         System.out.print("----PLAYER 4----"); 
       System.out.print("\n");
          for( int i = 0; i < Player4.length; i++)
       {
        int a = ((int) (Math.random()*12));
        Player4[i] = Cards[a];
        System.out.print( " Player Card: " +Cards[a] + "\n");
        }
        
       for( int i = 0; i < Player4.length; i++)
       {
             if (Player4[i] == ("J") )
             {
                Value = 10;
            }
            else if (Player4[i] ==("Q") )
             {
                Value = 10;
            }
            else if  (Player4[i] == ("K") )
             {
                Value = 10;
            }
           else if (Player4[i] == ("1") )
             {
                Value = 11;
            }
            else if (Player4[i] == ("2") )
             {
                Value = 2;
             }   
            else if (Player4[i] == ("3") )
             {
                Value = 3;
             }   
           else if (Player4[i] == ("4") )
             {
                Value = 4;
             }    
           else if (Player4[i] == ("5") )
             {
                Value = 5;
             }   
            else if (Player4[i] == ("6") )
             {
                Value = 6;
             }   
           else if (Player4[i] == ("7") )
             {
                Value = 7;
             }       
             else if (Player4[i] == ("8") )
             {
                Value = 8;
             }   
            else if (Player4[i] == ("9") )
             {
                Value = 9;
             }   
           else if (Player4[i] == ("10") )
             {
                Value = 10;
             }     
           TotalValuePlayer += Value;
           System.out.print(" Player Value : "+Value+ "\n");
        }
        
        System.out.print( " Total Value for Player : "+TotalValuePlayer+ "\n");
        System.out.print("\n");
        if (TotalValuePlayer==21)
        {
            Winner = "Player 4";
            System.out.print(" RESULT : Player 4 Won Dealer with 21 Points");
        }  
        else if( TotalValuePlayer > 21)
        {
            System.out.print(" RESULT : Player 4 Lost");
        }
        else if (TotalValuePlayer > TotalValue)
        {
            Winner = "Player 4";
            System.out.print(" RESULT : Player 4 Won Dealer with " +TotalValuePlayer+" Points while Dealer lost with " +TotalValue+ " Points.");
        }  
          else 
        {
            Winner = "Dealer";
            System.out.print(" RESULT : Dealer Won Player 4 with " +TotalValue+" Points while Player 4 lost with " +TotalValuePlayer+ " Points.");
        } 
        TotalValuePlayer = 0;
            
        System.out.print("\n");
        System.out.print("\n");
        
           System.out.print("----PLAYER 5----"); 
       System.out.print("\n");
          for( int i = 0; i < Player5.length; i++)
       {
        int a = ((int) (Math.random()*12));
        int b = ((int)(Math.random()*4)); 
        Player5[i] = Cards[a] + Suit[b];
        System.out.print( " Player Card: " +Cards[a] + "\n");
        }
        
       for( int i = 0; i < Player5.length; i++)
       {
             if (Player5[i] == ("J") )
             {
                Value = 10;
            }
            else if (Player5[i] ==("Q") )
             {
                Value = 10;
            }
            else if  (Player5[i] == ("K") )
             {
                Value = 10;
            }
           else if (Player5[i] == ("1") )
             {
                Value = 11;
            }
            else if (Player5[i] == ("2") )
             {
                Value = 2;
             }   
            else if (Player5[i] == ("3") )
             {
                Value = 3;
             }   
           else if (Player5[i] == ("4") )
             {
                Value = 4;
             }    
           else if (Player5[i] == ("5") )
             {
                Value = 5;
             }   
            else if (Player5[i] == ("6") )
             {
                Value = 6;
             }   
           else if (Player5[i] == ("7") )
             {
                Value = 7;
             }       
             else if (Player5[i] == ("8") )
             {
                Value = 8;
             }   
            else if (Player5[i] == ("9") )
             {
                Value = 9;
             }   
           else if (Player5[i] == ("10") )
             {
                Value = 10;
             }     
           TotalValuePlayer += Value;
           System.out.print(" Player Value : "+Value+ "\n");
        }
        
        System.out.print( " Total Value for Player : "+TotalValuePlayer+ "\n");
        System.out.print("\n");
          if (TotalValuePlayer==21)
        {
            Winner = "Player 5";
            System.out.print(" RESULT : Player 5 Won Dealer with 21 Points");
        }  
        else if( TotalValuePlayer > 21)
        {
            System.out.print(" RESULT : Player 5 Lost");
        }
        else if (TotalValuePlayer > TotalValue)
        {
            Winner = "Player 5";
            System.out.print(" RESULT : Player 5 Won Dealer with " +TotalValuePlayer+" Points while Dealer lost with " +TotalValue+ " Points.");
        }  
          else 
        {
            Winner = "Dealer";
            System.out.print(" RESULT : Dealer Won Player 5 with " +TotalValue+" Points while Player 5 lost with " +TotalValuePlayer+ " Points.");
        } 
            
        System.out.print("\n");
        System.out.print("\n");
              
    }
}

        