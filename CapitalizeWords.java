import java.util.*;
import java.io.*;

public class CapitalizeWords {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		File inFile = new File(args[0]);
		Scanner sc = new Scanner(inFile);
		
		while(sc.hasNextLine()) {
			
			String str = sc.nextLine();
			
			str = convert(str);
			
			System.out.println(str);
		}

		sc.close();

	}
	
	public static String convert(String str) {
		
		char [] arr = str.toCharArray();
		
		arr[0] = Character.toUpperCase(arr[0]);
		
		for (int i=1; i<arr.length; i++) {
			if (arr[i-1] == ' ')
				arr[i] = Character.toUpperCase(arr[i]);
		}
		
		str = String.valueOf(arr);
		return str;
		
	}

}
