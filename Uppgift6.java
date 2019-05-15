import java.util.Scanner;

public class Uppgift6 {
	
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ange start : ");
		int start = in.nextInt();
		System.out.println();
		System.out.print("Ange slut : ");
		int end = in.nextInt();
		System.out.println();
		int lineBreak = 1;
		int thirdCounter = start+3;
		boolean firstNumber = true;
		System.out.println("Var tredje siffra tio per rad");
		
		for(int i = start; i <= end; i+=3) {
			System.out.print(i + " ");
			if(lineBreak%10 == 0) {
				System.out.println();
			}
			lineBreak++;
			
			
		}
		System.out.println();
		System.out.println("inom start och sluttal tio per rad");
		int i = start;
		lineBreak = 1;
		while(i <= end){
			System.out.print(i + " ");
			if(lineBreak%10 == 0) {
				System.out.println();
			}
			i++;
			lineBreak++;
		}
		
	}

}