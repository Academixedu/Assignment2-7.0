public class Functions1{
// Create One Function/Method to get emp data
  // method paramaters should contain eid,ename,esal,edesg and return type should be void
  // Write a Print Statement in method and Print it
  public static void main(String[]args){
  Functions1 f=new Functions1();
  f.emp(516,"nayeem",200000,"ceo");
  }

  public static void emp(int eid,String ename,int esal , String edesg){
    System.out.println("employee id is :"+eid);
    System.out.println("employee id is :"+ename);
    System.out.println("employee id is :"+esal);
    System.out.println("employee id is :"+edesg);
  }
  
}
