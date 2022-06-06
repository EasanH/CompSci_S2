import pkg.*;
import java.util.*;

class starter {
	public static int factorial(int base){
		if(base == 1){return 1;}
		else{
			return base * factorial(base-1);
		}
	}
	public static int recurPower(int base, int n){
		if(n == 1){
			return base;
		}
		else{
			return base * recurPower(base, n-1);
		}
	}	

	public static void main(String args[]) {
		System.out.println(factorial(5));
		System.out.println(recurPower(5, 3));
	}
}
