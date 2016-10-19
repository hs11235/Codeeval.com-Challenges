
import java.io.*;
import java.util.Scanner;

public class NumberOfOnes {

	public static void main(String[] args) throws IOException{
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
		
		while (sc.hasNextLine()) {
			
			String str = sc.nextLine();
			
			int n = Integer.parseInt(str);
			
			System.out.println(ones(n));
		}
		
		sc.close();
	}

	static int ones(int n) {
		
		int ones = 0;
		int x = 0;
		
		while (Math.pow(2, x) < n) {
			++x;
		}
		
		for (int i=x; i>=0; i--) {
			if (n >= Math.pow(2, i)) {
				++ones;
				n -= Math.pow(2, i);
			}
		}
		
		return ones;
	}
}
