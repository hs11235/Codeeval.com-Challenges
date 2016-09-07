import java.util.Scanner;
import java.io.*;

public class FibonacciSeries {
	
	static int fib(int n) {
		
		if (n==0)
			return 0;
		
		int a=1, b=1;
		
		for (int i=0; i<n-1; i++) {
			int temp = b;
			b+=a;
			a=temp;
		}
		
		return a;
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
/*
		File inFile = new File (args[0]);
		
		Scanner sc = new Scanner (inFile);
		
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			int a = Integer.parseInt(str);
			
			a = fib(a);
			
			System.out.println(a);
		}
		
		sc.close();
		*/
		int a = fib(1);
		System.out.print(a);
	}

}
