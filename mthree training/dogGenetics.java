import java.io.IOException;
import java.util.*;

public class dogGenetics 
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) throws IOException
    {
    

      System.out.println("Please enter your dogs name: ");
      String input = sc.next();
      System.out.println("Well then, I have this highly reliable report on "+input+"'s prestigious background right here.");
      
        //Random r = new Random();
        
        //System.out.println("Please enter your dogs name: " + n4);
        while(true){
            int firstNumber = (int)((Math.random())*101);
            int secondNumber = (int)((Math.random())*101);
            int thirdNumber= (int)((Math.random())*101);
            int fourthNumber= (int)((Math.random())*101);
            int fifthNumber= (int)((Math.random())*101);

            if (firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber == 100){
                System.out.println( input+ " is: ");

                System.out.println(firstNumber+ "% St. Bernard");
                System.out.println(secondNumber + "% chihuahua" );
                System.out.println(thirdNumber + "% sherperd" );
                System.out.println( fourthNumber +"% rottweiler");
                System.out.println( fifthNumber +"% puddle \n");
               
                System.out.println( "Wow, that's QUITE the dog!");

                break;

            }

        }


    }
}
