

public class FundamentalsP7
{
    public static void main ( String[] args )
    {

        int [] array = new int[10];
        int n = 0;
        int p = 0;

        for (int index = 0; index < array.length ; index++)

        {
            int i  = 0;

            i = (int) (100*Math.random());
            if ( i % 2 == 0)
            {
                array[index] =((int)(100*(-1)*Math.random( ) ) );
                n++;
            }
            else
            {
                array[index] = ((int)(100*Math.random()));
                p++;
            }
        }

        int  index = 0;

        while ( index < array.length )

        {
                System.out.println(array[index] + " ");
                index++;
            // MAKE IT BOTH POSITIVE N NEGATIVe
        }
        System.out.println ("The number of postivie numbers are" +p+ ", and the number of negative numbers are " +n  +".");
        
        for (int i = 0; i< array.length; i++)
        {
            if (array [i] > 0)
        {
            
           System.out.print(array[i] + "\t" );
        }
    }
    }
}

