
public class Ex0906_Array {

	public static void main(String[] args) {
		// 배열 : 동일한 자료형들의 집합
//		int i;
//		int arr[]= {10, 20, 30};
//		for(i =0; i<arr.length; i++) {
//			System.out.println(a[i]);
//		}
		
//=======================================================//
		
		int i,sum=0;
		double avg=1;
		int arr[]=new int[100];
		
		for(i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*30)+1;
			sum= sum+ arr[i];
			avg= (double)sum/arr.length;
			if(i%10==0)
				System.out.println();
			System.out.print(arr[i]+"\t");
			
		}
		for(i=0;i<arr.length;i++) {			
			if(arr[i]<avg)
				System.out.print("\n=>"+arr[i]);
		}
		System.out.println("\n합 : "+sum+"\n평균 : "+avg);
		
		
		
		
	}
}
