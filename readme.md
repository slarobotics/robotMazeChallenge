# Warning: As of now the code is not complete and there are some strange bugs. Shocking I know.

# 4454's Robot Maze Challenge

## What is this?

We have been working on a number of challenges this year to teach our large group of new members different skills. So one
of our members decided that programming is a good skill to teach. Since we have been pretty consistant on using challenges
to teach skills we created a Java program that allows people with little or no experience in java to solve a maze using code
sometimes using hardcoding, using loops, or one of our "sensors."

## File Structure

```
robotMazeChallenge
  /src
    Levels.java
    Maze.java
    robot.java
    Tools.java
```

## Level Overview

Levels are generated in `Maze.java` and are ran in `Tools.java`. Levels are in `String[] level`.

### Map Overview

**Example Map:** `ROOOOBOOOOF`

`R`: The robot.

`O`: Empty tile.

`B`: Bolder (Object blocking the way).

`F`: Flag (The goal to pick up).

## File Overview

### Levels.java

This is the file where the code to run robot through the mazes is placed.

`level[One - Ten]()`: Where you place the code that completes the different mazes.

`anyLevel()`: Where you place code that can complete any maze.

### Maze.java (extends Maze.java)

The code that contains the levels, the robot library and other logic.

`time(int timeLength)`: Lets you set the max amount of moves in a level.

`mapAllowed(boolean allowed)`: Lets you set if the user is allowed to view the map while completeing the level.

`generate(int l)`: Generates the level into the `map[]`

`destroyBolder()`: If there is a bolder on the next tile, remove it.

`ultrasonic()`: Returns the distance to the wall or a close bolder.

`lightSensor()`: Returns `true` if there is a flag under the Robot. Will return `false` if not.

`grabFlag()`: If there is a flag under the Robot grab it. If not end the level.

`moveForward(int steps)`: Moves the robot `steps` distance unless there is a bolder or a wall blocking it. If there is a 
bolder blocking the robot place Robot the tile before the bolder. If the Robot "crashes into the wall" end the level.

`moveBackwards(int steps)`: See `moveForward(int steps)` but steps is reversed.

### robot.java

Contains `Tool.run(int l);` where you can set the level.

### Tools.java (extends Levels.java)

Contains functions that help run the maze program.

`random(int min, int max)`: Generates a random integer between `min` and `max`.

`run(int l)`: Generates and runs levels. If `l == 0` run random level.

## Built in Levels

### Level 1

`ROOOOOOOOF`

### Level 2

`ROOOOOFOOO`

### Level 3

`ROOOOOOOOOOF`

### Level 4

`ROOOOOOOOFOO`

### Level 5

`ROOBOOOOOF`

### Level 6

No map allowed.

`ROOOOOOOFO`

### Level 7

No map allowed.

`ROOOOOFOOO`

### Level 8

No map allowed.

`ROOOOOOOOOFO`

### Level 9

No map allowed.

`ROOOOOOBOOFO`

### Level 10

No map allowed.

`ROOOBOBOOOFO`

## Example Robots

### Level 1

```java
void levelOne() {
  // To test set Tool.run to 1 in java
  moveForward(9);
  grabFlag();
}
```

### WIP more example robots.

## Making a Custom Level

Making levels is a little more complicated then I would like it to be but, it's not too hard.

Start in `generate(int l)` in the file `Maze.java`. Add an `else if (l == [level #])` and then for each slot (up to 12 slots) 
add `level[(# of array index])] = ["R", "O", "B" or "F"]`.

Then in the file `Levels.java` add `void level[# in word](){}`. This is where the user will put in the code they want to test
with.

In `Tools.java` add `else if (l == [level #]) {}` in `run(int l)`. Then add `time([# of moves you want allowed])`, 
`mapAllowed([true or false])` and `level[# in word]()`.

# Any questions or concerns?

Create an issue.
