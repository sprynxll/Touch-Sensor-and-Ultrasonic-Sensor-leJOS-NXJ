/*
Program 1: Put the touch sensor to the front of your robot, 
and write a program so that your robot can move around 
obstacles. The pseudo code could be the following: 
	while true 
		Move forward 
		if (touch sensor is pressed) 
			move backward 
			appropriate delay 
			turn right 
in which there is a loop continuously asking the sensor if 
there is a problem and if evasive actions should be taken.
*/

import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;

public class Test5_Attempt1 {
	public static void main(String[] args) throws Exception {
		// Initialize hardware components - LCD display and Buttons
		double diam = 4;
		double trackwidth = 11.8;
//		Button.waitForPress();
		DifferentialPilot robot = new DifferentialPilot(diam, trackwidth, Motor.A, Motor.C);		
		
		TouchSensor touchButton = new TouchSensor(SensorPort.S1); // set up touch sensor to port 1

		Button.waitForPress(); // wait to start until button is pressed

		while (!Button.ESCAPE.isPressed()) {
			robot.forward(); // move forward until touch sensor is pressed
			if (touchButton.isPressed()) // if sensor is pressed, stop, rotate 90 degrees, continue
			{
				robot.stop();
				robot.travel(-10);
				robot.rotate(90);
			}
		}
	}
}
