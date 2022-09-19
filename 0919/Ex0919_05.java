
public class Ex0919_05 {

	public static void main(String[] args) {
		int a = 10, b = 10;
		int arr[] = new int[5];
		try {
			System.out.println(a/b);
			arr[50] = 10;
		}catch (ArithmeticException e) {
			System.out.println("0으로 나누면 안됩니다.");
		}catch(ArrayIndexOutOfBoundsException e1){
			System.out.println("첨차 범위 오류");
		}
		finally{
			System.out.println("파일을 닫습니다.");
		}
	}

}
