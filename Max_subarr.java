import java.util.*;

public class Max_subarr {
    public static int kadans(int a[]) {
        int ms=a[0];
        int cs=a[0];
        for(int i=0; i<a.length; i++) {
            // cs = cs+a[i];
            // if(cs<0){
            //     cs=0;
            // }
            // ms=Math.max(cs,ms);
            ms=Math.max(a[i],cs+a[i]);
            if(ms<cs) {
                ms=cs;
            }
        }
        return ms;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++) {
            System.out.print("Enter element=");
            a[i]=sc.nextInt();
        }
        System.out.print("Max Sub array sum is=" + kadans(a));
    }
}
