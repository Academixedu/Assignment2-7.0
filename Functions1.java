public class Function {

    public void getEmpData(int eid,String ename,int esal,String edseg)
     {
        System.out.println("Enter your eid"+eid);
        System.out.println("Enter your eid"+ename);
        System.out.println("Enter your eid"+esal);
        System.out.println("Enter your eid"+edseg);
    }
    public static void main(String[] args)
    {
        Function aobj=new Function();
        aobj.getEmpData(100,"Shryash", 100000, "Er");
    }
}
