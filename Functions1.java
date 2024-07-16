public class Functions1{
  public void Employee(int eid,String ename,int esal,String edesg){

    System.out.println("the Basic employee ID "+ eid);
    System.out.println("the Basic employee name "+ ename);
    System.out.println("the Basic employee salary "+ esal);
    System.out.println("the Basic employee designation "+ edesg);
  }
// Create One Function/Method to get emp data
  // method paramaters should contain eid,ename,esal,edesg and return type should be void
  // Write a Print Statement in method and Print it
  public static void main(String[]args){
  Functions1 f=new Functions1();
  f.Employee(15, "ram", 80000,"manager");
  }
}
