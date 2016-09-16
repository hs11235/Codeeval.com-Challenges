import java.util.Scanner;
import java.io.*;

public class PrimeNumbers {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File inFile = new File(args[0]);
		Scanner sc = new Scanner(inFile);
		
		while(sc.hasNext()) {
			
			int n = sc.nextInt();
			
			if (n<3)
				break;
			
			System.out.print(2);
			for (int i=3; i<n; i+=2) {
				if (prime(i))
					System.out.print("," + i);
			}
			System.out.print("\n");
		}
		
		sc.close();
	}

	static boolean prime(int n) {
		
		if (n <= 1)
			return false;
		else if (n <= 3)
			return true;
		else if (n % 2 == 0 ||n % 3 == 0)
			return false;
		
		int i=5;
		
		while (i * i <= n) {
			
			if (n % i == 0 || n % (i+2) == 0)
				return false;
			i+=6;
			
		}
		
		return true;
	}
}
