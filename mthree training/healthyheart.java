import java.io.IOException;
import java.util.*;

public class healthyheart 
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) throws IOException
    {
    

      System.out.println("What is your age: ");
      int age = sc.nextInt();
      int maxheartrate = 220 - age;
      System.out.println("your maximum heart rate should be "+maxheartrate+" beats per minute.");
      int hr = 50 + (int)(Math.random() * ((85 - 50) + 1));
      int hrfull = hr *maxheartrate;
      int bpm = hrfull/100;
                  
      System.out.println( "Your target HR Zone is "+hr+"- "+bpm+ " beats per minute");


    }


  }
