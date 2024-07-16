public class Functions1
{
// Create One Function/Method to get emp data
  // method paramaters should contain eid,ename,esal,edesg and return type should be void
  // Write a Print Statement in method and Print it
public void employe(int eid,String ename,int esal,String edesg )
{
  System.out.println("this is empolye id " + eid);
  System.out.println("this is empolye name " + ename);
  System.out.println("this is empolye sal " + esal);
  System.out.println("this is empolye desg " + edesg);

}

  public static void main(String[]args){

  Functions1 asdf=new Functions1();
  asdf.employe(21, "Abhishek", 150000, "Manager");
 
}
}
