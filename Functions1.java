public class Functions1{
// Create One Function/Method to get emp data
  // method paramaters should contain eid,ename,esal,edesg and return type should be void
  // Write a Print Statement in method and Print it
  public static void main(String[]args){
  Functions1 f=new Functions1();
   f.emp(25000,"Astik",76000,"engineer");
  }
  public void emp(int eid,String ename, int  esal, String edesg )
  {
      System.out.println("Enter eid " +eid);
      System.out.println("Enter ename "+ename);
      System.out.println("Enter esal "+esal);
      System.out.println("Enter edesg "+edesg);
  } 
     
     
  
}
