import java.util.Arrays;
/**
 * @author Kevin Nguyen
 * @version 1 April 12, 2019
 * <p>
 * This program will search an array of elements that are Comparable and will return true if found or false if not found.
 * <p>
 * <pre>
 * Variable Name     Variable Type        Description
 * array             Comparable[]         Stores an array of Comparable elements.
 * </pre>
 */ 
public class SearchArray
{   
  private static Comparable[] array = {"Hello", "This", "Is", "An", "Array"};
  
  /**
   * This method searches an array of Comparable elements for a specific object and returns true if it is found, false if it is not.
   * @param c Comparable[], stores the array of Comparable elements
   * @param item Comparable, stores the Comparable object that will be searched for
   */ 
    public static boolean searchItem(Comparable[] c, Comparable item)
    {
        if (c[c.length - 1].equals(item))
          return true;
        else if (1 != c.length)
          return searchItem (Arrays.copyOfRange(c, 0, c.length - 1), item);
        return false;
    }
    
  /**
   * This method runs the searchItem() method and prints what it returns.
   * @param args String[], stores parameters from the command line.
   */ 
    public static void main (String[]args)
    {
        System.out.println (searchItem (array, "An"));
    }
}