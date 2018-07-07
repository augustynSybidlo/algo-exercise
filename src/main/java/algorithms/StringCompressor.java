/*
StringCompressor example:
"aaabbccc" -> "a3b2c3"
"aaabc" -> "a3bc"
 */


public class StringCompressor {

    public String compressString(String text) {
        int counter = 1;
        char lastChar = text.charAt(0);
        StringBuilder sb = new StringBuilder();

        for (int x = 1; x < text.length(); x++) {
            if (text.charAt(x) == lastChar) {
                if (x == text.length() - 1) {
                    sb.append(lastChar);
                    sb.append(++counter);
                }
                counter++;
            } else {
                sb.append(lastChar);
                if (counter > 1) sb.append(counter);
                lastChar = text.charAt(x);
                if (x == text.length() - 1) sb.append(lastChar);
                counter = 1;
            }
        }
        return sb.toString();
    }
}
