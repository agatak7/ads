package Sorting;

public class
QuickSort {

    public static void quickSort(int[] elements) {
        inPlaceQuickSort(elements, 0, elements.length - 1);
    }

    //sorts a sub-array [a...b]
    private static void inPlaceQuickSort(int[] arr, int a, int b) {
        //base case
        if(a>=b) return;

        //select pivot as last element
        int pivot = arr[b];

        //start at both ends
        int left = a;
        int right = b - 1;

        //for swap
        int temp;

        while(left<=right) {

            //traverse from left until elegible element or right marker
            while (left <= right && arr[left] < pivot) left++;

            //same from right
            while (left <= right && arr[right] > pivot) right--;

            //if left/right not crossed, swap
            if (left <= right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        //at the end place pivot at left index
        temp = arr[left];
        arr[left] = arr[b];
        arr[b] = temp;

        //continue recursion
        inPlaceQuickSort(arr, a, left - 1);
        inPlaceQuickSort(arr, left + 1, b);
    }
}
