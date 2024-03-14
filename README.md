# Touch-Sensor-and-Ultrasonic-Sensor-leJOS-NXJ
Introduction to incorporating and using the leJOS touch sensor and ultrasonic sensor.

The touch sensor works by reacting if it is pressed and released. To use the touch sensor, we first must create an instance of it using the constructor:
  TouchSensor touchButton = new TouchSensor(SensorPort.S1);
To see if the touch sensor was pressed, use the isPressed() method:
  if(touchButton.isPressed())

The Ultrasonic Sensor works by "seeing" objects in front of it by determining the distance it is away.
