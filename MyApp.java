package com.learn.Project;

import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scan = new Scanner(System.in);

        // Creating the array by taking the length as user input
        System.out.println("Enter the length of the Array");
        int[] arr = new int[scan.nextInt()];

        // Storing the elements inside the array
        System.out.println("Enter the Elements to be stored in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        // Printing or asking all the options for the user to press
        System.out.println("Press 1 to check whether Array is sorted or not");
        System.out.println("Press 2 to perform linear Search");
        System.out.println("Press 3 to perform Binary Search");
        System.out.println("Press 4 to sort an array using Bubble sort ");
        System.out.println("Press 5 to sort an array using insertion sort ");
        System.out.println("Press 6 to sort an array using selection sort");
        System.out.println("Press 7 to print minimum element in Array ");
        System.out.println("Press 8 to print maximum element in Array");

        // Storing the user's choice in the variable
        int num = scan.nextInt();

        switch (num) {
            // Check whether the array is sorted
            case 1:
                boolean status = My.checkSort(arr);
                if (status) {
                    System.out.println("The Given Array is Sorted");
                } else {
                    System.out.println("The Given Array is not in Sorted order");
                }
                break;
            // Perform linear search
            case 2:
                System.out.println("Enter the key to be searched in that array");
                int key = scan.nextInt();
                My.linearSearch(arr, key);
                break;
            // Perform binary search
            case 3:
                System.out.println("Enter the key to be searched in that array");
                int key1 = scan.nextInt();
                My.BinarySearch(arr, key1);
                break;
            // Sort array using Bubble Sort
            case 4:
                System.out.println("Array Elements before sorting:");
                for (int x : arr) {
                    System.out.print(x + " ");
                }
                System.out.println();
                int[] bubbleSortedArray = My.bubbleSort(arr.clone());
                System.out.print("Using Bubble Sort Algorithm, the Array elements are sorted: ");
                for (int x : bubbleSortedArray) {
                    System.out.print(x + " ");
                }
                break;
            // Sort array using Insertion Sort
            case 5:
                System.out.println("Array Elements before sorting:");
                for (int x : arr) {
                    System.out.print(x + " ");
                }
                System.out.println();
                int[] insertionSortedArray = My.insertionSort(arr.clone());
                System.out.print("Using Insertion Sort Algorithm, the Array elements are sorted: ");
                for (int x : insertionSortedArray) {
                    System.out.print(x + " ");
                }
                break;
            // Sort array using Selection Sort
            case 6:
                System.out.println("Array Elements before sorting:");
                for (int x : arr) {
                    System.out.print(x + " ");
                }
                System.out.println();
                int[] selectionSortedArray = My.selectionSort(arr.clone());
                System.out.print("Using Selection Sort Algorithm, the Array elements are sorted: ");
                for (int x : selectionSortedArray) {
                    System.out.print(x + " ");
                }
                break;
            // Print minimum element in the array
            case 7:
                int minElement = My.findMinElement(arr);
                System.out.println("Minimum Element in the Array: " + minElement);
                break;
            // Print maximum element in the array
            case 8:
                int maxElement = My.findMaxElement(arr);
                System.out.println("Maximum Element in the Array: " + maxElement);
                break;
            // Handle invalid option
            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }

        // Close the Scanner to prevent resource leaks
        scan.close();
    }
}


