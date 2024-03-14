import lejos.nxt.LCD;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;

public class TouchTester {
	public static void main(String[] args) throws Exception {
		
		TouchSensor touch = new TouchSensor(SensorPort.S1);
		
		while (!touch.isPressed()) 
		{
			// try again 
		}
		
		LCD.drawString("Finished",3,4);
		
		try{
			Thread.sleep(10000);
			} 
		catch(Exception e) 
			{
			}
	} 
}
