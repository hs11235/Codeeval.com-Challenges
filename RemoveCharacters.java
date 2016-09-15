import java.io.*;
import java.util.*;

public class RemoveCharacters {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File outFile = new File ("input.txt");
		FileWriter fWriter = new FileWriter (outFile);
		PrintWriter pWriter = new PrintWriter (fWriter);
		pWriter.println("how are you, abc");
		pWriter.println("hello world, def");
		pWriter.close();

		File inFile = new File("input.txt");
		Scanner sc = new Scanner(inFile);
		
		while(sc.hasNextLine()) {
			
			String str = sc.nextLine();
			String [] arr = str.split(", ");
			str = arr[0];
			String [] letters = arr[1].split("");
			
			for (int i=0; i<letters.length; i++) {
				str = str.replace(letters[i], "");
			}
			
			System.out.println(str);
		}
		sc.close();
	}

}
