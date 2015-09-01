

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
                array[index] =((int)(100*Math.random()));
                n++;
            }
            else
            {
                array[index] = ((int)(100*Math.random()));
                p++;
            }

            int  indexx = 0;

            while ( index < array.length )

            {
                System.out.print(array[indexx] + " ");
                indexx++;
            }

            {
                System.out.print(array[indexx] + " ");
            }

    
            // MAKE IT BOTH POSITIVE N NEGATIVe
        }

    }

}
