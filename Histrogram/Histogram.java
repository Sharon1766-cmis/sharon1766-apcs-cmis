import javax.swing.JOptionPane;

public class Histogram
 {
    public static void main(String[] args)
    {
        String nnum = JOptionPane.showInputDialog ( "Give me an integer~ PLLLLEEASSEEE");
        int num=Integer.parseInt(nnum);
        
        int [] randomNums = new int[num];
        int [] counts = new int [100];
       
        
        for (int index = 0; index < num; index++)
        {
           randomNums[ index ] = (int) (Math.random()*100);
        }    
        
        for (int index = 0; index < num; index++)
        {
               
                counts[randomNums[index]]++;
             
        }    
        for(int index = 0; index < counts.length;index++)
        {
            System.out.println(index + ": " + counts[index]);
        }
         
   }
} 