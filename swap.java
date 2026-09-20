
import java.util.Scanner;

public class swap {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a First No: ");
        int a = sc.nextInt();

        System.out.println("Enter a Second No: ");
        int b = sc.nextInt();

        System.out.println("--------------------");
        System.out.println("Before Swapping:");
        System.out.println("a = "+a);

        System.out.println("b = "+b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("--------------------");
        System.out.println("After Swapping:");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        sc.close();
    }
}
