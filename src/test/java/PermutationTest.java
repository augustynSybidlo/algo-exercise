import algorithms.Permutation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationTest {

    private Permutation permutation;

    @BeforeEach
    void setup() {
        this.permutation = new Permutation();
    }

    @Test
    void testPermutationWhenStringAreSame() {
        String str1 = "abcd";
        String str2 = "abcd";
        assertTrue(() -> permutation.isPermutation(str1, str2));
    }

    @Test
    void testPermutationWhenStringAreDifferent() {
        String str1 = "efgh";
        String str2 = "abcd";
        assertFalse(() -> permutation.isPermutation(str1, str2));
    }

    @Test
    void testPermutationWhenStringAreSimilar() {
        String str1 = "dcab";
        String str2 = "abcd";
        assertTrue(() -> permutation.isPermutation(str1, str2));
    }

    @Test
    void testPermutationWhenStringAreDifferentByLetterCase() {
        String str1 = "ABCD";
        String str2 = "abcd";
        assertFalse(() -> permutation.isPermutation(str1, str2));
    }

    @Test
    void testPermutationWhenStringAreSameByLetterCase() {
        String str1 = "ABCD";
        String str2 = "DBCA";
        assertTrue(() -> permutation.isPermutation(str1, str2));
    }


}