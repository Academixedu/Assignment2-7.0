public class Functions1{
// Create One Function/Method to get emp data
  // method paramaters should contain eid,ename,esal,edesg and return type should be void
  // Write a Print Statement in method and Print it
  public static void main(String[]args){
  Functions1 f=new Functions1();
  f.data(12,"pavani",20000,"developer");
  }
  public void data(int eid,String ename ,int esal,String edesg){
    System.out.println("id is"+eid);
    System.out.println("name is"+ename);
    System.out.println("salary is"+esal);
    System.out.println("designation is"+edesg);


  }
}
