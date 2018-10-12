/*
 This is the code that runs this challenge behind the scenes. You are free to look
 around and change things as long as you do not cheat. Try not to break anything.
 */

package robotMazeChallenge;

public class Maze {
	
	private String[] level = new String[12];
	private String[] levelCopy = new String[12];
	public boolean timer = false;
	private int currentMove = 0;
	private int maxMoves = 0;
	private int levelLength = 0;
	
	void time(int timeLength) {
		timer = true;
		maxMoves = timeLength;
	}
	
	void mapAllowed(boolean allowed) {
		if (allowed) {
			System.out.println("Map is not allowed.");
		} else {
			System.out.println("Map: " + String.join("", levelCopy));
		}
	}
	
	void generate(int l) {
		if (l == 1) {
			level[0] = "R";
			level[1] = "O";
			level[2] = "O";
			level[3] = "O";
			level[4] = "O";
			level[5] = "O";
			level[6] = "O";
			level[7] = "O";
			level[8] = "O";
			level[9] = "F";
		} else if (l == 2) {
			level[0] = "R";
			level[1] = "O";
			level[2] = "O";
			level[3] = "O";
			level[4] = "O";
			level[5] = "O";
			level[6] = "F";
			level[7] = "O";
			level[8] = "O";
			level[9] = "O";
		} else if (l == 3) {
			level[0] = "R";
			level[1] = "O";
			level[2] = "O";
			level[3] = "O";
			level[4] = "O";
			level[5] = "O";
			level[6] = "O";
			level[7] = "O";
			level[8] = "O";
			level[9] = "O";
			level[10] = "O";
			level[11] = "F";
		}else if (l == 4) {
			level[0] = "R";
			level[1] = "O";
			level[2] = "O";
			level[3] = "O";
			level[4] = "O";
			level[5] = "O";
			level[6] = "O";
			level[7] = "O";
			level[8] = "O";
			level[9] = "F";
			level[10] = "O";
			level[11] = "O";
		} else if (l == 5) {
			level[0] = "R";
			level[1] = "O";
			level[2] = "O";
			level[3] = "B";
			level[4] = "O";
			level[5] = "O";
			level[6] = "O";
			level[7] = "O";
			level[8] = "O";
			level[9] = "F";
		} else if (l == 6) { // Turn off map.
			level[0] = "R";
			level[1] = "O";
			level[2] = "O";
			level[3] = "O";
			level[4] = "O";
			level[5] = "O";
			level[6] = "O";
			level[7] = "O";
			level[8] = "F";
			level[9] = "O";
		} else if (l == 7) { // Turn off map.
			level[0] = "R";
			level[1] = "O";
			level[2] = "O";
			level[3] = "O";
			level[4] = "O";
			level[5] = "O";
			level[6] = "F";
			level[7] = "O";
			level[8] = "O";
			level[9] = "O";
		}  else if (l == 8) { // Turn off map.
			level[0] = "R";
			level[1] = "O";
			level[2] = "O";
			level[3] = "O";
			level[4] = "O";
			level[5] = "O";
			level[6] = "O";
			level[7] = "O";
			level[8] = "O";
			level[9] = "O";
			level[10] = "F";
			level[11] = "O";
		}  else if (l == 9) { // Turn off map.
			level[0] = "R";
			level[1] = "O";
			level[2] = "O";
			level[3] = "O";
			level[4] = "O";
			level[5] = "O";
			level[6] = "O";
			level[7] = "B";
			level[8] = "O";
			level[9] = "O";
			level[10] = "F";
			level[11] = "O";
		}  else if (l == 10) { // Turn off map.
			level[0] = "R";
			level[1] = "O";
			level[2] = "O";
			level[3] = "O";
			level[4] = "B";
			level[5] = "O";
			level[6] = "B";
			level[7] = "B";
			level[8] = "O";
			level[9] = "O";
			level[10] = "F";
			level[11] = "O";
		} else {
			System.out.println("Error: Level does not exist.");
			System.exit(0);
		}
		
		levelLength = 12;
		
		for (int x = 0; x < level.length; x++) {
			if (level[x] == null) {
				levelLength--;
				level[x] = "";
			}
		}
		
		levelCopy = level;
	}
	
	public void destroyBolder() {
		int robotPlacement = 0;
		int bolderPlacement = -1;
		
		for (int x = 0; x < levelLength; x++) {
			if (level[x] == "R") {
				robotPlacement = x;
				break;
			}
		}
		
		for (int x = 0; x < levelLength; x++) {
			if (level[x] == "B") {
				bolderPlacement = x;
				break;
			}
		}
		
		if ((robotPlacement + 1) == bolderPlacement) {
			level[bolderPlacement] = "O";
		}
	}
	
	int ultrasonic() {
		int robotPlacement = 0;
		int bolderPlacement = -1;
		
		for (int x = 0; x < levelLength; x++) {
			if (level[x] == "R") {
				robotPlacement = x;
				break;
			}
		}
		
		for (int x = 0; x < levelLength; x++) {
			if (level[x] == "B") {
				bolderPlacement = x;
				break;
			}
		}
		
		if (timer) {
			currentMove += 1;
			
			System.out.println("Moves left: " + (maxMoves - currentMove));
			
			if (currentMove >= maxMoves) {
				System.out.println("Out of moves.");
				System.exit(0);
			}
		}
		
		if (bolderPlacement == -1) {
			return levelLength - robotPlacement;
		} else {
			return levelLength - bolderPlacement;
		}
	}
	
	boolean lightSensor() {
		int flagPlacement = 0;
		
		for (int x = 0; x < levelLength; x++) {
			if (levelCopy[x] == "F") {
				flagPlacement = x;
				break;
			}
		}
		
		if (timer) {
			currentMove += 1;
			
			System.out.println("Moves left: " + (maxMoves - currentMove));
			
			if (currentMove >= maxMoves) {
				System.out.println("Out of time.");
				System.exit(0);
			}
		}
		
		return flagPlacement == 0;
	}
	
	void grabFlag() {
		int flagPlacement = 0;
		
		for (int x = 0; x < levelLength; x++) {
			if (levelCopy[x] == "F") {
				flagPlacement = x;
				break;
			}
		}
		
		if (flagPlacement == 0) {
			System.out.println("You win.");
		} else {
			System.out.println("No flag.");
		}
		
		System.exit(0);
	}
	
	public void moveForward(int steps) {
		int robotPlacement = 0;
		int bolderPlacement = -1;
		
		for (int x = 0; x < levelLength; x++) {
			if (level[x] == "R") {
				robotPlacement = x;
				break;
			}
		}
		
		for (int x = 0; x < levelLength; x++) {
			if (level[x] == "B") {
				bolderPlacement = x;
				break;
			}
		}
		
		if ((robotPlacement + steps) > levelLength) {
			System.out.println(steps + " more steps is too far. Try again.");
			System.exit(0);
			return;
		} else {
			if (bolderPlacement > 0 && ((robotPlacement + steps) >= bolderPlacement)) {
				level[robotPlacement] = "O";
				level[bolderPlacement - 1] = "R";
			} else {
				level[robotPlacement] = "O";
				level[robotPlacement + steps] = "R";
			}
			
			System.out.println(String.join("", level));
		}
		
		if (timer) {
			currentMove += steps;
			
			System.out.println("Moves left: " + (maxMoves - currentMove));
			
			if (currentMove >= maxMoves) {
				System.out.println("Out of moves.");
				System.exit(0);
			}
		}
	}
	
	public void moveBackwards(int steps) {
		moveForward(-steps);
	}
}
