import lejos.nxt.*;

public class UltrasonicTester {
	public static void main(String[] args) throws Exception {

		UltrasonicSensor sonic = new UltrasonicSensor(SensorPort.S4);
		while (!Button.ESCAPE.isPressed()) 
		{
			LCD.clear();
			LCD.drawString(sonic.getProductID(), 0, 1);
			LCD.drawString(sonic.getVersion(), 0, 2);
			LCD.drawInt((int) sonic.getRange(), 0, 3);
			try {
				Thread.sleep(10000);
				} 
				catch (Exception e) 
				{
				}
		}
	}
}
