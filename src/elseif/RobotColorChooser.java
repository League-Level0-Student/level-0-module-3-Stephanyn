//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		  Robot Paul = new Robot();
		//3. Ask the user what color they would like the robot to draw
		  for (int c = 0; c <4; c++) {
		  String input = JOptionPane.showInputDialog("What color would you like the robot to use?");
		  
		//5. Use an if/else statement to set the pen color that the user requested
		
		if(input.equals("red")) {
			 Paul.setPenColor(Color.red);
		 } else if (input.equals("blue")) {
			 Paul.setPenColor(Color.blue);
		 }else if(input.equals("green")) {
			 Paul.setPenColor(Color.green);
		 }else 
			Paul.setRandomPenColor();
		
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		 	
		//4. Set the pen width to 10
		      Paul.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
	    Paul.penDown();	
		Paul.setSpeed(60);
		for (int i = 0; i<4; i++) {
		Paul.move(100);		
		Paul.turn(360/4);
					
}
}
}
}				
