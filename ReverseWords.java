import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReverseWords {
	
	static void reverse(String str) {
		
		String [] words = str.split("\\s+");

		String [] reversed = new String[str.length()];
		
		for (int i=0; i<words.length; i++) {
			reversed[i] = words[words.length - (i+1)];
			System.out.print(reversed[i]);
			if (i != words.length-1)
				System.out.print(" ");
		}
		
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		String str = "";
		
		File inFile = new File (args[0]);
		
		Scanner sc = new Scanner (inFile);
		
		while(sc.hasNextLine()) {
			str = sc.nextLine();
			if (str != "")
				reverse(str);
			System.out.print("\n");
		}
		
		sc.close();
	}

}
