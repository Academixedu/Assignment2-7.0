

public class Functions1{
    public void empData(int eid, String ename, int esal, String edesg)
    {
      System.out.println("Employee id is "+ eid);
      System.out.println("Employee Name is "+ ename);
      System.out.println("Employee Salary is "+ esal);
      System.out.println("Employee Designation is "+ edesg);
    }
  
  public static void main(String[]args)
  {
  Functions1 f=new Functions1();
    f.empData(25, "Ratan", 80000, "Senior Java Developer");
  }
}
