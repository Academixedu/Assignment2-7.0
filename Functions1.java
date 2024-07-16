public class Functions1{
  public static void main(String[]args){
  Functions1 f=new Functions1();
  f.emp(504,"Karthik",10000,"Manager");
  }
  public static void emp(int eid,String ename,int esal,String edesg){
    System.out.println("Employee ID: "+eid);
    System.out.println("Employee Name: "+ename);
    System.out.println("Employee Salary: "+esal);
    System.out.println("Employee Designation: "+edesg);
  }
}
