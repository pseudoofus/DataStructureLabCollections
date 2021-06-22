package lab 10;

import java.util.Arrays;

public class lab 10{

    public static void main(String[] args) {
        
        int[] arr = {45, 7, 2, 8, 19, 3};
        // sort Smallest
        selectionSortSmallest(arr);
        // displayArr(arr);
        System.out.println(Arrays.toString(arr));
        // sortLargest
        selectionSortLargest(arr);
        // displayArr(arr);
        System.out.println(Arrays.toString(arr));
        
        // Q4
        int[] arr2 = {10, 34, 2, 56, 7, 67, 88, 42};
        insertionSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    
    public static void selectionSortSmallest(int[] arr){
        // finding smallest element in the array
        for(int i = 0; i<arr.length-1; i++){
            double currentMin = arr[i]; // to hold the smallest element
            int currentMinIndex = i; // to hold the index of the smallest element
            for (int j = i + 1; j < arr.length; j++){ // want to compare the next element of i
                if(currentMin > arr[j]){
                    currentMin = arr[j];
                    currentMinIndex = j;
                }
            }
            
            // swaping the first element with the smallest element
            if (currentMinIndex != 1){
                arr[currentMinIndex] = arr[i];
                arr[i] = (int) currentMin;
            }
        }
    }
    
    public static void selectionSortLargest(int[] arr){
        // finding largest element in the array
        for(int i = 0; i<arr.length-1; i++){ ///only until the second last element of the array to compare with the last element
            double currentMax = arr[i]; // to hold the smallest element
            int currentMaxIndex = i; // to hold the index of the smallest element
            for (int j = i + 1; j < arr.length; j++){ // want to compare the next element of i
                if(currentMax < arr[j]){
                    currentMax = arr[j]; // the larger element into currentMax
                    currentMaxIndex = j;
                }
            }
            
            // swaping the first element with the smallest element
            if (currentMaxIndex != 1){
                arr[currentMaxIndex] = arr[i];
                arr[i] = (int) currentMax;
            }
        }
    }
    
    // optional method to display array
    /*
    public static void displayArr(int[] arr){
        System.out.print("Sorted array: ");
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println("");
    }
*/
    
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){ // loop until the last element of the array
            int currentElement = arr[i]; // set the currentElement as the second element
            int k; // k would be -1 lesser than i, controls the swapping of the element
            for(k = i - 1; k >= 0 && arr[k] > currentElement; k--){ //
                arr[k + 1] = arr[k];
            }
            arr[k + 1] = currentElement; 
        }
    }
}
