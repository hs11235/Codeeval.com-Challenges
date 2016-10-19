import java.io.*;
import java.util.Scanner;

public class PascalsTriangle {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		File outFile = new File ("input.txt");
		FileWriter fWriter = new FileWriter (outFile);
		PrintWriter pWriter = new PrintWriter (fWriter);
		pWriter.println("5");
		pWriter.println("10");
		pWriter.println("25");
		pWriter.println("3");
		//pWriter.println("1215306625");
		pWriter.close();
		
		File inFile = new File("input.txt");
		Scanner sc = new Scanner(inFile);
		
		while(sc.hasNextInt()) {

		int lines = sc.nextInt();
		
		System.out.print(1);
		
		int n = 1;
		int r = 0;
		
		while (n < lines) {
			
			long a = factorial(n) / (factorial(n-r) * factorial(r));
			System.out.print(" " + a);
			
			if (r == n) {
				
				++n;
				r=0;
			} else {
				
				++r;
			}
		}
		System.out.println();
		}
		sc.close();
	}
	
	static long factorial(int n) {
		
		if (n == 0)
			return 1;
		
		long total = 1;
		
		while (n>1) {
			
			total *= n;
			--n;
		}
		
		return total;
	}

}
