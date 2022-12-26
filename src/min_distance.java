
public class min_distance {
		public static void mindist(int[] arr,int x,int y) {
			int min_dist=Integer.MAX_VALUE;
			int i,j;
			for(i=0;i<arr.length;i++){
				for(j=i+1;j<arr.length;j++){
					if(arr[i]==x && arr[j]==y || arr[i]==y && arr[j]==x)
					{
						if(min_dist>Math.abs(i-j))
						{
							min_dist=Math.abs(i-j);
						}									
					}
				}
			}
			System.out.println(min_dist);
		}
		public static void main(String[] args) {
			int arr[]= {3,5,4,3,2,6,5,6};
			int x=3;
			int y=6;
			mindist(arr,x,y);
		}
	}

