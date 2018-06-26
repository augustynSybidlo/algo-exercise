/*
Selection sort algorithm for array on numbers.
 */

public class SelectionSort {

   public String sort(int[] numbers) {
       for (int x = 0; x < numbers.length; x++) {
           for (int y = x; y < numbers.length; y++) {
               if (numbers[x] > numbers[y]) {
                   int temp = numbers[x];
                   numbers[x] = numbers[y];
                   numbers[y] = temp;
               }
           }
       }
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
