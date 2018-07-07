package algorithms;/*
Method of this class find pair which can sum up
to certain value.
 */

import java.util.HashSet;
import java.util.Set;

public class PairFinder {

    public boolean isPair(int[] numbers, int value) throws IllegalArgumentException {
        if (numbers.length < 2) throw new IllegalArgumentException();

        Set<Integer> numbersMap = new HashSet<>();

        for (int num : numbers) {
            if (numbersMap.contains(value - num)) return true;
            else numbersMap.add(num);
        }
        return false;
    }
}
