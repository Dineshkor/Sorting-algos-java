package dataStructures;

public class Algos {

	public static void main(String[] args) {
		int arr[] = {5,2,8,3,7,6,1};
		bubbleSortRecursive(arr, 0);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	public static void bubbleSortRecursive(int arr[], int n) {
		if(n == arr.length || arr.length == 1) {
			return;
		}
		
		bubbleSortRecursive(arr, n + 1);
		for(int i = 0; i < n; i++) {
			if(arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		
	}
}
