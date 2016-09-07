
public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "sup mah nigggah";
		
		String [] words = str.split("\\s+");

		String [] reversed = new String[str.length()];
		
		for (int i=0; i<words.length; i++) {
			reversed[i] = words[words.length - (i+1)];
			System.out.print(reversed[i]);
			if (i != words.length-1)
				System.out.print(" ");
		}
		
		
	}

}
