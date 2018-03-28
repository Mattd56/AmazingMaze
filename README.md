## Members
Matthew Deutsch

Ivan Galakhov

## Statement of problem
Returns the Boolean value of the statement “the maze is navigable, having a legal
travel path that is continuous from start point to existing treasure”
Navigate a maze form start to finish
### 'Legal' means:
> don’t cross the walls

> right-angle turns only

> a path cannot go through the same point twice

## recursive absraction
When I am asked to
  
  solve a maze from start point to end point 

The recursive abstraction can:

  solve the maze from a point next to the start to the end point

## base case

The start point is the end point.

## English or pseudocode description of algorith
define solveMaze(start, end):
  
  if(start == end):
     
     return True //the maze is solved
    
  foreach(legal neighbor of start):
  
    if(solveMaze(neighbor, end)):
    
      return True
  
  return False

## class(es), with fields and methods
## version *n* wish list
