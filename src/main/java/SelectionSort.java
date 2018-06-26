/*
Selection sort algorithm for array on numbers.
 */

public class SelectionSort {

   public String sort(int[] numbers) {
        return toString(numbers);
   }

   private String toString(int[] array) {
       StringBuilder sb = new StringBuilder();

       for (int num : array) {
           sb.append(num);
       }
       return sb.toString();
   }
}
