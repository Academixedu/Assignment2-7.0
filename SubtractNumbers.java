public class SubtractNumbers {
  // Create a Function to get value from the given numbers 
  public static int subtract(int a,int b){
    int result = a - b;
    return result;
  }


  public static void main(String[] args) {
        int result = subtract(7, 2);
        System.out.println("Difference: " + result);
    }
  }