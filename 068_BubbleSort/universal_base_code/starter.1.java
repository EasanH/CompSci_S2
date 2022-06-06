import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] arr = new int[200];
		for(int i = 0; i < arr.length; i++){
			arr[i] = ((int)(Math.random()*100));
		}
		bubbleSort(arr);
		printArray(arr);
	}
	
	public static void bubbleSort(int[] arr){
		for(int x = 0; x < arr.length - 1; x++){
			for(int y = 0; y < arr.length - 1; y++){
				if(arr[y] > arr[y+1]){
					int temp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
				}
			}
		}
	}
	
	public static void printArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
	} 
}
