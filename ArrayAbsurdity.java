import java.util.*;
import java.io.*;

public class ArrayAbsurdity {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		File inFile = new File(args[0]);
		Scanner sc = new Scanner(inFile);
		
		while (sc.hasNextLine()) {
			
			String str = sc.nextLine();

			int[] arr = getArr(str);
			System.out.println(findDuplicate(arr));
		}
		
		sc.close();
	}
	
	static int findDuplicate(int[] arr) {
		
		Arrays.sort(arr);
		
		for (int i=1; i<arr.length; i++) {
			
			if (arr[i-1] == arr[i])
				return arr[i-1];
		}
		
		return -1;
	}
	
	static int[] getArr(String str) {
		
		String[] str_arr = str.split(";");
		String[] str_arr2 = str_arr[1].split(",");
		int[] arr = new int[str_arr2.length];
		
		for (int i=0; i<arr.length; i++) {
			
			arr[i] = Integer.parseInt(str_arr2[i]);
		}
		
		return arr;
	}

}
