import javax.swing.JOptionPane;

public class Histrogram
 {
    public static void main(String[] args)
    {
        String nnum = JOptionPane.showInputDialog ( "Give me an integer~ PLLLLEEASSEEE");
        int num=Integer.parseInt(nnum);
        
        int [] randomnums = new int[num];
        int [] counts = new int[100];
        
        for (int index = 0; index < num; index++)
        {
           randomnums[ index ] = (int) (Math.random() * (99 -1) +1) ;
        }    
        
         for (int index = 0; index < counts.length; index++)
        {
           counts[ index ] = index ;
         
        }   
        
        for(int index = 0; index < counts.length;index++)
        {
            String hash = " ";
        
        if ((int)  randomnums[index] == counts[index])
        {
            
            
            
             for (int index2 = 0; index2 < counts[index]; index2++)
                  {
                  hash += "#";
                  }
            
        } 
        else if(randomnums[index] != counts[index])
        {
             System.out.println(index + ": ");
        }
        
           for (int i = 0; i < num; i++)
        {
            System.out.println(index + ": " + hash);
        }  
        }
    }     
 } 