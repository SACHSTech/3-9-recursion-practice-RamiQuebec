package recursion;

public class ReverseString {
    public static String reverse(String str) {
        if (str.equals("")) {
            return str;
        } else {
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }
    public static void main(String[] args) {
        String input = "diddy";
        String output = reverse(input);
        System.out.println(output);
    }
}
