import java.io.*;
import java.util.Scanner;

public class RightmostChar {
	
	static int locate(char ch, String str){
		char [] arr = str.toCharArray();
		
		int a=0;

		for (int n=0; n<arr.length; n++) {
			if (arr[n] == ch)
				a=n;
		}

		if (a==0)
			return -1;
		else return a;

	}

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub

		File inFile = new File (args[0]);
		
		Scanner sc = new Scanner (inFile);
		
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			String [] arr = str.split(",");
			char [] ch = arr[1].toCharArray();
			
			int a = locate(ch[0], arr[0]);
			
			System.out.println(a);	
		}
		
		sc.close();

	}

}
