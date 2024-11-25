package recursion;

public class CountUpTimer {
    public static void countUp(int n) {
        if (n == 0) {
            System.out.println(0);
        } else {
            countUp(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        countUp(5);
    }
}