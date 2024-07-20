public class ReverseString {
    public static String reverse(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        StringBuilder reversed = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }
    public static void main(String[] args) {
        String s = "tree";
        System.out.println("Original string: " + s);
        String reversedString = reverse(s);
        System.out.println("Reversed string: " + reversedString);
    }
}
