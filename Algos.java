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

	public static void insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void insertionSortResursive(int arr[], int n) {
		if (n == 0 || arr.length == 0 || arr.length == 1) {
			return;
		}

		insertionSortResursive(arr, n - 1);
		for (int i = 0; i < n; i++) {
			if (arr[n] < arr[i]) {
				int temp = arr[i];
				arr[i] = arr[n];
				arr[n] = temp;
			}
		}
	}

	public static void merge(int arr[], int left, int mid, int right) {
		int firstHalf[] = new int[mid - left + 1];
		int secondHalf[] = new int[right - mid];

		for (int i = 0; i < firstHalf.length; i++) {
			firstHalf[i] = arr[left + i];
		}
		for (int i = 0; i < secondHalf.length; i++) {
			secondHalf[i] = arr[mid + 1 + i];
		}
		int i = 0, j = 0, counter = left;
		while (i < firstHalf.length && j < secondHalf.length) {
			if (firstHalf[i] <= secondHalf[j]) {
				arr[counter] = firstHalf[i];
				i++;

			}else {
				arr[counter] = secondHalf[j];
				j++;
			}
			
			counter++;
		}
		while (i < firstHalf.length) {
			arr[counter] = firstHalf[i];
			i++;
			counter++;
		}
		while (j < secondHalf.length) {
			arr[counter] = secondHalf[j];
			j++;
			counter++;
		}

	}

	public static void mergeSort(int[] arr, int left, int right) {
		if(left < right) {
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}
	
	public static void quickSort(int arr[],int start,int end) {
		if(start < end) {
			int pindex = partition(arr,start,end);
			
			quickSort(arr, start, pindex - 1);
			quickSort(arr, pindex + 1, end);
		}
	}
	
	public static int partition(int arr[],int start, int end) {
		int pivot = arr[end];
		int pindex = start - 1,i = start;
		while(i < end) {
			if(arr[i] < pivot) {
				pindex++;
				int temp = arr[i];
				arr[i] = arr[pindex];
				arr[pindex] = temp;
			}
			i++;
		}
		int temp = arr[pindex + 1];
		arr[pindex + 1] = arr[i];
		arr[i] = temp;
		return pindex + 1;
	}
}
}
