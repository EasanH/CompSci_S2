import java.util.*;

class starter {
	//Methods go here
	
	public static void printArrayList(ArrayList<Integer> arr){
		for(int x = 0; x < arr.size(); x++)
			System.out.println(arr.get(x));
	}
	
	public static void addValuesArrayList(int n, ArrayList<Integer> arr){
		for(int x = 0; x < n; x++)
			arr.add(0);
	}
	
	

	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.print("Please input how many values you want to add: ");
		int x  = sc.nextInt();
		addValuesArrayList(x, arr);
		printArrayList(arr);
	}
}
