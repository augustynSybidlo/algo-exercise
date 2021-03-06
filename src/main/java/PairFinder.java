/*
Method of this class find pair which can sum up
to certain value.
 */

import java.util.HashSet;
import java.util.Set;

public class PairFinder {

    public boolean isPair(int[] numbers, int value) {
        Set<Integer> numbersMap = new HashSet<>();

        for (int num : numbers) {
            if (numbersMap.contains(value - num)) return true;
            else numbersMap.add(num);
        }
        return false;
    }
}
