import java.io.IOException;
import java.util.*;

public class summativesums 
{
    public static void main(String args[]) throws IOException
    {
      sums();

    }

   public static void sums(){

    int[] a = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
    int[] b = { 999, -60, -77, 14, 160, 301 };
    int[] c = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
    140, 150, 160, 170, 180, 190, 200, -99 };

    int suma = 0;
    int sumb = 0;
    int sumc = 0;

    for (int i : a)
        suma += i;
    for (int i : b)
        sumb += i;
    for (int i : c)
        sumc += i;

    System.out.println( " #1 Array Sum: "+ suma +"\n #2 Array Sum: " +sumb+ "\n #3 Array Sum: " +sumc);
   }

}


