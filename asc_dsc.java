import java.util.Scanner;

public class asc_dsc {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements: ");
        for(int i =0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n;i++){
            for(int j=i+1; j<n; j++){
                if(a[i] > a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Ascending order: ");
        for(int i=0; i<n;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("Descending order: ");
        for(int i=n-1; i>=0; i--){
            System.out.println(a[i]+" ");
        }
    }
}
