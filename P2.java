//Change the value of x to 75 in myObj2, and leave x in myObj1 unchanged:
class P2{
  int x = 10;
  
  public static void main(String args[])
  {
    P2 a = new P2();
    P2 b = new P2();
    a.x = 30;
    
    System.out.println(a.x);
    System.out.println(b.x);
  }
  
}