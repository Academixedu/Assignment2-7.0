public class Functions1{
public void Employee(int eid,String ename,int esal,String edesg){

  System.out.println("Employee id is "+ eid);
  System.out.println("Employee name is "+ ename);
  System.out.println("Employee salary is "+ esal);
  System.out.println("Employee Designation  is "+ edesg);
}

  public static void main(String[]args){
  Functions1 f=new Functions1();
  f.Employee(7, "sarvesh", 120000, "Senior Devloper");
  }
}
