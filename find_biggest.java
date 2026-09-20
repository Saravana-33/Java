
import java.util.Scanner;

public class find_biggest {
    public static void main(String args[]){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Three Numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a==b & b==c)
            System.out.println("All the Numbers are Same !");
        else if(a>b & a>c)
            System.out.println("Biggest Number : "+a);
        else if(b>a & b>c)
            System.out.println("Biggest Number : "+b);
        else
            System.out.println("Biggest Number : "+c);
    }
}
