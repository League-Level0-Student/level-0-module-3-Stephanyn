import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class ObedientRobot2 {
	public static void main(String[] args) {
	Robot ted = new Robot();
		String input= JOptionPane.showInputDialog("Do you want the rob to draw a square, triangle or a circle?");
		String colour=JOptionPane.showInputDialog("What color? Blue, green, or Purple");
			if(input.equals("square")) {
				drawSquare(ted,80);
			}else if(input.equals("triangle")) {
				drawTriangle(ted,80);
		}else if(input.equals("circle")) {
			drawCircle(ted,3);
		}if(colour.equals("blue")) {
			ted.setPenColor(Color.BLUE);
		}else if(colour.equals("green"));{
		ted.setPenColor(Color.green);
		} if (colour.equals("purple")) {
			ted.setPenColor(Color.magenta);
	}
	}
 	static void drawSquare(Robot rob, int size) {
		 
		rob.setSpeed(100);
		rob.penDown();
		for (int i = 1; i < 5; i++) {
			rob.move(size);
			rob.turn(90);
			
		}
	}
 	static void drawTriangle(Robot rob,int size) {
		rob.setSpeed(100);
		rob.penDown();
		for (int i = 0; i <= 2; i++) {
			rob.move(size);
			rob.turn(360/3);
		
			
		}
			
		}
	
static void drawCircle(Robot rob,int size) {
		rob.setSpeed(150);
		rob.penDown();
		for (int i = 0; i < 360; i++) {
			rob.move(size);
			rob.turn(360/360);
			
		}
}
}
