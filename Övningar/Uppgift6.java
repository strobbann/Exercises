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
		int lineBreak = 0;
		int counterBreak = start+3;
		boolean firstNumber = true;
		for(int i = start ; i <= end; i++) {
			if(firstNumber){
				firstNumber = !firstNumber;
				lineBreak++;
				System.out.print(i + " ");
			}
			if(counterBreak == i ){
				System.out.print(i + " ");
				counterBreak += 3;
				
				if(lineBreak == 9){
					System.out.println();
					lineBreak = 0;
				}
				lineBreak++;
			}	
			
		}
		System.out.println();
		int i = start;
		lineBreak = 0;
		do {
			if(lineBreak >= 10){
				System.out.println();
				lineBreak = 0;
			}
			lineBreak++;
			System.out.print(i++ + " ");	
		}while(i <= end);
		
	}

}