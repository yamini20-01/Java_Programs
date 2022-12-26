import java.util.*;
public class majority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={4,3,4,5,4,6,4,3,4};
		int n=arr.length,index=-1;
		int count,maxCount=0,i;
		Arrays.sort(arr);
		for(i=0;i<n;i++){
			count=0;
			for(int j=0;j<n;j++) {
			if(arr[i]==arr[j]){
			count=count+1;
			}
			if(count > maxCount) 
	        { 
	            maxCount = count; 
	            index = i; 
	        } 
			}
		}
		if(maxCount>n/2){
		System.out.println(arr[index]);
		}
		else{
		System.out.println("There is no majority element");
		}
		
	}

}
