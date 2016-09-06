
public class Palindrome {
	
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
	
	static boolean pal(int n) {
		
		String str = Integer.toString(n);
		
		int [] arr = new int[str.length()];
		
		for (int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i) - '0';
		}
		
		for (int i=0; i<str.length()/2; i++) {
			if (arr[i] != arr[str.length() - (i + 1)])
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 1000;
		
		while (n>0) {
			if (prime(n) && pal(n)) {
				System.out.print(n);
				break;
			}
			n--;
		}
	}

}
