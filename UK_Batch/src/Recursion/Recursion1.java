package Recursion;

public class Recursion1 {
	public static void main(String[] args) {
		test(1,20);
	}
	//recursive
	public static void test(int start, int end) {
		if(start%2==0)
			System.out.println(start);
		start++;
		if(start<=end)
			test(start,end); 
		else
			return;
	}
	
}
