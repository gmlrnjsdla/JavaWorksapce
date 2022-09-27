package practice;

public class Ex0166p07 {

	public static void main(String[] args) {
		int sum = 0; 
		int arr[] = new int[10];
		
		System.out.print("랜덤한 정수들 : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			System.out.print(arr[i]+" ");
			sum = sum + arr[i];
		}
		System.out.println("");
		System.out.println("평균은 : "+(double)sum/arr.length);
	}

}
