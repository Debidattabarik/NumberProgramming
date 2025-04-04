import java.util.Scanner;

public class Pallindrom {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			int n=sc.nextInt();
			int rev=0;
			int n1=n;
			while(n>0) {
				int digit=n%10;
				rev=rev*10+digit;
				n=n/10;		
		}
			System.out.println(rev);
			if(rev==n1) System.out.println("palindrome");
			else System.out.println("not palindrome");
	}
}
