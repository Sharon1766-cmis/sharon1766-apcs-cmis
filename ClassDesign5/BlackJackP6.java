
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
        Card [] Dealer = new Card[2];
        Card [] Player1 = new Card[2];
        Card [] Player2 = new Card[2];
        Card [] Player3 = new Card[2];
        Card [] Player4 = new Card[2];
        Card [] Player5 = new Card[2];
        
      String [] Cards =  {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
       String [] Suit = {"♥", "♦", "♣", "♠"};
       
       System.out.print("----Dealer----"); 
       System.out.print("\n");
       for( int i = 0; i < Dealer.length; i++)
       {
        a[i] = ((int) (Math.random()*13));
        b[i] = ((int) (Math.random()*4));
        Card DealerHand= new Card(Cards[a[i]],Suit[b[i]]); 
        Dealer[i]=DealerHand;
        System.out.print( " Dealer Card: " +Dealer[i] + "\n");
        }
        
       for( int i = 0; i < Dealer.length; i++)
       {
             if ( Cards[a[i]] == ("J") )
             {
                Value = 10;
            }
            else if (Cards[a[i]] ==("Q") )
             {
                Value = 10;
            }
            else if  (Cards[a[i]] == ("K") )
             {
                Value = 10;
            }
           else if (Cards[a[i]] == ("1") )
             {
                Value = 11;
            }
            else if (Cards[a[i]] == ("2") )
             {
                Value = 2;
             }   
            else if (Cards[a[i]] == ("3") )
             {
                Value = 3;
             }   
           else if (Cards[a[i]] == ("4") )
             {
                Value = 4;
             }    
           else if (Cards[a[i]] == ("5") )
             {
                Value = 5;
             }   
            else if (Cards[a[i]] == ("6") )
             {
                Value = 6;
             }   
           else if (Cards[a[i]] == ("7") )
             {
                Value = 7;
             }       
             else if (Cards[a[i]] == ("8") )
             {
                Value = 8;
             }   
            else if (Cards[a[i]] == ("9") )
             {
                Value = 9;
             }   
           else if (Cards[a[i]] == ("10") )
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
        a[i] = ((int) (Math.random()*13));
        b[i] = ((int) (Math.random()*4));
       Card PlayerHand= new Card(Cards[a[i]],Suit[b[i]]); 
        Player1[i]=PlayerHand;
        System.out.print( " Player Card: " +Player1[i] + "\n");
        }
        
        
       for( int i = 0; i < Player1.length; i++)
       {
             if (Cards[a[i]] == ("J") )
             {
                Value = 10;
            }
            else if (Cards[a[i]] ==("Q") )
             {
                Value = 10;
            }
            else if  (Cards[a[i]] == ("K") )
             {
                Value = 10;
            }
           else if (Cards[a[i]] == ("1") )
             {
                Value = 11;
            }
            else if (Cards[a[i]] == ("2") )
             {
                Value = 2;
             }   
            else if (Cards[a[i]] == ("3") )
             {
                Value = 3;
             }   
           else if (Cards[a[i]] == ("4") )
             {
                Value = 4;
             }    
           else if (Cards[a[i]] == ("5") )
             {
                Value = 5;
             }   
            else if (Cards[a[i]] == ("6") )
             {
                Value = 6;
             }   
           else if (Cards[a[i]] == ("7") )
             {
                Value = 7;
             }       
             else if (Cards[a[i]] == ("8") )
             {
                Value = 8;
             }   
            else if (Cards[a[i]] == ("9") )
             {
                Value = 9;
             }   
           else if (Cards[a[i]] == ("10") )
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
      for( int i = 0; i < Player1.length; i++)
       {
        a[i] = ((int) (Math.random()*13));
        b[i] = ((int) (Math.random()*4));
       Card PlayerHand= new Card(Cards[a[i]],Suit[b[i]]); 
        Player2[i]=PlayerHand;
        System.out.print( " Player Card: " +Player2[i] + "\n");
        }
        
        
       for( int i = 0; i < Player2.length; i++)
       {
             if (Cards[a[i]] == ("J") )
             {
                Value = 10;
            }
            else if (Cards[a[i]] ==("Q") )
             {
                Value = 10;
            }
            else if  (Cards[a[i]] == ("K") )
             {
                Value = 10;
            }
           else if (Cards[a[i]] == ("1") )
             {
                Value = 11;
            }
            else if (Cards[a[i]] == ("2") )
             {
                Value = 2;
             }   
            else if (Cards[a[i]] == ("3") )
             {
                Value = 3;
             }   
           else if (Cards[a[i]] == ("4") )
             {
                Value = 4;
             }    
           else if (Cards[a[i]] == ("5") )
             {
                Value = 5;
             }   
            else if (Cards[a[i]] == ("6") )
             {
                Value = 6;
             }   
           else if (Cards[a[i]] == ("7") )
             {
                Value = 7;
             }       
             else if (Cards[a[i]] == ("8") )
             {
                Value = 8;
             }   
            else if (Cards[a[i]] == ("9") )
             {
                Value = 9;
             }   
           else if (Cards[a[i]] == ("10") )
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
     for( int i = 0; i < Player1.length; i++)
       {
        a[i] = ((int) (Math.random()*13));
        b[i] = ((int) (Math.random()*4));
       Card PlayerHand= new Card(Cards[a[i]],Suit[b[i]]); 
        Player3[i]=PlayerHand;
        System.out.print( " Player Card: " +Player3[i] + "\n");
        }
        
       for( int i = 0; i < Player3.length; i++)
       {
             if (Cards[a[i]] == ("J") )
             {
                Value = 10;
            }
            else if (Cards[a[i]] ==("Q") )
             {
                Value = 10;
            }
            else if  (Cards[a[i]] == ("K") )
             {
                Value = 10;
            }
           else if (Cards[a[i]] == ("1") )
             {
                Value = 11;
            }
            else if (Cards[a[i]] == ("2") )
             {
                Value = 2;
             }   
            else if (Cards[a[i]] == ("3") )
             {
                Value = 3;
             }   
           else if (Cards[a[i]] == ("4") )
             {
                Value = 4;
             }    
           else if (Cards[a[i]] == ("5") )
             {
                Value = 5;
             }   
            else if (Cards[a[i]] == ("6") )
             {
                Value = 6;
             }   
           else if (Cards[a[i]] == ("7") )
             {
                Value = 7;
             }       
             else if (Cards[a[i]] == ("8") )
             {
                Value = 8;
             }   
            else if (Cards[a[i]] == ("9") )
             {
                Value = 9;
             }   
           else if (Cards[a[i]] == ("10") )
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
    for( int i = 0; i < Player1.length; i++)
       {
        a[i] = ((int) (Math.random()*13));
        b[i] = ((int) (Math.random()*4));
       Card PlayerHand= new Card(Cards[a[i]],Suit[b[i]]); 
        Player4[i]=PlayerHand;
        System.out.print( " Player Card: " +Player4[i] + "\n");
        }
        
       for( int i = 0; i < Player4.length; i++)
       {
             if (Cards[a[i]] == ("J") )
             {
                Value = 10;
            }
            else if (Cards[a[i]] ==("Q") )
             {
                Value = 10;
            }
            else if  (Cards[a[i]] == ("K") )
             {
                Value = 10;
            }
           else if (Cards[a[i]] == ("1") )
             {
                Value = 11;
            }
            else if (Cards[a[i]] == ("2") )
             {
                Value = 2;
             }   
            else if (Cards[a[i]] == ("3") )
             {
                Value = 3;
             }   
           else if (Cards[a[i]] == ("4") )
             {
                Value = 4;
             }    
           else if (Cards[a[i]] == ("5") )
             {
                Value = 5;
             }   
            else if (Cards[a[i]] == ("6") )
             {
                Value = 6;
             }   
           else if (Cards[a[i]] == ("7") )
             {
                Value = 7;
             }       
             else if (Cards[a[i]] == ("8") )
             {
                Value = 8;
             }   
            else if (Cards[a[i]] == ("9") )
             {
                Value = 9;
             }   
           else if (Cards[a[i]] == ("10") )
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
      for( int i = 0; i < Player1.length; i++)
       {
        a[i] = ((int) (Math.random()*13));
        b[i] = ((int) (Math.random()*4));
       Card PlayerHand= new Card(Cards[a[i]],Suit[b[i]]); 
        Player5[i]=PlayerHand;
        System.out.print( " Player Card: " +Player5[i] + "\n");
        }
        
       for( int i = 0; i < Player5.length; i++)
       {
             if (Cards[a[i]] == ("J") )
             {
                Value = 10;
            }
            else if (Cards[a[i]] ==("Q") )
             {
                Value = 10;
            }
            else if  (Cards[a[i]] == ("K") )
             {
                Value = 10;
            }
           else if (Cards[a[i]] == ("1") )
             {
                Value = 11;
            }
            else if (Cards[a[i]] == ("2") )
             {
                Value = 2;
             }   
            else if (Cards[a[i]] == ("3") )
             {
                Value = 3;
             }   
           else if (Cards[a[i]] == ("4") )
             {
                Value = 4;
             }    
           else if (Cards[a[i]] == ("5") )
             {
                Value = 5;
             }   
            else if (Cards[a[i]] == ("6") )
             {
                Value = 6;
             }   
           else if (Cards[a[i]] == ("7") )
             {
                Value = 7;
             }       
             else if (Cards[a[i]] == ("8") )
             {
                Value = 8;
             }   
            else if (Cards[a[i]] == ("9") )
             {
                Value = 9;
             }   
           else if (Cards[a[i]] == ("10") )
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

        