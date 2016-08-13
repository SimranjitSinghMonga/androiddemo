abstract class Employee
{
 
    public abstract void salary();
   
   public void Detail()
    {
  System.out.println("Details");
    }
}
class Manager extends Employee
{
   public void salary()
    {
    System.out.println("Manager salary");
    }
}
class Admin extends Employee
{
   public void salary()
    {
  System.out.println("Admin salary");
    }
}
public class C
{
   public static void main(String[] args)
    {
      Employee e=new Employee();
      Manager m=new Manager();
      Admin a=new Admin();
      m.salary();
      a.salary();
    }
}