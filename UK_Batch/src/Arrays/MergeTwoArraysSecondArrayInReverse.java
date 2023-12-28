package Arrays;

public class MergeTwoArraysSecondArrayInReverse {
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4};
		int[] arr2= {5,6,7,8};
		int k=arr2.length-1;
		int[] result=new int[arr1.length+arr2.length];
		for(int i=0;i<result.length;i++) {
			if(i<arr1.length)
				result[i]=arr1[i];
			else
				result[i]=arr2[k--];
		}
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+"  ");
		}
	}
}
