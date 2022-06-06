import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		
		
		setThreeArrays(arr1, arr2, arr3);
		System.out.println("------------------Unsorted ArrayList-------------------");
		printArray(arr1);
		System.out.println("\n-----------------Bubble Sort-------------------");
		bubbleSort(arr1);
		printArray(arr1);
		System.out.println("\n-----------------Selection Sort-------------------");
		selectionSort(arr2);
		printArray(arr2);
		System.out.println("\n-----------------Insertion Sort-------------------");
		insertionSort(arr3);
		printArray(arr3);
		System.out.println("\n\nMedian of ArrayList: " + getMedian(arr1));
		
	}
	
	public static void printArray(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	} 
	
	public static void setThreeArrays(ArrayList<Integer> arr1, ArrayList<Integer> arr2, ArrayList<Integer> arr3){
		for(int i = 0; i < 100; i++){
			int x = ((int)(Math.random()*100));
			arr1.add(x);
			arr2.add(x);
			arr3.add(x);
		}
	}
	
	public static int getMedian(ArrayList<Integer> arr){
		int middle = arr.size()/2;
		if(arr.size() % 2 == 0){
			return (arr.get(middle) + arr.get(middle + 1))/2;
		}else{
			return arr.get(middle);
		}
	}
	
	public static void bubbleSort(ArrayList<Integer> arr){
		for(int x = 0; x < arr.size() - 1; x++){
			for(int y = 0; y < arr.size() - 1; y++){
				if(arr.get(y) > arr.get(y+1)){
					int temp = arr.get(y);
					arr.set(y, arr.get(y+1));
					arr.set(y+1, temp);
				}
			}
		}
	}
	
	public static void selectionSort(ArrayList<Integer> arr){
		int min;
		for(int i = 0; i < arr.size(); i++){
			min = i;
			for(int j = i + 1; j < arr.size(); j++){
				if(arr.get(min) > arr.get(j)){
					min = j;
				}
			}
			int temp = arr.get(i);
			arr.set(i, arr.get(min));
			arr.set(min, temp);
		}
	}
	
	public static void insertionSort(ArrayList<Integer> arr){
		int x;
		int y;
		int key;
		
		for(x = 0; x < arr.size(); x++){
			key = arr.get(x);
			y = x - 1;
			
			while(y >= 0 && arr.get(y) > key){
				arr.set(y+1, arr.get(y));
				y--;
			}
			arr.set(y+1, key); 
		}
	}
}
