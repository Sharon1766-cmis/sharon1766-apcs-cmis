import javax.swing.JOptionPane;

public class Histrogram
 {
    public static void main(String[] args)
    {
        String nnum = JOptionPane.showInputDialog ( "Give me an integer~ PLLLLEEASSEEE");
        int num=Integer.parseInt(nnum);
        
        int [] randomNums = new int[num];
        int [] counts = new int[100];
        String [] hash = new String[num];
        
        for (int index = 0; index < num; index++)
        {
           randomNums[ index ] = (int) (Math.random() * (99 -1) +1) ;
        }    
        
         for (int index = 0; index < counts.length; index++)
        {
           counts[ index ] = index ;
         
        }   
        
        for(int index = 0; index < counts.length;index++)
        {
            int indexer = 0;
         
            while (randomNums[index] == counts[indexer])
            {
               hash[index] += "#" ; 
               indexer++;
            }
    }     
 } 