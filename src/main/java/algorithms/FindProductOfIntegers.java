package algorithms;

public class FindProductOfIntegers { // find highest product of two integers

    public int findMaxProductOfTwoIntegers(int[] arr) throws IllegalArgumentException {
        if (arr.length < 2) throw new IllegalArgumentException();

        int maxOne = 0;
        int maxTwo = 0;

        int minOne = Integer.MIN_VALUE;
        int minTwo = Integer.MIN_VALUE;


        for (int num : arr) {
            if (num > maxOne) {
                maxTwo = maxOne;
                maxOne = num;
            } else if (num > maxTwo) {
                maxTwo = num;
            } else if (num > minOne) {
                minTwo = minOne;
                minOne = num;
            } else if (num > minTwo) {
                minTwo = num;
            }
        }
        return Integer.max(minOne * minTwo, maxOne * maxTwo);
    }
}
