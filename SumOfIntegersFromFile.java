import java.util.Scanner;
import java.io.*;

public class SumOfIntegersFromFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		File inFile = new File (args[0]);
		
		Scanner sc = new Scanner (inFile);
		
		int total = 0;
		
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			int a = Integer.parseInt(str);
			total+=a;
		}
		
		System.out.println(total);
		
		sc.close();
		
	}

}
