import java.util.Scanner;

public class ArmstrongNumber {
		public static void main(String[] args) {

			// First way

//			Scanner sc=new Scanner(System.in);
//			System.out.print("Enter the number:");
//			int num=sc.nextInt();
//			
//			int n1 = num, n2 = num, count=0;
//			
//			while(num > 0) {
//				count++;
//				num=num/10;
//			}
//			
//			int sum = 0;
//			
//			while(n1 > 0) {
//				
//				int rem = n1 % 10;
//				int mul = 1;
//				for(int i=1; i<=count; i++) {
//					mul = mul * rem;
//				}
//				sum = sum + mul;
//				n1 = n1 / 10;
//			}
//			
//			if(sum == n2) {
//				System.out.println("Armstrong Num");
//			}else {
//				System.out.println("Not Armstrong Numds");
//			}
			
			//Second way 

			int num=153;
			int sum=0,temp,res;
			temp=num;
			
			while(num>0) {
				res=num%10;
				num=num/10;
				sum=sum+(res*res*res);
			}
			if(temp==sum) {
				System.out.println(temp+" "+"is a armstrog number"); 
			}
			else {
				System.out.println("not a armstrong number");
			}
	  }
}
