import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		File inFile = new File (args[0]);
		
		Scanner sc = new Scanner (inFile);
		
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			
			String [] arr = str.split("");
			
			int total = 0;
			
			for (int i=0; i<arr.length; i++) {
				total += Integer.parseInt(arr[i]);
			}
			System.out.println(total);
		}
		
		sc.close();
		
	}
}
