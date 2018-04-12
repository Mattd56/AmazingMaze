public class UserOfMazeSolver {
  public static void main(String[] args){
      //test maze solving
      Maze toSolve = new Maze("MAZES/PATH/TO/WHATEVER", 1, 1);
      MazeSolver mySolver = new MazeSolver();
      System.out.println("The maze is " + mySolver.solve() ? "solvable!" : "not solvable");
  }
}
