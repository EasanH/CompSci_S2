import pkg.*;
import java.util.*;

class starter {
	public static int fibSeq(int n){
		if(n == 2){
			return 2;
		}else if(n == 1){
			return 1;
		}else{
			return fibSeq(n-1) + fibSeq(n-2);
		}
	}
	public static void main(String args[]) {
		System.out.println(fibSeq(6));
	}
}
