import java.util.*;
public class Trapping_rainwater {
    public static int water(int height[]) {
        int n = height.length;
        //max left elements
        int maxLeft[] = new int[n];
        maxLeft[0] = height[0];
        for(int i=1; i<n; i++) {
            maxLeft[i] = Math.max(height[i],maxLeft[i-1]);
        }
        int maxRight[] = new int[n];
        maxRight[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            maxRight[i] = Math.max(height[i],maxRight[i+1]);
        }

        int trappedwater = 0;
        for(int i=0; i<n; i++) {
            int w = Math.min(maxLeft[i], maxright[i]);
            trappedwater += w - height[i]; 
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value=");
        int n = sc.nextInt();
        int height[] = new int[n];
        for(int i=0; i<n; i++) {
            System.out.print("Enter value=");
            height[i] = sc.nextInt();
        }
        System.out.print("Total water=" + water(height));
    }
}
