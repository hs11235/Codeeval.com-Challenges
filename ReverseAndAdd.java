import java.io.*;
import java.util.Scanner;

public class ReverseAndAdd {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		File outFile = new File ("input.txt");
		FileWriter fWriter = new FileWriter (outFile);
		PrintWriter pWriter = new PrintWriter (fWriter);
		pWriter.println("195");
		pWriter.println("101");
		pWriter.println("984");
		pWriter.println("782");
		pWriter.println("9067");
		pWriter.close();
*/
		File inFile = new File(args[0]);
		Scanner sc = new Scanner(inFile);
		
		while (sc.hasNext()) {
			
			long n = sc.nextInt();
			int iter = 0;
			
			while (!palindrome(n)) {
				
				int digits = (int)(Math.log10(n)+1);
				long tot = n;
				while (n > 0) {
					tot += ((n%10) * Math.pow(10, digits-1));
					n = n/10;
					digits-=1;

				}
				n = tot;
				iter++;
			}
			System.out.println(iter + " " + n);
		}
		
		sc.close();
	}
	
	static boolean palindrome(long n) {
		
		String str = Long.toString(n);
		
		int [] arr = new int[str.length()];
		
		for (int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i) - '0';
		}
		
		for (int i=0; i<str.length()/2; i++) {
			if (arr[i] != arr[str.length() - (i + 1)])
				return false;
		}
		
		return true;
	}

}
