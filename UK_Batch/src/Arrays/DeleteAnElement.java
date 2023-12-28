package Arrays;

import java.util.Scanner;

public class DeleteAnElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {2,3,5,7,9};
		int[] result=new int[arr.length-1];
		int k=0;
		System.out.println("enter element to be deleted :");
		int value=sc.nextInt();//7
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=value) 
				result[k++]=arr[i];
		}
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+"  ");
		}
	}
}
