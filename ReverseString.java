import java.util.Scanner;
/**
 * @author Kevin Nguyen
 * @version 1 April 12, 2019
 * <p>
 * This program will get a single String input from the keyboard until a period is entered and will reverse the order of the words and period within that String.
 */ 
public class ReverseString
{    
  /**
   * This method reverses the words of the passed in String.
   * @param s String, stores the String that will have its words reversed.
   */ 
    public static String revString(String s)
    {
      if (s.indexOf(" ") == -1)
            return s.substring (0);
      return (s.substring (s.lastIndexOf (" ") + 1) + " " + revString (s.substring (0, s.lastIndexOf (" "))));
    }
    
  /**
   * This method gets the String input from the user using Scanner, prints a ".", and runs the revString() method, printing what it returns.
   * <p>
   * <pre>
   * Variable Name     Variable Type        Description
   * line              String               This String stores the input from the user.
   * input             Scanner              This Scanner is used to get input from the user.
   * </pre>
   * @param args String[], stores parameters from the command line.
   */ 
    public static void main (String[]args)
    {
        String line;
        Scanner input = new Scanner (System.in);
        
        line = input.nextLine();
        
        input.close();
        
        System.out.print(".");
        System.out.println (revString (line.substring (0, line.indexOf("."))));
    }
}