public class Functions1{
// Create One Function/Method to get emp data
  // method paramaters should contain eid,ename,esal,edesg and return type should be void
  // Write a Print Statement in method and Print it
  public static void main(String[]args){
  Functions1 f=new Functions1();
  f.emp(07,"MANI", 100000, "Sr.developer");


  }
  public static void emp(int id,String ename,int esal,String edesg)
  {
    System.out.println("Employee id is "+id);
    System.out.println("Employee name is "+ename);
    System.out.println("Employee salary is "+esal);
    System.out.println("Employee designation is "+edesg);

  }
}
