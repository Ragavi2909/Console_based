import java.util.Random;
import java.util.Scanner;
public class Guess{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int number = rand.nextInt(100)+1;
         
        int noOfAttempt =0;
        int guess;

        do{
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            noOfAttempt += 1;

            if(number==guess){
                System.out.println("Correct guess");
              
            }
            else if(number > guess){
                System.out.println("Computer generated number is greater than the guessed number");
              
            }
            else{
                System.out.println("Computer generated number is lower than the guessed number");
                
            }
        }while(guess!=number);

        System.out.println("The no of attempts to guess the number is: "+ noOfAttempt);
    }

    
}