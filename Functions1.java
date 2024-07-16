public class Functions1{
// Create One Function/Method to get emp data
  // method paramaters should contain eid,ename,esal,edesg and return type should be void
  // Write a Print Statement in method and Print it
  

  public static void main(String[]args){
  Functions1 f=new Functions1();
  f.emp(12, "gou", 2000, "dev");
  }
  public static void emp(int eid,String ename,int salary,String edesg){
    System.out.println("id : "+eid);
    System.out.println("name : "+ename);
    System.out.println("salary : "+salary);
    System.out.println("edesg : "+edesg);
  }
}
