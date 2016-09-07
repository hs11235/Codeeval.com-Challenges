import java.io.File;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class MultiplesOfANumber {
	
	static int multiple(int x, int n) {
		
		int temp = n;
		
		while(temp<x) {
			temp+=n;
		}
		
		return temp;
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/*
		File outFile = new File ("input.csv");
		FileWriter fWriter = new FileWriter (outFile);
		PrintWriter pWriter = new PrintWriter (fWriter);
		pWriter.println("1778,2");
		pWriter.println("2056,256");
		pWriter.println("1946,64");
		pWriter.close();
		*/
		File inFile = new File (args[0]);
		
		Scanner sc = new Scanner (inFile);
		
		while(sc.hasNextLine()) {
			
			String str = sc.nextLine();
			
			String [] arr = str.split("\\,");
			
			int [] a = new int [arr.length];
			
			for (int i=0; i<arr.length; i++) {
				a[i] = Integer.parseInt(arr[i]);
			}
			
			int temp = multiple(a[0], a[1]);
			
			System.out.println(temp);
		}
		sc.close();
	}

}
