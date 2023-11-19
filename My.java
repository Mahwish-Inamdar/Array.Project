class My {
    // Method to check if the array is sorted
    public static boolean checkSort(int[] arr) {
        // Iterate through the array and check if each element is less than or equal to the next one
        for (int i = 0; i <= arr.length - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // If any pair of elements is out of order, return false
            }
        }
        return true; // If all pairs are in order, return true
    }

    // Method to perform linear search
    public static void linearSearch(int[] arr, int key) {
        // Iterate through the array to find the key
        for (int i = 0; i <= arr.length - 1; i++) {
            if (key == arr[i]) {
                System.out.println("Key found at: " + i + " using The linear Search");
                System.exit(0); // Exit the program after finding the key
            }
        }
        System.out.println("Key not found");
    }

    // Method to perform binary search
    public static void BinarySearch(int[] arr, int key1) {
        int low = 0;
        int high = arr.length;

        // Binary search algorithm
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key1 == arr[mid]) {
                System.out.println("Key found at : " + mid + " using Binary Search");
                return;
            } else if (key1 >= arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Key not found");
    }

    // Method to perform bubble sort
    public static int[] bubbleSort(int[] arr) {
        int temp;
        // Bubble sort algorithm
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = 0; j <= arr.length - i - 2; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;  // Swap elements using temp
                }
            }
        }
        return arr;
    }

    // Method to perform insertion sort
    public static int[] insertionSort(int[] arr) {
        int n = arr.length;
        // Insertion sort algorithm
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    // Method to perform selection sort
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;

        // Selection sort algorithm
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    // Method to find the minimum element in the array
    public static int findMinElement(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int min = arr[0];
        // Iterate through the array to find the minimum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Method to find the maximum element in the array
    public static int findMaxElement(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int max = arr[0];
        // Iterate through the array to find the maximum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
