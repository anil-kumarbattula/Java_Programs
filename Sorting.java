import java.util.*;

public class Sorting {
    public static int[] Bubble_sort(int arr[]) {
        int temp;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] Selection_sort(int arr[]) {
        int minpos,temp;
        for(int i = 0; i < arr.length; i++) {
            minpos = i;
            for(int j = 0+i; j < arr.length; j++) {
                if(arr[minpos] > arr[j])
                minpos = j;
            }
            temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
        return arr;
    }

    public static int[] Insertion_sort(int arr[]) {
        for(int i = 1; i< arr.length; i++) {
            int current = arr[i];
            int prev = i-1;
            while(prev >= 0 && current < arr[prev]) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = current;
        }
        return arr;
    }

    public static int partition(int arr[], int low, int high) {
        int i = low-1;
        int pivot = arr[high];
        for(int j=low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static int[] Quick_sort(int arr[], int low, int high) {
        if(low < high) {
            int pivot = partition(arr, low, high);
            Quick_sort(arr, low, pivot-1);
            Quick_sort(arr, pivot+1, high);
        }
        return arr;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{3,7,1,8,4,2,2};
        System.out.println(Arrays.toString(Quick_sort(arr, 0, arr.length-1)));
    }
    
}
