import java.util.function.Function;

public class PrintName {
  // Prepare Function with Name Parameter to get your name
  public static void main(String[] args) {

    PrintName n = new PrintName();
    n.fun1("gautam");

  
  }
  // Complete the Logic
  public static void fun1(String name){
    System.out.println("name is "+name);
  }
}

