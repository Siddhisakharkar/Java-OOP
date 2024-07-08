//Create a Car object named myCar. Call the fullThrottle() and speed() methods on the myCar object, and run the program:

class P5{
  public void fullThrottle()
  {
    System.out.println("The car can go in speed as it can!!");
  }
  
  public void speed(int maxSpeed)
  {
    System.out.println("Max speed is :"+ maxSpeed);
  }
  
  public static void main(String args[])
  {
    P5 a = new P5();
    a.fullThrottle();
    a.speed(200);
  }
}