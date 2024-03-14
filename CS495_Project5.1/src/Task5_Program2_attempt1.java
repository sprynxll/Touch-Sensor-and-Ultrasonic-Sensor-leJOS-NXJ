/*
Write a program that allows your robot to wander around in an area, 
avoiding collisions with walls using the sonar sensor. It should start when you 
press the ENTER key, and stop to press the ESCAPE key, and constantly show off 
the distance in its LCD.  Also the code for this robot can tell it to back up a certain 
distance if the range finder detects an obstacle, rotate away from the object, and 
then proceed again.
 */

import lejos.nxt.Motor;
import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;

public class Task5_Program2_attempt1 {
	public static void main(String[] args) throws Exception {
		// Initialize hardware components - LCD display and Buttons
		double diam = 4.0;
		double trackwidth = 11.8;
		Button.waitForPress();
		DifferentialPilot pilot = new DifferentialPilot(diam, trackwidth, Motor.A, Motor.C);	

		UltrasonicSensor ultraSonic = new UltrasonicSensor(SensorPort.S2); // set up ultrasonic sensor
		while(!Button.ESCAPE.isPressed())
		{
			float distance;
			distance = ultraSonic.getDistance();
			while(distance > 15) // move forward until distance from object is 15 cm
			{
				pilot.forward();
				distance = ultraSonic.getDistance();
			}
			if(distance <=15) // if object is closer than 15 cm then backup to 20 cm
			{
				while(distance <= 20)
				{
					pilot.backward();
					distance = ultraSonic.getDistance();
				}
				Thread.sleep(1000); // give time after backing up before rotation
				pilot.rotate(90); // rotate 90 degrees
			}
		}
	}
}
