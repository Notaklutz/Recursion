import java.util.Scanner;
/**
 * @author Kevin Nguyen
 * @version 1 April 12, 2019
 * <p>
 * This program will get int input from the keyboard and will reverse the order of the digits in the String.
 */ 
public class ReverseDigits
{    
  /**
   * This method reverses the digits of the passed in integer.
   * @param i int, stores the int that will have its digits reversed.
   */ 
    public static int revDigits(int i)
    {
        if (i == 0)
            return 0;
        return i % 10 * (int) Math.pow(10,(double)(int)Math.log10(i)) + revDigits(i/10);
    }
  /**
   * This method gets the int input from the user using Scanner and runs the revDigits method, printing what it returns.
   * <p>
   * <pre>
   * Variable Name     Variable Type        Description
   * digits            int                  This int stores the input from the user.
   * input             Scanner              This Scanner is used to get input from the user.
   * </pre>
   * @param args String[], stores parameters from the command line.
   */ 
    public static void main (String[]args)
    {
        int digits;
        Scanner input = new Scanner (System.in);
        
        digits = input.nextInt();
        input.close();
        System.out.println (revDigits (digits));
    }
}