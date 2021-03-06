/**
  Input maze object and


  solve ()
  Returns the Boolean value of the statement "the maze is navigable, having a legal travel path that is continuous
  from start point to existing treasure"
  AKA

  False -> if its not possible to solve the maze

  True -> if it is possible to solve the maze
**/
public class MazeSolver {

    private Maze curLoaded;

    public MazeSolver(Maze maze) {
        curLoaded = new Maze(maze);
    }
    public MazeSolver(){
        curLoaded = null;
    }
    public void LoadMaze(Maze toLoad){
      curLoaded = toLoad;
    }
    /**
      solve!
     **/
    public boolean solve() {
        //CHECK that there is a maze loaded (important)
        for(int i = 0; i < 1000; i++){
          System.out.print("\b");
        }
        System.out.println(curLoaded);
        if(curLoaded == null){
          throw new RuntimeException("The MazeSolver class" + this + " does not have any maze loaded");
        }

        //solve the currently loaded maze
        //base case 1
        if(curLoaded.explorerIsOnA() == Maze.TREASURE){
          return true; //we are done!
        }
        //base case 2
        if(curLoaded.explorerIsOnA() == Maze.WALL){
          return false; //no
        }

        //test everything one by one
        Maze snapshot = new Maze(curLoaded);

        for(int direction : Maze.getMoves()){
          curLoaded.dropA(Maze.WALL);
          curLoaded.go(direction);
          if(solve()){
            return true;
          }
          curLoaded = new Maze(snapshot);
        }


        //can't move anywhere
        return false;
    }
}
