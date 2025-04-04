import java.util.Scanner;

public class FiboncciSeries {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt(), a=0, b=1, c;
			
			System.out.println("fiboncci series");
			
			for(int i=1;i<=n;i++) {
				System.out.print(a+",");
				
				c=a+b;
				a=b;
				b=c;
			}
	   }
}
