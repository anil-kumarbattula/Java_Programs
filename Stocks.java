import java.util.*;

public class Stocks {
    public static int find(int a[]) {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0; i<a.length; i++) {
            if(buyPrice < a[i]) {
                int profit = a[i] - buyPrice;
                maxProfit = Math.max(profit,maxProfit);
            } else {
                buyPrice = a[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter na value=");
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++) {
            System.out.print("Enter value=");
            a[i] = sc.nextInt();
        }
        System.out.print(find(a));

    }
}
