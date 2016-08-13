abstract class Employee
{
   public String name,eid;
   double hours,rate;
   Employee(String eid,String name,double hours,double rate)
    {
       this.eid=eid;
       this.name=name;
       this.hours=hours;
       this.rate=rate;

    }
  
   public abstract double Salary();
}
class Manager extends Employee
{
   public String empDept;
   public double da;
   public Manager(String eid,String name,double hours,double rate,String empDept,double da)
   {
        super(eid,name,hours,rate);
        this.empDept=empDept;
        this.da=da;
   }
   public double Salary()
    {
            return (hours*rate)+500;

    }
}
class abDemo
{
   public static void main(String[] args)
    {
      Manager m=new Manager("101","Simran",20,10,"IT",500);
      System.out.println(m.Salary());
    }
}