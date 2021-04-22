import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  static int mode(ArrayList<Integer> a,int n) {
      int maxValue = 0, maxCount = 0, i, j;

      for (i = 0; i < n; ++i) {
         int count = 0;
         for (j = 0; j < n; ++j) {
            if (a.get(j) == a.get(i))
            ++count;
         }

         if (count > maxCount) {
            maxCount = count;
            maxValue = a.get(i);
         }
      }
      return maxValue;
   }
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter the number of integers that you will enter later:");
    ArrayList<Integer> aList = new ArrayList<Integer>();
    int number = in.nextInt();

    for(int a = 0;a<number;a++){
      System.out.print("Enter number:");
      int b = in.nextInt();
      aList.add(a, b);
    }
    System.out.print("The mode is:" + mode(aList,number));
  }
}
