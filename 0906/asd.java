	public class asd {
		   public static void main(String[] args) {
		      int count=0, Lotto[] = new int[6], temp;
		      Lotto[count++] = (int)(Math.random()*45)+1;
		      while(true) {
		         Lotto[count++] =(int)(Math.random()*45)+1;
		         for(int i=0;i<count-1;i++)
		            if(Lotto[count-1] == Lotto[i]) {   //중복 true
		               count--;
		               break;            
		            }
		         if(count==Lotto.length) break;
		      }
		    
			      for(int i=0;i<6;i++) // 정렬
			         for(int j=i;j<6;j++)
			            if(Lotto[i]>Lotto[j]) {
			               temp = Lotto[i];
			               Lotto[i]=Lotto[j];
			               Lotto[j]=temp;	          
			            }
		    
		    	  for(int item : Lotto)
			         System.out.print(item + " ");
		      }
		      	
		   
		}