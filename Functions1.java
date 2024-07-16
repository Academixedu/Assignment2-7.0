public class Functions1{
// Create One Function/Method to get emp data
  // method paramaters should contain eid,ename,esal,edesg and return type should be void
  // Write a Print Statement in method and Print it
  public static void main (String[]args) {
    Functions1 f=new Functions1();
    f.employee(20987, "PSV SAI MAHESH", 2000, "ASSOCIATE");

  }
  public static void  employee(int Employeeid, String  EmployeeName, int Employeesalary,String designation) {
    System.out.println("Employee ID is " + Employeeid);
    System.out.println("Employee Name is " + EmployeeName);
    System.out.println("Employee salary is " + Employeesalary);
    System.out.println("Employee designation is " + designation);

  }
}
