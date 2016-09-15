import java.util.Scanner;
import java.io.*;

public class MthToLastElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		File outFile = new File ("input.txt");
		FileWriter fWriter = new FileWriter (outFile);
		PrintWriter pWriter = new PrintWriter (fWriter);
		pWriter.println("a b c d 4");
		pWriter.println("e f g h i p 2");
		pWriter.println("i 5");
		pWriter.close();
*/
		File inFile = new File(args[0]);
		Scanner sc = new Scanner(inFile);
		
		while(sc.hasNextLine()) {
			
			String str = sc.nextLine();
			String [] arr = str.split(" ");
			int n = Integer.parseInt(arr[arr.length-1]);
			
			if (n < arr.length)
				System.out.println(arr[arr.length-n-1]);
			
		}
		sc.close();
	}

}
