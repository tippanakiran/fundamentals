package kiranreddy;

public class Test8 {
	public static void main(String[] args) {
		

		char c=args[0].charAt(0);
		
		if((c>= 65 && c<= 90) || (c >= 97 && c <= 122))
			System.out.println("Alphabet");
		else if(c>= 48 && c<= 57)
			System.out.println("Digit");
		else
			System.out.println("Special Character");
	}
}
