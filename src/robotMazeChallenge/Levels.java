/*
 * Todo: fix map showing when it shouldn't and not being able to be displayed
 * when displayMap(false)
 * 
 * Go through all the levels and time how long it takes me to complete them.
 * Find any other bugs that exist.
 */

package robotMazeChallenge;

public class Levels extends Maze {
	// Functions

	// moveForward(steps)
	// movebackwards(steps)
	// grabFlag()
	// destroyBolder()
	
	// Values
	
	// ultrasonic() => true, false
	// lightSensor() => number >= 0
	
	void levelOne() {
		// To test set Tool.run to 1 in java
		moveForward(9);
		grabFlag();
	}
	
	void levelTwo() {
		// To test set Tool.run to 2 in java
		moveForward(1);
		moveForward(1);
		moveForward(1);
		moveForward(1);
		moveForward(1);
		moveForward(1);
		moveForward(1);
		moveForward(1);
		moveForward(1);
		grabFlag();
	}
	
	void levelThree() {
		// To test set Tool.run to 3 in java
		
		moveForward(1);
		moveForward(1);
		
	}
	
	void levelFour() {
		// To test set Tool.run to 4 in java
		
	}
	
	void levelFive() {
		// To test set Tool.run to 5 in java
		
	}
	
	void levelSix() {
		// To test set Tool.run to 6 in java
		
	}
	
	void levelSeven() {
		// To test set Tool.run to 7 in java
		
	}
	
	void levelEight() {
		// To test set Tool.run to 8 in java
		
	}
	
	void levelNine() {
		// To test set Tool.run to 9 in java
		
	}
	
	void levelTen() {
		// To test set Tool.run to 10 in java
		
	}
	
	void anyLevel() {
		// This is for bots that you believe are capable 
		// enough to complete any level. To test set Tool.run 
		// to 0 in java
		
	}
}
