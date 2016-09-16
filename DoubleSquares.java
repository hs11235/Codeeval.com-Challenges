import java.util.Scanner;
import java.io.*;

public class DoubleSquares {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File outFile = new File ("input.txt");
		FileWriter fWriter = new FileWriter (outFile);
		PrintWriter pWriter = new PrintWriter (fWriter);
		pWriter.println("5");
		pWriter.println("10");
		pWriter.println("25");
		pWriter.println("3");
		pWriter.println("1215306625");
		pWriter.close();

		File inFile = new File("input.txt");
		Scanner sc = new Scanner(inFile);
		
		while(sc.hasNext()) {
			
			long n = sc.nextLong();
			System.out.println(squares(n));
		}
		sc.close();
	}

	static int squares(long n) {
		
		int pairs = 0;
		long x = (long)(Math.sqrt(n));
		long y = 0;
		
		while (x>y) {
			if (x*x + y*y > n) {
				--x;
			} else if (x*x + y*y == n) {
				pairs++;
				--x;
				++y;
			} else {
				++y;
			}
		}
		
		return pairs;
	}
}
