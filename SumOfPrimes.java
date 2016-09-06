
public class SumOfPrimes {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int count=0;
		int total=0;
		while (i < 1000) {
			if (prime(count)) {
				total+=count;
				i++;
			}
			count++;
		}
		
		System.out.print(total);
	}

}
