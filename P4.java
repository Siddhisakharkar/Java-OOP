//An example to demonstrate the differences between static and public methods:
class P4{
  
  static void myStaticMethod()
  {
  System.out.println("Static method can be called without creating an object");
  }
  public void myPublicMethod()
  {
    System.out.println("Public  method can be called with creating an object");
  }
  public static void main(String args[]){
  myStaticMethod();
  
  P4 obj = new  P4();
  obj.myPublicMethod();
  }
}