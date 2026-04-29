public class StringCompression {
    public static void main(String[] args) {
        String input = "aaabbccccdd";
        String compressed = compressString(input);

        System.out.println("Original String: " + input);
        System.out.println("Compressed String: " + compressed);
    }

    public static String compressString(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        String result = "";
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result += str.charAt(i - 1);
                result += count;
                count = 1;
            }
        }

        result += str.charAt(str.length() - 1);
        result += count;

        return result;
    }
}