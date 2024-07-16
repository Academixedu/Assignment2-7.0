public class Functions1{
  // Create One Function/Method to get emp data
    // method paramaters should contain eid,ename,esal,edesg and return type should be void
    // Write a Print Statement in method and Print it
    public void empData(int eid,String ename,int esal,String edesg){
  
    System.out.println("employee id is :"+eid);
    System.out.println("employee name is :"+ename);
    System.out.println("employee salary is ::"+esal);
    System.out.println("employee designation is :"+edesg);
  
    }
    public static void main(String[]args){
    Functions1 f=new Functions1();
    f.empData(1, "sankeerthana", 50000,"java developer" );
    }
  }
  