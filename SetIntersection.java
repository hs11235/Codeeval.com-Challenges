import java.util.Scanner;
import java.io.*;

public class SetIntersection {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/*
		File outFile = new File ("input.txt");
		FileWriter fWriter = new FileWriter (outFile);
		PrintWriter pWriter = new PrintWriter (fWriter);
		pWriter.println("91,92,93,94,95,96,97,98;95,96,97,98,99,100");
		pWriter.println("58,59,60,61,62;50,51,52,53,54,55,56,57,58,59,60,61,62");
		pWriter.println("9,10,11;33,34,35");
		pWriter.println("88,89,90,91,92,93,94,95,96,97,98,99;91,92,93,94,95,96,97,98,99,100,101,102,103");
		pWriter.close();
*/
		File inFile = new File (args[0]);
		
		Scanner sc = new Scanner (inFile);
		
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			String [] arr = str.split(";");
			String [] a = arr[0].split(",");
			String [] b = arr[1].split(",");
			
			int [] c = new int [a.length];
			int [] d = new int [b.length];
			
			for (int i=0; i<a.length; i++) {
				c[i] = Integer.parseInt(a[i]);
			}
			
			for (int i=0; i<b.length; i++) {
				d[i] = Integer.parseInt(b[i]);
			}
			
			int n=0;
			
			for (int i=0; i<a.length; i++) {
				for (int j=0; j<b.length; j++) {
					if (c[i] == d[j]) {
						if (n==0) {
							System.out.print(c[i]);
							n++;
						} else {
							System.out.print("," + c[i]);
						}
					}
				}
			}
			System.out.print("\n");
		}
		
		sc.close();
	}

}
