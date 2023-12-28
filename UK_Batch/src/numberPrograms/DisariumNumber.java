package numberPrograms;

public class DisariumNumber {
	public static void main(String[] args) {
		int num=175;
		int temp=num;
		int sum=0;
		while(num>0) {
			int ld=num%10;
			int count=countDigits(num);
			int power=power(ld, count);
			sum+=power;
			num=num/10;
		}
		if(temp==sum)
			System.out.println(temp+" is disarium no");
		else
			System.out.println(temp+" not disarium no");
	}
	public static int countDigits(int n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}
	public static int power(int x, int n) {
		int p=1;
		for(int i=1;i<=n;i++) {
			p=p*x;
		}
		return p;
	}
	
}
