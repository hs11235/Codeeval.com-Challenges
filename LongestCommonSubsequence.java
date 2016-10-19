import java.util.*;
import java.io.*;

//misunderstood question - WRONg

public class LongestCommonSubsequence {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		File outFile = new File ("input.txt");
		FileWriter fWriter = new FileWriter (outFile);
		PrintWriter pWriter = new PrintWriter (fWriter);
		pWriter.println("XMJYAUZ;MZJAWXU");
		pWriter.println("XMJYAUZ;MZJAWXU");
		pWriter.println("XMZJYAUZ;MZJAWXU");
		//pWriter.println("3");
		//pWriter.println("1215306625");
		pWriter.close();

		File inFile = new File("input.txt");
		Scanner sc = new Scanner(inFile);
		
		while(sc.hasNextLine()) {
			
			String str = sc.nextLine();
			String[] str_arr = str.split(";");
			char[] arr1 = str_arr[0].toCharArray();
			char[] arr2 = str_arr[1].toCharArray();
			
			int longest = 0;
			int longLocation = 0;
			
			for (int i=0; i<arr1.length; i++) {
				
				int a = longestFrom(arr1, arr2, i);
				if (a > longest) {
					longest = a;
					longLocation = i;
				}
			}
			
			System.out.println(longest);
		}
		
		sc.close();
	}

	// gets longest sequence starting with letter at arr1[i]
	static int longestFrom(char[] arr1, char[] arr2, int i) {
		
		char ch1 = arr1[i];
		
		LinkedList<Integer> locations = locate(arr2, ch1);
		
		int longest = 1;
		
		for (int j=0; j<locations.size(); j++) {
			
			int a = locations.get(j);
			
			char ch2 = arr2[a];
			int sequence = 0;
			while (ch1 == ch2 && a+sequence < arr2.length-1 && i+sequence < arr1.length-1) {
				
				sequence += 1;
				ch1 = arr1[i+sequence];
				ch2 = arr2[a+sequence];
			}
			if (sequence > longest) longest = sequence;
		}
		
		return longest;
	}
	
	static LinkedList<Integer> locate(char[] arr, char ch) {
		
		LinkedList<Integer> locations = new LinkedList<Integer>();
		
		for (int i=0; i< arr.length; i++) {
			if (arr[i] == ch)
				locations.add(i);
		}
		
		return locations;
	}
}
