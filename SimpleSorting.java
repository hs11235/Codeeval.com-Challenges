import java.util.*;
import java.io.*;

public class SimpleSorting {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/*
		File outFile = new File ("input.csv");
		FileWriter fWriter = new FileWriter (outFile);
		PrintWriter pWriter = new PrintWriter (fWriter);
		pWriter.println("70.920 -38.797 14.354 99.323 90.374 7.581");
		pWriter.println("-37.507 -3.263 40.079 27.999 65.213 -55.552");
		pWriter.println("-39.238 -46.697 -41.867 50.697 77.405 22.736 -98.101 -52.283 72.251 39.785 -71.149");
		pWriter.println("-22.955 49.513 -66.504 -95.914 -71.220 37.577 -58.484 -4.578 -45.628 9.823 49.231 48.544 84.263 17.998 -99.102 -59.382");
		pWriter.println(".262 -63.961 83.290");
		pWriter.close();
		*/
		File inFile = new File(args[0]);
		Scanner sc = new Scanner(inFile);
		
		while (sc.hasNextLine()) {
			
			String str = sc.nextLine();
			String [] arr = str.split(" ");
			double [] int_arr = new double[arr.length];
			
			for (int i=0; i<arr.length; i++) {
				int_arr[i] = Double.parseDouble(arr[i]);
			}
			
			for (int i=int_arr.length; i>0; i--) {
				for (int j=0; j<i-1; j++) {
					if(int_arr[j] > int_arr[j+1]) {
						double temp = int_arr[j];
						int_arr[j] = int_arr[j+1];
						int_arr[j+1] = temp;
					}
				}
			}
			
			System.out.printf("%.3f", int_arr[0]);
			
			for (int i=1; i<int_arr.length; i++) {
				System.out.print(" ");
				System.out.printf("%.3f", int_arr[i]);
			}
			
			System.out.print("\n");
		}
		
		sc.close();
		
	}

}
