
import java.util.Scanner;

public class odd_eve {
    public static void main(String args[]){
        int n,even=0,odd=0;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the no of arrays: ");
        n=sc.nextInt();

        int a[]=new int[n];

        System.out.println("Enter the elements in array: ");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
            if(a[i] % 2 == 0)
                even += a[i];
            else
                odd += a[i];
        }
        System.out.println("Even no is: "+even);
        System.out.println("Odd no is: "+odd);
    }
}
