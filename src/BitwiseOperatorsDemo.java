public class BitwiseOperatorsDemo {
    public static void main(String[] args) {

        int x = 58; // 111010
        int y = 13; // 1101

        System.out.println("x & y : " + (x & y));
        System.out.println("x | y : " + (x | y));
        System.out.println("x ^ y : " + (x ^ y));
        System.out.println("~x : " + (~x));
        System.out.println("x << y : " + (x << y)); // shift left
        System.out.println("x >> y : "+ (x >> y)); // shift right
    }
}
