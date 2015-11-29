import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int RanNum = rand.nextInt(1000);
        int Tries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;
        
        while (win == false){
                System.out.println("Guess a Number From 1 -1000");
                guess = input.nextInt();
                Tries++;
                
                if (guess == RanNum){
                       win = true; 
                }
                else if (guess < RanNum){
                System.out.println("Too Low");
                }    
                else if (guess > RanNum){
                System.out.println("Too High");
                }   
        }
        System.out.println("You Win!");
        System.out.println("The Number was" +RanNum);
        System.out.println("Took you" +Tries+ "Tries, GOOD JOB!!:D");

    }
}