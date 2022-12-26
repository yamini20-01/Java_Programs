
public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,51,25,20,35};
		int c1=0,c2=0;
		int n=arr.length;
		int j=0;
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				ar[j]=arr[i];
				c1++;
				j++;
			}	
		}
		System.out.print("Even numbers : " + "[");
		for(int i=0;i<c1;i++)
		{
			System.out.print(ar[i]+ " " );
		}
		System.out.print("]");
		
		System.out.println();		
		
		int k=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				a[k]=arr[i];
				c2++;
				k++;
			}
		}
		
		System.out.print("Odd numbers : " + "[");
		
		for(int i=0;i<c2;i++) {
			System.out.print(a[i]+ " ");
		}
		
		System.out.print("]");
	}
}
