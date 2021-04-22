import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the integer:");
    int a = in.nextInt();
    int output = a * a;
    System.out.print("The out put is:" + output);
    
  }
}
