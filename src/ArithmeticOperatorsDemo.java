public class ArithmeticOperatorsDemo {
    public static void main(String args []){
        int x, y, r;
        y = 10;
        x = 5;

        r = x + y;
        System.out.println("The Sum of X and Y is " + r);
        r = y - x;
        System.out.println("The Difference of X and Y is " + r);
        r = y * x;
        System.out.println("The product of Y and X is " + r);
        r = y / x;
        System.out.println("The result of dividing Y and X is " + r);
        r = y % x;
        System.out.println("The remainder of dividing Y and X is " + r);
        r = y++;
        System.out.println("Postfix ++ operator resulted in " + r); // does this result in same value as variable?
        r = ++x;
        System.out.println("Prefix ++ operator resulted in " + r); // adds 1 to the variable
        r = -y;
        System.out.println("Unary operator resulted in " + r); // subtracts 1 and makes variable negative?
        // Some examples of special Cases
        int tooBig = Integer.MAX_VALUE + 1; // -2147483648 which is
        // Integer.MIN_VALUE.
        int tooSmall = Integer.MIN_VALUE - 1; // 2147483647 which is
        // Integer.MAX_VALUE.
        System.out.println("tooBig becomes " + tooBig);
        System.out.println("tooSmall becomes " + tooSmall);
        System.out.println(4.0 / 0.0); // Prints: Infinity
        System.out.println(-4.0 / 0.0); // Prints: -Infinity
        System.out.println(0.0 / 0.0); // Prints: NaN
        double d1 = 12 / 8; // result: 1 by integer division. The value of d1 becomes 1.0.
        double d2 = 12.0F / 8; // result: 1.5
        System.out.println("d1 is " + d1);
        System.out.println("d2 is " + d2);



    }
}
