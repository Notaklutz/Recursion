/**
 * @author Kevin Nguyen
 * @version 1 April 12, 2019
 * <p>
 * This program will traverse a 5x5 2D array representing a maze with walls and paths. A black box recursive boolean method will return true if the exit is found and false is it is not.
 * <p>
 * <pre>
 * Variable Name     Variable Type        Description
 * mazeArray         int[][]              This int array stores the 5x5 2D array that represents a maze with walls and paths.
 * </pre>
 */ 
public class Maze
{    
  private static int [][] mazeArray = 
      {{1, 1, 1, 1, 1},
        {0, 0, 1, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 1, 0, 1},
        {1, 1, 1, 0, 0},};
    
  /**
   * This is a helper method that checks if the chosen index is out of bounds of the maze or if the chosen index has already been traversed.
   * @param x int, stores the x value of the chosen index.
   * @param y int, stores the y value of the chosen index.
   */
    private static boolean validIndex(int x, int y)
    {
      if (x >= 0 && x < mazeArray.length && y >= 0 && y < mazeArray[0].length)
         if (mazeArray[x][y] == 0)
            return true;

      return false;
    }
   
  /**
   * This method recursively traverses the maze to find the exit. 
   * <p>
   * <pre>
   * Variable Name     Variable Type        Description
   * found             boolean              This boolean stores whether or not the maze is solved
   * </pre>
   * @param x int, stores the x value of the chosen index.
   * @param y int, stores the y value of the chosen index.
   */
    public static boolean findExit (int x, int y) 
    {
      boolean found = false;
      
      // Checks if the chosen index is valid using the validIndex() method.
      if (validIndex (x, y)) 
      {
         // Assigns the index a value of 2, identifying that it has been traversed.
         mazeArray[x][y] = 2; 
         // Checks whether or not the index is at the max location, AKA the exit to the maze. If true, found will be set to true.
         if (x == mazeArray.length - 1 && y == mazeArray[0].length - 1)
            found = true; 
         else 
         {
          // Checks one index down.
          found = findExit (x + 1, y);
          // Checks one index up.
          if (found == false)
            found = findExit (x - 1, y);
          // Checks one index right.
          if (found == false)
            found = findExit (x, y + 1);
          // Checks one index left.
          if (found == false)
            found = findExit (x, y - 1); 
         }
      }
      return found;
   }

  /**
   * This method runs the findExit() method and prints what it returns.
   * @param args String[], stores parameters from the command line.
   */ 
    public static void main (String[]args)
    { 
      System.out.println (findExit(1, 0));
    }
}