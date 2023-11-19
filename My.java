package com.learn.Project;


public class My 
{	
	//CheckSorted Method
	public static boolean checkSort(int [] arr)
	{
		for(int i=0; i<=arr.length-2; i++)
		{
			if(arr[i]>arr[i+1])
			{
				return false;
			}
		}
		return true;
	}
	
	//Linear Search 
	public static void linearSearch(int [] arr, int key)
	{
		for(int i=0; i<=arr.length-1; i++)
		{
			if(key == arr[i])
			{
				System.out.println("Key found at: "+i+" using The linear Search");
				System.exit(0);
			}
		}
		System.out.println("Key not found");
	}
	//Binary Search
	public static void BinarySearch(int [] arr, int key1)
	{
		int low = 0;
		int high = arr.length;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(key1 == arr[mid])
			{
				System.out.println("Key found at : "+mid+ " using Binary Search");
				return;
			}
			else if(key1 >= arr[mid])
			{
				low = mid+1;
			}
			else
			{
				high = mid-1;
			}
		}
		System.out.println("Key not found");
	}
	//BubbleSorting Algorithm
	public static int [] bubbleSort(int [] arr)
	{
		for(int i=0; i<= arr.length-2; i++)
		{
			for(int j=0; j<= arr.length-i-2; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}

	
