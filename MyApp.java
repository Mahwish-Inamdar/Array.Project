package com.learn.Project;

import java.util.Scanner;

public class MyApp {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		//Creating the array
		System.out.println("Enter the length of the Array");
		int [] arr = new int [scan.nextInt()];
		
		
		//Storing the elements inside the array
		System.out.println("Enter the Elements to be stored in the array");
		for(int i=0; i<=arr.length-1; i++)
		{
			arr[i] = scan.nextInt();
		}
		
		//Printing or asking all the options for user to press
		System.out.println("Press 1 to check whether Array is sorted or not");
		System.out.println("Press 2 to perform linear Search");
		System.out.println("Press 3 to perform Binary Search");
		System.out.println("Press 4 to sort an array using Bubble sort ");
		System.out.println("Press 5 to sort an array using insertion sort ");
		System.out.println("Press 6 to sort an array using selection sort");
		System.out.println("Press 7 to print minimum element in Array ");
		System.out.println("Press 8 to print maximum element in Array");
		//storing in the variable
		int num = scan.nextInt();
		
		switch(num)
		{
		case 1:
			boolean status = My.checkSort(arr);
			if(status == true)
			{
				System.out.println("The Given Array is Sorted");
			}
			else
			{
				System.out.println("The Given Array is not in Sorted order");
			}
			break;
		case 2:
			System.out.println("Enter the key to be searched in that array");
			int key = scan.nextInt();
			My.linearSearch(arr , key);
			break;
			
		case 3:
			System.out.println("Enter the key to be searched in that array");
			int key1 = scan.nextInt();
			My.BinarySearch(arr, key1);
			break;
			
		case 4:
			System.out.println("Array Elements before the sorted are:");
			for(int x : arr)
			{
				System.out.print(x+ " ");
			}
			System.out.println();
			int[] sortedArray = My.bubbleSort(arr);
			System.out.print("Using Bubble Sort Algorithem The Array elements are sorted:");
			System.out.println();
			for(int  x : sortedArray)
			{
				System.out.print(x + " ");
			}
			break;
			
		case 5:
			
		default:
            System.out.println("Invalid option. Please choose a valid option.");

		}

	}

}
