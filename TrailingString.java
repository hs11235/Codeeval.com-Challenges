import java.util.*;
import java.io.*;

public class TrailingString {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		File outFile = new File ("input.txt");
		FileWriter fWriter = new FileWriter (outFile);
		PrintWriter pWriter = new PrintWriter (fWriter);
		pWriter.println("Hello World,World");
		pWriter.println("Hello CodeEval,CodeEval");
		pWriter.println("");
		pWriter.println("San Francisco,San Jose");
		//pWriter.println("3");
		//pWriter.println("1215306625");
		pWriter.close();

		File inFile = new File ("input.txt");
		Scanner sc = new Scanner(inFile);
		
		while (sc.hasNextLine()) {
			
			String str = sc.nextLine();
			
			if (str.equals(""))
				continue;
			
			String[] arr = str.split(",");
			
			if (arr[0].length() >= arr[1].length()) {
			
				if (arr[1].equals(arr[0].substring(arr[0].length() - arr[1].length())))
					System.out.println(1);
				else
					System.out.println(0);
			} else {
				
				System.out.println(0);
			}
		}
		
		sc.close();
	}

}
