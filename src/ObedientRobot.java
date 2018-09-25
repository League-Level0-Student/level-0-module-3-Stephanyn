import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public static void main(String[] args) {
		Robot ted = new Robot();
		drawTriangle(ted,50);
		
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
		for (int i = 0; i <= 3; i++) {
			rob.move(size);
			rob.turn(60);
		
			
		}
			
		}
	}
