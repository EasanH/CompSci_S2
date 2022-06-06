import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {

	//Precondition: A and B are presorted in ascending order. 
	//Sort A and B into C.
	public static void threeMergeSort(int [] A, int []B, int [] C){
		int b = 0;
		int a = 0;
		int i = 0;
		
		while(b < B.length && a < A.length){
			if(A[a]<B[b]){
				C[i++] = A[a++];
			}else{
				C[i++] = B[b++];
			}
		}
		while(b < B.length){
			C[i++] = B[b++];
		}
		
		while(a < A.length){
			C[i++] = A[a++];
		}
	}
	
	public static void merge(int[] A, int first, int mid, int last){
		int[] B = new int[(mid - first) + 1];
		int[] C = new int[(last - mid)];
		
		for(int i = 0; i < B.length; i++){
			B[i] = A[first + i];
		}
		
		for(int i = 0; i < C.length; i++){
			C[i] = A[mid + i + 1];
		}
		
		threeMergeSort(B, C, A);
	}

	//A is the full array unsorted. 
	//First is the beginning index of the array A, last is the last index of the array.
	//Split A in two halves and sort independently. Then merge back into A.
	public static void mergeSort(int [] A, int first, int last){
		int mid = (last-first)/2;
		selectionSort(A, first, mid);
		selectionSort(A, mid + 1, last);
		merge(A, first, mid, last);
	}
	
	public static void printArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
	}
	
	public static void selectionSort(int[] arr, int first, int last){
		int min;
		for(int i = first; i <= last; i++){
			min = i;
			for(int j = i + 1; j <= last; j++){
				if(arr[min] > arr[j]){
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
	
	public static void main(String args[]) {
		int[] arr1 = new int[]{2, 3, 9, 9, 9};
		int[] arr2 = new int[]{5, 1, 3, 7, 10, 4, 6, 8, 2};
		int[] arr3 = new int[arr1.length + arr2.length];
		
		// threeMergeSort(arr1, arr2, arr3);
		mergeSort(arr2, 0, 8);
		printArray(arr2);
		
	}
}
