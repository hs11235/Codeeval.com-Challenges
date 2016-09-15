import java.io.*;
import java.util.*;

public class ArmstrongNumbers {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	/*	
		File outFile = new File ("input.txt");
		FileWriter fWriter = new FileWriter (outFile);
		PrintWriter pWriter = new PrintWriter (fWriter);
		pWriter.println("456");
		pWriter.println("34");
		pWriter.println("678");
		pWriter.println("153");
		pWriter.println("6");
		pWriter.close();
*/
		File inFile = new File(args[0]);
		Scanner sc = new Scanner(inFile);
		
		while (sc.hasNext()) {
			
			int n = sc.nextInt();
			
			if (armstrong(n))
				System.out.println("True");
			else 
				System.out.println("False");
		}
		
		sc.close();
	}

	public static boolean armstrong(int in) {
		
		if (in < 10)
			return true;
		
		int n = in;

		LinkedList<Integer> stack = new LinkedList<Integer>();
		while (n > 0) {
		    stack.push( n % 10 );
		    n = n / 10;
		}
		
		for (int i=0; i<stack.size(); ++i) {
			n += Math.pow(stack.get(i), stack.size());
		}
		
		return (in == n);
	}
}
