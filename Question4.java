import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter an integer:");
    int a = in.nextInt();
    for(int b = a;b>0;--b){
      for(int c = 1;c<=b;++c){
        System.out.print("*");
      }
      System.out.println();

    }
    
  }
}
