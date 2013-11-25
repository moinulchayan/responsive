public class StaticDemo2
  {
  public static void show() 
  {
    System.out.println("Hello World"); 
  }
  public static void main(String args[]) 
  {
    show(); // without object   
    StaticDemo2 sd1 = new StaticDemo2();
    sd1.show();      // with object
      StaticDemo2.show(); // with class name
        } }