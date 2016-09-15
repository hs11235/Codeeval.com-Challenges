import java.util.Map;
import java.util.HashMap;
import java.util.*;
import java.io.*;

public class SelfDescribingNumbers {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		File inFile = new File(args[0]);
		
		Scanner sc = new Scanner(inFile);
		
		while (sc.hasNextLine()) {
			
			String str = sc.nextLine();
			int n = Integer.parseInt(str);
			boolean a = check(n);
			
			if (a) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
					
		}
		
		sc.close();
		
	}
	
	public static Map<Character, Integer> count(int n) {
		
		String str = Integer.toString(n);
		char [] arr = str.toCharArray();
		
		Map<Character, Integer> M = new HashMap<Character,Integer>();
		
		for (int i=0; i<str.length(); i++) {
			if (M.containsKey(arr[i])) {
				M.put(arr[i], M.get(arr[i]) + 1);
			}
			else {
				M.put(arr[i], 1);
			}
		}
		
		return M;
	}
	
	public static boolean check(int n) {
		
		Map<Character, Integer> M = count(n);
		
		LinkedList<Integer> stack = new LinkedList<Integer>();
		while (n > 0) {
		    stack.push( n % 10 );
		    n = n / 10;
		}
		
		
		for (int i=0; i<stack.size(); i++) {
			
			char ch = Integer.toString(i).charAt(0);
			
			if (stack.get(i) != 0) {
				if (stack.get(i) != M.get(ch))
					return false;
			} else {
				if (M.get(ch) != null)
					return false;
			}
		}
		
		return true;
	}

}
