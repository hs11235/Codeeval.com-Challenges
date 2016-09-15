import java.util.*;
import java.io.*;

public class PenultimateWord {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		File inFile = new File(args[0]);
		Scanner sc = new Scanner(inFile);
		
		while (sc.hasNextLine()) {
			
			String str = sc.nextLine();
			String [] arr = str.split(" ");
			
			System.out.println(arr[arr.length-2]);
			
		}
		
		sc.close();
		
	}

}
