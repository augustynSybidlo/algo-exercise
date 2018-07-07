import algorithms.StringCompressor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressorTest {

    private StringCompressor sc;

    @BeforeEach
    void setup() {
        sc = new StringCompressor();
    }

    @Test
    void testCompressStringFirst() {
        String text = "aaabbcccdeff";
        String expected = "a3b2c3def2";
        String actual = sc.compressString(text);
        assertEquals(expected, actual);
    }

    @Test
    void testCompressStringSecond() {
        String text = "abcdf";
        String expected = "abcdf";
        String actual = sc.compressString(text);
        assertEquals(expected, actual);
    }

    @Test
    void testCompressStringWhithOneLetterMultipleTimes() {
        String text = "aaaaaaaaaaa";
        String expected = "a11";
        String actual = sc.compressString(text);
        assertEquals(expected, actual);
    }

    @Test
    void testCompressStringWhenInputIsEmpty() {
        String text = "";
        String expected = "";
        String actual = sc.compressString(text);
        assertEquals(expected, actual);
    }

}