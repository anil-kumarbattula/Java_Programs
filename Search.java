import java.util.*;

public class Search {
    public static void linear_search(int a[],int k) {
        for(int i=0; i<a.length; i++) {
            if(a[i] == k) {
                System.out.print("Key is found" + k);
            }
        }
        System.out.print("Key does not exist");
    }

    public static void binary_search(int a[],int k) {
        int start = 0, end = a.length-1;
        while(start <= end) {
            int mid = (start+end) / 2;
            if(a[mid] == k) {
                System.out.print("Key is found" + k);
                break;
            }
            if(k > a[mid]) {
                start = mid+1;;
            }
            else {
                end = end-1;
            }

        }
        System.out.print("Key does not exist");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array Size=");
        int n = sc.nextInt(); 
        int a[] = new int[n];
        for(int i=0; i<a.length; i++){
            System.out.print("Enter value=");
            a[i]=sc.nextInt();
        }
        System.out.print("Enter key value=");
        int k=sc.nextInt();
        binary_search(a,k);
    }
}
