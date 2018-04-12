## Members
Matthew Deutsch

Ivan Galakhov

## Statement of problem
Returns the Boolean value of the statement “the maze is navigable, having a legal
travel path that is continuous from start point to existing treasure”

AKA

False -> if its not possible to solve the maze

True -> if it is possible to solve the maze

### 'Legal' means:
> don’t cross the walls

> right-angle turns only

> a path cannot go through the same point twice

## recursive absraction
When I am asked to
  
  solve a maze from start point to treasure that may or may not exist

The recursive abstraction can:

  solve the maze from a point next to the start to treasure that may or may not exist

## base case

The start point is the end point.

The start point is on a wall.

## English or pseudocode description of algorith
```
define solveMaze(start, treasure):
  
  if(start == treasure):
     
     return True //the maze is solved
     
  if(start has no legal moves):
  
     return False //there are no solutions
    
  foreach(neighbor of start):
  
    if(solveMaze(neighbor, end)):
    
      return True
  
  return False
```

## class(es), with fields and methods
## version *n* wish list
