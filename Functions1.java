public class Functions1{
  // Create One Function/Method to get emp data
    // method paramaters should contain eid,ename,esal,edesg and return type should be void
    // Write a Print Statement in method and Print it
    public static void main(String[]args){
    Functions1 f=new Functions1();
    f.emp(5,"sai",5000,"manager");
    }
    public static void emp(int eid,String ename,int esal,String edesg)
    {
      System.out.println("id:"+eid+"\n name:"+ename +"\n sal:"+esal +"\n desig:"+edesg);
    }
  }
  