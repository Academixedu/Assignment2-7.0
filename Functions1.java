public class Functions1{
// Create One Function/Method to get emp data
// method paramaters should contain eid,ename,esal,edesg and return type should be void
// Write a Print Statement in method and Print it

public void employeData(int eid,String ename,int esal,String edesg){
  System.out.println("Employee id:" +eid);
  System.out.println("Employee name:" +ename);
  System.out.println("Employee salary:" +esal);
  System.out.println("Employee designation:" +edesg);
}

  public static void main(String[]args){
  Functions1 f=new Functions1();
  f.employeData(12345,"Sujatha",30000, "Software Developer");

  }

  }


