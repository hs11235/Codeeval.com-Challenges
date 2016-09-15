import java.util.Scanner;
import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class DetectingCycles {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/*
		File outFile = new File ("input.txt");
		FileWriter fWriter = new FileWriter (outFile);
		PrintWriter pWriter = new PrintWriter (fWriter);
		pWriter.println("2 0 6 3 1 6 3 1 6 3 1");
		pWriter.println("3 4 8 0 11 9 7 2 5 6 10 1 49 49 49 49");
		pWriter.println("1 2 3 1 2 3 1 2 3");
		pWriter.close();
*/
		File inFile = new File(args[0]);
		Scanner sc = new Scanner(inFile);
		
		while(sc.hasNextLine()) {
			
			String str = sc.nextLine();
			List<Integer> arr = new ArrayList<Integer>();	
			Scanner s = new Scanner(str);
			
			while(s.hasNextInt()) {
				arr.add(s.nextInt());
			}
			
			s.close();
			
			int i=0;
			while (cycleFind(arr, i) == -1) {
				i++;
			}
			
			System.out.print(arr.get(i));
			for(int k=i+1; k<i+cycleFind(arr, i); k++) {
				System.out.print(" " + arr.get(k));
			}
			System.out.print("\n");
		}
		sc.close();
	}
	
	static int cycleFind(List<Integer> list, int i) {

		int j=i+1;
		
		while (list.get(j) != list.get(i) && j>=0 && j<list.size()-1) {
			j++;
		}
		
		if (j== i+1) {
			return 1;
		} else {
			for (int k=0; k<j-i; k++) {
				if(list.get(j+k) != list.get(i+k)) {
					return -1;
				}
			}
		
			return j-i;
		}
	}
}
