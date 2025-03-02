import java.util.*;

public class SubArrayEqualsToK {
    public static void main(String args[]) {
        int arr[] = {9,4,20,3,10,5};
        int k = 33;
        HashMap<Integer, Integer> a = new HashMap<>();
        a.put(0,1);
        int ans = 0;
        int sum = 0;

        for(int j : arr) {
            sum+= j;

            if(a.containsKey(sum-k))
            ans += a.get(sum-k);

            if(a.containsKey(sum))
            a.put(sum, a.get(sum)+1);
            else
            a.put(sum, 1);
        }
        System.out.println(ans);
    }
}
