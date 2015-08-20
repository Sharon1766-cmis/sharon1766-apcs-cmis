import java.util.Scanner;

    public class Numbers {
    
        public static void main(String[] args) {
            
         Scanner in = new Scanner(System.in); 
         
           
           System.out.println("Please enter your first number:");
           double newinput = in.nextInt();
           
           System.out.println("Please enter your second number: ");
           double newinput2 = in.nextInt();
           
            double sum = newinput + newinput2;
            double sum1 = newinput2 + newinput;
            
            double diff = newinput - newinput2;
            double diff2 = newinput2 - newinput;
             
            double mult = newinput * newinput2;
            double mult2 = newinput2 * newinput;
            
            double div = newinput / newinput2;
            double div2 = newinput2 / newinput;
            
            double md = newinput % newinput2;
            double md2 = newinput2 % newinput;
            
            System.out.println(newinput+ "+" +newinput2+ " = " +sum);
            System.out.println(newinput2+ "+" +newinput+ " = " +sum1);
            
            System.out.println(newinput+ "-" +newinput2+ " = " +diff);
            System.out.println(newinput2+ "-" +newinput+ "=" +diff2);
            
            System.out.println(newinput+ "*" +newinput2+ " = " +mult);
            System.out.println(newinput2+ "*" +newinput+  " = " +mult2);
            
             System.out.println(newinput+ "/" +newinput2+ " = " +div);
            System.out.println(newinput2+ "/" +newinput+ " = " +div2);
            
              System.out.println(newinput+ "%" +newinput2+ "=" +md);
            System.out.println(newinput2+ "%" +newinput+ "=" +md2);
        }
        
    }    