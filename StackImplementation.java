import java.util.Stack;
import java.util.*;
import java.io.*;

public class StackImplementation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File inFile = new File(args[0]);
		Scanner sc = new Scanner(inFile);
		
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			Scanner s = new Scanner(str);
			
			Stack<Integer> stack = new Stack<Integer>();
			
			while (s.hasNext()) {
				stack.push(s.nextInt());
			}
			
			System.out.print(stack.pop());
			int temp = stack.pop();
			while (!stack.isEmpty()) {
				temp = stack.pop();
				System.out.print(" " + temp);
				if (!stack.isEmpty())
					temp = stack.pop();
			}
			System.out.print("\n");
			
			s.close();
		}
		
		sc.close();
	}

}

