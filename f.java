class Employee
{
   
   public int no1;
   private int no2;
    public void Info()
    {
  System.out.println("info");
    }
   public  void Detail()
    {
   
   System.out.println("Details");
    }
}
class Manager extends Employee
{
   
}
public class f
{
   public static void main(String[] args)
    {
      Manager m=new Manager();
      m.no2=30;
      System.out.println(m.no2);
     }
}