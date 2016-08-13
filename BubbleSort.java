package SortingAlgos;

import java.util.Scanner;

/**
 * Created by sanjanabadam on 8/11/16.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int i, j, n;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers to be sorted");
        for (i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Starting bubble sort");

        for(i = 0;i<n;i++){
            for(j = i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("After sorting : ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("Each element is compared with all the other elements and the least number is placed at the first position.");
        System.out.println("This algorithm takes O(n*n) time because of the number of comparisons.");
    }

}
