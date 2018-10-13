/*
 * This code allows you to add more levels and add specific rules to the level.
 */

package robotMazeChallenge;

public class Tools extends Levels {
	int random(int min, int max) {
		return (int)((Math.random() * max) + min) ;
	}
	
	void run(int l) {
		int numLevels = 10;
		if (l != 0) {
			generate(l);
		}
		
		if (l == 0) {
			run(random(1, numLevels));
			
			anyLevel();
		} else if (l == 1) {
			time(20);
			mapAllowed(true);
			levelOne();
		} else if (l == 2) {
			time(20);
			mapAllowed(true);
			levelTwo();
		} else if (l == 3) {
			time(20);
			mapAllowed(true);
			levelThree();
		} else if (l == 4) {
			time(20);
			mapAllowed(true);
			levelFour();
		} else if (l == 5) {
			time(20);
			mapAllowed(true);
			levelFive();
		} else if (l == 6) {
			time(20);
			mapAllowed(false);
			levelSix();
		} else if (l == 7) {
			time(20);
			mapAllowed(false);
			levelSeven();
		} else if (l == 8) {
			time(20);
			mapAllowed(false);
			levelEight();
		} else if (l == 9) {
			time(20);
			mapAllowed(false);
			levelNine();
		} else if (l == 10) {
			time(20);
			mapAllowed(false);
			levelTen();
		}
	}
}
