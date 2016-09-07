import java.io.*;
import java.util.Scanner;

public class UniqueElements {
	
	static void simp(int[] a) {
		
		System.out.print(a[0]);
		
		for (int i=1; i<a.length; i++) {
			int n=0;
			for (int j=0; j<i; j++) {
				if (a[j] == a[i]) {
					n++;
					break;
				}
			}
			if (n==0)
				System.out.print("," + a[i]);
		}
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		File inFile = new File (args[0]);
		
		Scanner sc = new Scanner (inFile);
		
		while(sc.hasNextLine()) {
			
			String str = sc.nextLine();
			
			String [] arr = str.split("\\,");
			
			int [] a = new int [arr.length];
			
			for (int i=0; i<arr.length; i++) {
				a[i] = Integer.parseInt(arr[i]);
			}
			
			simp(a);
			System.out.print("\n");
		}
		
		sc.close();
		
	}

}
