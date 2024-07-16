public class Functions1{
// Create One Function/Method to get emp data
  // method paramaters should contain eid,ename,esal,edesg and return type should be void
  // Write a Print Statement in method and Print it
  public static void Employee(int eid,String ename, int esal,String edseg){
    System.out.println("employee ID:"+eid);
    System.out.println("employee Name:"+ename);
    System.out.println("employee salary:"+esal);
    System.out.println("employee role:"+edseg);
  }
  public static void main(String[]args){
  Functions1 f=new Functions1();
  f.Employee(1209, "syam", 450000 ,"java developer");
  }
}
