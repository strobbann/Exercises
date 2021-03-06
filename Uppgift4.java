import java.util.Scanner;
import java.util.Random;
public class Uppgift4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String wantToContiue = "";
		do{
			boolean isValidInput = false;
			int firstNumber = randomNumber();
			int secondNumber = randomNumber();
			char symbol = randomSymbol(new char[]{'+', '-', '/', '*'});
			if(secondNumber == 0 && symbol == '/'){
				continue;
			}
			whatToCalculate(firstNumber,secondNumber,in,symbol);
			while(!isValidInput){
				System.out.print("vill du fortsätta: ");
				wantToContiue = in.nextLine();
				if(wantToContiue.equalsIgnoreCase("ja") || wantToContiue.equalsIgnoreCase("nej")) {
					isValidInput = true;
				} else {
					System.out.println("Felatktig input");
				}
			}
		}while(!wantToContiue.equalsIgnoreCase("nej"));
	}
	
	public static void addtion(int firstNumber, int secondNumber, Scanner in){
		System.out.print("vad blir " + firstNumber + " + " + secondNumber + "? ");
		int answer = in.nextInt();
		int rightAnswer = firstNumber + secondNumber;
		if((rightAnswer) == answer ){
			System.out.println("Rätt Svar");
		} else {
			System.out.println("Fel svar det rätta svaret är " + rightAnswer);
		}
		in.nextLine();
	}
	
	public static void difference(int firstNumber, int secondNumber, Scanner in){
		System.out.print("vad blir " + firstNumber + " - " + secondNumber + "? ");
		int answer = in.nextInt();
		int rightAnswer = firstNumber - secondNumber;
		if((rightAnswer) == answer ){
			System.out.println("Rätt Svar");
		} else {
			System.out.println("Fel svar det rätta svaret är " + rightAnswer);
		}
		in.nextLine();
	}
	
	public static void multiply(int firstNumber, int secondNumber,Scanner in) {
		System.out.print("vad blir " + firstNumber + " * " + secondNumber + "? ");
		int answer = in.nextInt();
		int rightAnswer = firstNumber * secondNumber;
		if((rightAnswer) == answer ){
			System.out.println("Rätt Svar");
		} else {
			System.out.println("Fel svar det rätta svaret är " + rightAnswer);
		}
		in.nextLine();
	}
	
	public static void divide(int firstNumber, int secondNumber, Scanner in){
		System.out.print("vad blir " + firstNumber + " / " + secondNumber + "? ");
		
		int answer = in.nextInt();
		int rightAnswer = firstNumber / secondNumber;
	
		if((rightAnswer) == answer ){
			System.out.println("Rätt Svar");
		} else {
			System.out.println("Fel svar det rätta svaret är " + rightAnswer);
		}
		
		in.nextLine();
	}
	
	public static void whatToCalculate(int firstNumber, int secondNumber, Scanner in,char symbol){
		switch(symbol){
			case '+' : {
				addtion(firstNumber, secondNumber,in);
				break;
			}
			case '-' : {
				difference(firstNumber, secondNumber,in);
				break;
			}
			case '*': {
				multiply(firstNumber, secondNumber, in);
				break;
			}
			case '/': {
				
				divide(firstNumber, secondNumber, in);
				
				break;
			}
			default: {
				System.out.println("invalid operation");
			}
		}
	}
	
	public static int randomNumber(){
		Random random = new Random();
		return random.nextInt(100) + 1;
	}
	
	public static char randomSymbol(char ... symbols) {
		int randomIndex = (int) (Math.random() * symbols.length);
		
		return symbols[randomIndex];
	}
}