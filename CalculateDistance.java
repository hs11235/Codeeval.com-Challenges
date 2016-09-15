import java.io.*;
import java.util.*;

public class CalculateDistance {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
/*
		File outFile = new File ("input.txt");
		FileWriter fWriter = new FileWriter (outFile);
		PrintWriter pWriter = new PrintWriter (fWriter);
		pWriter.println("(25, 4) (1, -6)");
		pWriter.println("(47, 43) (-25, -11)");
		pWriter.close();
		*/
		File inFile = new File (args[0]);
		Scanner sc = new Scanner (inFile);
		
		while (sc.hasNextLine()) {
			
			String str = sc.nextLine();
			str = str.replace("(", "");
			str = str.replace(")", "");
			str = str.replaceAll(",", "");
			
			Scanner s = new Scanner(str);
			
			coord A = new coord(s.nextInt(), s.nextInt());
			coord B = new coord(s.nextInt(), s.nextInt());
			
			s.close();
			
			System.out.println(A.distanceFrom(B));
			
		}
		
		sc.close();
		
	}

}

class coord {
	int x;
	int y;
	
	coord(int x_, int y_) {
		x = x_;
		y = y_;
	}
	
	public int distanceFrom(coord B) {
		
		double a = Math.pow(x - B.x, 2) + Math.pow(y - B.y, 2);
		
		a = Math.sqrt(a);
		
		return (int) a;
		
	}
}
