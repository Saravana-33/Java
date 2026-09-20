public class Arith_op {
    public static void main(String args[]){
        double a=Integer.parseInt(args[0]);
        double b=Integer.parseInt(args[1]);
        System.out.println("Addition "+(a+b));
        System.out.println("Subtraction "+(a-b));
        System.out.println("Multiplication "+(a*b));
        System.out.println("Divition "+(a/b));
        System.out.println("Modulus "+(a%b));
    }
}