
import java.util.Arrays;

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.printf("Enter %d number", size);
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
//        Arrays.sort(arr);
        Bubbles(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter a number to Search: ");

        int num = s.nextInt();
        
        if(BinarySearch(arr, num)!=-1){
            System.out.println("Element Found at index ");
        }
        int[] newarr = arr.clone();
        int[] a =(Frequen(arr,arr.length));
        methods(arr, a);


    }


    static int[] Bubbles(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    static int BinarySearch(int[] a, int num) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == num) {
                return mid;
            } else if (a[mid] < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1;
    }

    static int[] Frequen(int[] arr,int n) {

        int[] newarr = new int[n];

        int value = 1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[i] == arr[j]) {
                    value += 1;

                }
            }
            newarr[i] = value;

        }
        return newarr;
    }

    static void methods(int[] old, int[] newarr) {
        for (int i = 0; i < old.length; i++) {

            System.out.println(old[i] + " : " + newarr[i]);

        }
    }
}
