
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=30;
		boolean c=true;
		for(int i=2;i<num/2;i++) {
			if(num%i==0){
				c=false;
				break;
			}
		}
		if(c!=false) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a Prime number");
		}
	}

}
