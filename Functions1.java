public class Functions1{
  public void emp(int EmpId,String EmpName,int EmpSalary,String EmpDesignation){
    System.out.println("Employee id: "+EmpId);
    System.out.println("Employee name: "+EmpName);
    System.out.println("Employee salary: "+EmpSalary);
    System.out.println("Employee designation: "+EmpDesignation);

  }
  public static void main(String[]args){
    Functions1 f=new Functions1();
    f.emp(007, "Verat", 10000000, "CEO");
  }
}
