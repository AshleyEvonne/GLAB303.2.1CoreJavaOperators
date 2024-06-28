public class LogicalOperatorsDemo {
    public static void main(String[] args){
        boolean x = true;
        boolean y = false;
        System.out.println("x & y : "+(x & y)); // both values have to be true
        System.out.println("x && y : "+(x && y)); // both values have to be true
        System.out.println("x | y : "+(x | y)); // either values have to be true
        System.out.println("x || y : "+(x || y)); // either value has to be true
        System.out.println("x ^ y : "+ (x ^ y)); //idk what this actually does....
        System.out.println("!x : "+(!x)); // (!) not true gives false
    }
}
