import java.io.IOException;
import java.util.*;

public class rockpaperscissorsgame 
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) throws IOException
    {
      int w = 0,
      l = 0,
      d = 0;
      int i = 0; // counter variables

      boolean rep = true;
      while (rep){
      System.out.println("Let's play a game of Rock, Paper, Scissors!");
      System.out.println("how many rounds to play (1 to 10): ");
      
      int rounds = sc.nextInt();
      if (rounds >10){
          System.out.println("Input out of range!!");
          System.exit(0);
      }
      
        while (i<rounds){
        
        System.out.println("Please enter a move.\n" + "Rock = 1, Paper = 2, and Scissors = 3.");
        int input = sc.nextInt();
        System.out.println("Player move is: "+ input);

        int playerMove = input;
        Random random = new Random();
        int computerMove = random.nextInt(3)+1; // generates random number between 1 and 3 for computer move
        System.out.println("computer move is: "+ computerMove);
                if (playerMove == computerMove){
                    d++;    
                    System.out.println("Game is Tie !!");
                }
                else if (playerMove == 1 && computerMove == 3 || playerMove == 2 && computerMove == 1 || playerMove == 3 && computerMove == 2){
                    w++;
                    System.out.println("You win!!");   
                }
                else if (playerMove == 3 && computerMove == 1 || playerMove == 1 && computerMove == 2 || playerMove == 2 && computerMove == 3){
                    l++;
                    System.out.println("You lose!!");   
                }
                else 
                    System.out.println("Invalid user input");
            i++;

            }
            System.out.println("You won: "+ w + " rounds and the computer won: " +l+ " and there were: "+d+" draws.");
            

            System.out.println("Do you want to play again? Enter yes or no!");

            String answer = sc.next();
            answer = answer.toLowerCase(); //change input to lowercase for bullet proofing
            if(answer.equals("yes"))
            {
            w = 0;
            l = 0;
            d = 0;
            i = 0;
            rep = true;
            }
            else
                {
                System.exit(0); //program termination
            }
        }
    }                    
}

