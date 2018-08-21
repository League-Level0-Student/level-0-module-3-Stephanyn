
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import java.awt.peer.RobotPeer;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left.
		// You also need to show the robot to see the result of this line.
			
		// 2. Make the robot draw a star shape. Hint: 144.
		rob.penDown();
		rob.setSpeed(30);
		int size = 30;
		int pen = 5;
		for (int i = 0; i < 14; i++) {
			rob.setX(i * 50);
			rob.setY(i * 50);
			for (int j = 0; j < 5; j++) {
				rob.move(size);
				rob.turn(144);
				rob.setRandomPenColor();
				rob.setPenWidth(pen);
				
			}
			size = size +10;
			pen = pen + 10;
		}
		
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this: http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
