package fi.savonia.exercises;
public class NumberTools {
    // Return true if number is even, including negative even numbers.
    public static boolean isEven(int number) {
        boolean isEven = false;
        if(number%2 == 0)
            isEven = true;
        return isEven; // TODO
    }
    // Sum all integers from 1 through n; for n < 1 return 0.
    public static int sumTo(int n) {
        int x = 0;
        for (int i = 1; i <= n; i++) {
            x += i;
        }
        return x; // TODO
    }
    // Return the greatest of three integers.
    public static int maxOfThree(int a, int b, int c) {
        int x = a;
        if(b > x)
            x = b;
        if (c > x)
            x = c;
        return x; // TODO
    }
}
