import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lowerclass {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		File inFile = new File (args[0]);
		
		Scanner sc = new Scanner (inFile);
		
		while(sc.hasNextLine()) {
			
			String str = sc.nextLine();
			
			str = str.toLowerCase();
			
			System.out.println(str);
			
		}
		
		sc.close();
		
	}

}
