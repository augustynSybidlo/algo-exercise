/*
Class with method that checks,
if two strings are permutations of each other.
 */

public class Permutation {

    public boolean isPermutation(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) return false;
        else if (!str1.equals(str2)) {
            int[] buffer = new int[256];

            for (int x = 0; x < str1.length(); x++) {
                buffer[str1.charAt(x)]++;
                buffer[str2.charAt(x)]--;
            }

            for (int count : buffer) {
                if (count != 0) return false;
            }
        }
        return true;
    }
}
