package SortingAlgos;

import java.util.Scanner;

/**
 * Created by sanjanabadam on 8/11/16.
 */
public class QuickSort {

    public static void main(String[] args) {
        int i,n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers to be sorted");
        for (i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int[] result = qs(arr,0,n-1);
        System.out.println("After sorting : ");
        for (i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

    }

    public static int[] qs(int[] arr, int l,int r){

        int part = partition(arr,l,r);
        if(l<part-1) {
            qs(arr, l, part - 1);
        }
        if(r>part) {
            qs(arr, part, r);
        }
        return arr;

    }

    public static int partition(int[] list, int left, int right){
        int mid = (left+right)/2;
    while(left<=right){
        while(list[left]<list[mid]){
            left++;
        }
        while(list[mid]<list[right]){
            right--;
        }
        if(left<=right){
            int temp = list[left];
            list[left] = list[right];
            list[right] = temp;
            left++;
            right--;
        }
}
    return left;
    }

}
