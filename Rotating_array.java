import java.util.*;

public class Rotating_array {
    public static int search(int[] nums, int target) {
        //min will have index of minimum element of nums
        int min = minsearch(nums);
        //find in sorted left
        if(nums[min] <= target && target <= nums[nums.length-1]) {
            return search(nums,min,nums.length-1,target);
        }
        //find in sorted right
        else{
            return search(nums,0,min,target);
        }
    }
    //binary search to find target in left to right boundary
    public  static int search(int [] nums, int left, int right, int target) {
        int l = left;
        int r = right;
        while(l <= r) {
             int mid = l+(r-l)/2;
             if(nums[mid] == target) {
                return mid;
             }
             else if(nums[mid] > target) {
                r = mid-1;
             }
             else{
                l = mid+1;
             }
        }
        return -1;
    }
    //smallest element index
    public static int minSearch(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while(left < right) {
            int mid = left + (right - left)/2;
            if(mid > 0 && nums[mid-1] > nums[mid]) {
                return mid;
            }
            else if(nums[left] <= nums[mid] && nums[mid] > nums[right]) {
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return left;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++) {
            System.out.print("Enter element=");
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter Target=");
        int target=sc.nextInt();
        System.out.println(search(nums,target));
    }
}
