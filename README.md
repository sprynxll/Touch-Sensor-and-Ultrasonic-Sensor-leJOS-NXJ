# Touch-Sensor-and-Ultrasonic-Sensor-leJOS-NXJ
Introduction to incorporating and using the leJOS touch sensor and ultrasonic sensor.

The touch sensor works by reacting if it is pressed and released. To use the touch sensor, we first must create an instance of it using the constructor:
  TouchSensor touchButton = new TouchSensor(SensorPort.S1);
To see if the touch sensor was pressed, use the isPressed() method:
  if(touchButton.isPressed())

The Ultrasonic Sensor works by "seeing" objects in front of it by determining the distance it is away.

-------------------------------------------------------------------------------------------------------------------------------------

The first task of this program was to attatch the touch sensor to the front of the robot and write a program to get the robot to avoid obstacles once the touch button is pressed. There is a loop that asks if the touch sensor has a problem and if it is pressed, it will take the actions to avoid the obstacle then continue on.

The second task of this program was to do the same thing as above, but with the ultrasonic sensor instead. If the robot senses an object away from a certain distace, it will back up a given length, rotate, then continue until it senses another obstacle. It will repeat this until the ESCAPE button on the robot is pressed.
