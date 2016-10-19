import java.io.*;
import java.util.*;

public class ReverseGroups {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		File outFile = new File ("input.txt");
		FileWriter fWriter = new FileWriter (outFile);
		PrintWriter pWriter = new PrintWriter (fWriter);
		pWriter.println("1,2,3,4,5;2");
		pWriter.println("1,2,3,4,5,6,7,8,9,10,11,12;3");
		pWriter.println("1,2,3,4,5,6,7,8,9;5");
		//pWriter.println("3");
		//pWriter.println("1215306625");
		pWriter.close();

		File inFile = new File("input.txt");
		Scanner sc = new Scanner(inFile);
		
		while(sc.hasNextLine()) {
			
			String str = sc.nextLine();
			String[] str_arr = str.split(";");

			int n = Integer.parseInt(str_arr[1]);
			
			String [] str_arr2 = str_arr[0].split(",");
			int [] arr = new int [str_arr2.length];
			
			for (int i=0; i<str_arr2.length; i++) {
				
				arr[i] = Integer.parseInt(str_arr2[i]);
			}
			
			int reverses = arr.length / n;
			
			for (int i=0; i<reverses; i++) {
				
				for (int j=0; j<Math.floor(n/2); j++) {
					
					int a = arr[i*n + j];
					arr[i*n + j] = arr [(i+1)*n - (j+1)];
					arr[(i+1)*n - (j+1)] = a;
				}
			}
			
			System.out.print(arr[0]);
			for (int i=1; i<arr.length; i++) {
				System.out.print("," + arr[i]);
			}
			System.out.println();
		}
		
		sc.close();
	}

}
