import java.util.Scanner;

public class Uppgift7 {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Skriv en rad: ");
		String text = in.nextLine();
		System.out.println("raden innehöll: " + characterCounter(text) + "varav " +
		vowelCounter(text) + "var vokaler");
	}
	
	public static int vowelCounter(String text){
		String s = text.toLowerCase();
		int count = 0;
		for (char c : s.toCharArray()) {
			if(charIsVowel(c)){
				count++;
			}
		}
		return count;
	}
	public static int characterCounter(String text){
		return text.length();
	}
	
	public static boolean charIsVowel(char c) {
		switch(c) {
			case 'a': {
				return true;
			}
			case 'e': {
				return true;
			}
			case 'i': {
				return true;
			}
			case 'o': {
				return true;
			}
			case 'u': {
				return true;
			}
			case 'y': {
				return true;
			}
			case '\u00E5': {
				return true;
			}
			case '\u00E4': {
				return true;
			}
			case '\u00F6': {
				return true;
				
			}default : {
				return false;
			}
			
		}
	}
	
}