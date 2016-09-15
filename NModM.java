import java.io.*;
import java.util.Scanner;

public class NModM {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		File inFile = new File(args[0]);
		
		Scanner sc = new Scanner(inFile);
		
		while (sc.hasNextLine()) {
			
			String str = sc.nextLine();	
			String [] arr = str.split("\\,");
			
			int [] a = new int[arr.length];
			
			for (int i=0; i<arr.length; i++) {
				a[i] = Integer.parseInt(arr[i]);
			}
			
			int temp = a[0] / a[1];
			temp = a[0] - temp * a[1];
			
			System.out.println(temp);
			
		}
		
	}

}
