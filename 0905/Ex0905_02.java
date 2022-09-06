
public class Ex0905_02 {

	public static void main(String[] args) {
		//구구단
//		int i,j;
//		for(i=1;i<=9;i++) 
//			for(j =1;j<=9;j++) 
//			System.out.println(i+" X "+j+ " = "+i*j);
		
//=============================================================//
		
//		int i,j,sum=0;
//		for(i=1;i<=10;i++) {
//			for(j=1;j<=i;j++) {
//				if(j==i )
//					System.out.print(j+"=");
//				else
//					System.out.print(j+"+");
//				sum=sum+j;
//			}
//			System.out.println(sum);
//			sum=0;
//		}
//================================================================//
		int a,b,c,count=0; 
		for(a=1;a<=1000;a++) {
			for(b=1;b<=1000;b++) {
				for(c=1;c<=1000;c++) {
					if(a*a+b*b==c*c) {
						System.out.println(a+" "+b+" "+c);
						count++;
					}
				}
			}
		}
		System.out.println("갯수 : "+count);
	}
}
