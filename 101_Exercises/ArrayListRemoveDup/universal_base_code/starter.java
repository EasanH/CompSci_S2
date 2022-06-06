import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		// addValuesInt(arr1, 10);
		printValuesInt(arr1);
		removeDup(arr1);		//Create this method.
		System.out.println("\n");
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(new Integer((int)(Math.random()*100)));
			// arr.add(new Integer((int)(Math.random()*10)));
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	
	public static void removeDup(ArrayList<Integer> arr){
		int x;
		for(int i = 0; i < arr.size(); i++){
			x = arr.get(i);
			for(int a = i+1; a < arr.size(); a++){
				// if(arr.get(i) == arr.get(a)){
				if(x == arr.get(a)){
					arr.remove(a);
					a--;
				}
					
			}
		}
	}
}
