
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0 , b=1;
		System.out.println(a);
		System.out.println(b);
		int n=10,c;
		int i=0;
		for(i=2;i<n;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
