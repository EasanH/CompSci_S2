import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] arr = new int[200];
		for(int i = 0; i < arr.length; i++){
			arr[i] = ((int)(Math.random()*100));
		}
		
		insertionSort(arr);
		printArray(arr);
	}
	
	public static void printArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
	} 
	
	public static void insertionSort(int[] arr){
		int x;
		int y;
		int key;
		
		for(x = 0; x < arr.length; x++){
			key = arr[x];
			y = x - 1;
			
			while(y >= 0 && arr[y] > key){
				arr[y + 1] = arr[y];
				y--;
			}
			arr[y + 1] = key; 
		}
	}
}
