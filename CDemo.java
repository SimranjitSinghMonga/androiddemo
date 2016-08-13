class Car
{
   private double average;
   
   class Engine
    {
      public void start()
       {

         average=34.5;
      System.out.println(average);
       }
     
    }
  public void start()
   {
Engine e=new Engine();
e.start();
    }

}
public class CDemo
{
  public static void main(String[] args)
   {
      Car c=new Car();
      c.start();
    }
}