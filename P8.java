//You can have as many parameters as you want:

class P8
{
  int modelYear;
  String modelName;

public P8(int year , String name)
{
  modelYear = year;
  modelName = name;
}
public static void main(String args[])
{
  P8 a = new P8(2013 , "BMW");
  System.out.println("modelYear is :"+ a.modelYear);
  System.out.println("modelName is :"+ a.modelName);
}
}