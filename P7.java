//Create a constructor:

class P7
{
  int x;
  
  public P7(int y) // Constructor
  {
    x = y;
  }
  
  public static void main(String args[])
  {
    P7 a = new P7(10);
    System.out.println(a.x);
  }
}