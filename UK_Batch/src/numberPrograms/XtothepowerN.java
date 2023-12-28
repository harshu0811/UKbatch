package numberPrograms;

public class XtothepowerN {
	public static void main(String[] args) {
		int x=5;
		int n=4;
		int p=1;
		for(int i=1;i<=n;i++) {
			p*=x;
		}
		System.out.println(p);
	}
}
