package Arrays;

public class MergeTwoArraysZigZagFashion {
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4};
		int[] arr2= {5,6,7,8};
		int k1=0;
		int k2=arr2.length-1;
		int[] result=new int[arr1.length+arr2.length];
		for(int i=0;i<result.length;i++) {
			if(i%2==0)
				result[i]=arr1[k1++];
			else
				result[i]=arr2[k2--];
		}
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+"  ");
		}
		
	}
}
