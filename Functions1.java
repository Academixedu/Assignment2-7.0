public class Functions1{

  public void empdata(int eid,String ename,int esal,String edesg)
  {
    System.out.println("employee id "+eid);
    System.out.println("employee name "+ename);
    System.out.println("employee salary"+esal);
    System.out.println("employee desgnation "+edesg);
    
  }
// Create One Function/Method do to get emp data
  // method paramaters should contain eid,ename,esal,edesg and return type should be void
  // Write a Print Statement in method and Print it
  public static void main(String[]args){
    
  Functions1 f = new Functions1();
  f.empdata(123456,"kavitha",50000,"Data Analyst");
  

  
  
  }
}
