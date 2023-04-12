import java.util.Arrays;

//second largest no. in array

public class Demo5 {
	
	public static int getSecondArray(int []a, int total) {
		
		Arrays.sort(a);
		return a[total-2];
		
	}

	public static void main(String[] args) {
		
		int []a = {4, 5,8, 23, 12, 7};
		System.out.println("Second Largest>>"+ getSecondArray(a, 6));
	}
}

