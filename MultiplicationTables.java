
public class MultiplicationTables {
	
	static void print(int n) {
		
		if (n<10)
			System.out.print("   ");
		else if (n<100 && n>=10)
			System.out.print("  ");
		else
			System.out.print(" ");
		
		System.out.print(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<=12; i++) {
			for (int j=1; j<=12; j++) {
				print(j*i);
			}
			System.out.print("\n");
		}
		
	}

}
