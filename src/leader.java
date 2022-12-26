
public class leader {
	public static void lea_der(int[] arr){
	int max_right=arr.length-1;
	for(int i=arr.length-2;i>=0;i--){
	if(max_right<arr[i]){
	max_right=arr[i];
	System.out.println(max_right);
			}
		}
	}
	public static void main(String[] args){
	int arr[]={16,17,4,3,5,2};
	lea_der(arr);
	} 
	}


	//time complexity O(n)
