import java.util.*;
import java.io.*;

public class LongestLines {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		File outFile = new File ("input.txt");
		FileWriter fWriter = new FileWriter (outFile);
		PrintWriter pWriter = new PrintWriter (fWriter);
		pWriter.println("3");
		pWriter.println("timmeh");
		pWriter.println("hello world");
		pWriter.println("timmeh mctimmerson");
		pWriter.println("bobby adfilguhdaiofghadiufgh");
		pWriter.close();
*/
		File inFile = new File(args[0]);
		Scanner sc = new Scanner(inFile);
		
		String str = sc.nextLine();
		int n = Integer.parseInt(str);
		
		List<String> longest = new ArrayList<String>();
		
		while (sc.hasNextLine()) {
			
			str = sc.nextLine();
			
			if (longest.size() < n) {
				longest.add(str);
			} else {
				if (str.length() > longest.get(0).length()) {
					longest.remove(0);
					longest.add(str);
				}
			}
			
			sort(longest);
			
		}
		sc.close();
		
		for (int i=longest.size()-1; i>=0; --i) {
			System.out.println(longest.get(i));
		}
	}
	
	public static void sort(List<String> list) {
		
		for (int i=list.size(); i>0; --i) {
			for (int j=0; j<i-1; j++) {
				if (list.get(j).length() > list.get(j+1).length()) {
					String str = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, str);
				}
			}
		}
		
	}
}
