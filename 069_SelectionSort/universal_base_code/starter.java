import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] arr = new int[200];
		for(int i = 0; i < arr.length; i++){
			arr[i] = ((int)(Math.random()*100));
		}
		
		selectionSort(arr);
		printArray(arr);
	}
	
	public static void printArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
	} 
	
	public static void selectionSort(int[] arr){
		int min;
		for(int i = 0; i < arr.length; i++){
			min = i;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[min] > arr[j]){
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}
