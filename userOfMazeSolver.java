public class UserOfMazeSolver {
  public static void main(String[] args) throws java.io.FileNotFoundException{
      //get command line arguments

      Maze toSolve = new Maze(args[0]
                          , Integer.parseInt(args[1])
                          , Integer.parseInt(args[2])
                          );

      MazeSolver mySolver = new MazeSolver(toSolve);

      System.out.println("Attempting to solve maze: \n" + toSolve.toString());
      System.out.println("The maze is " + (mySolver.solve() ? "solvable!" : "not solvable"));
  }
}
