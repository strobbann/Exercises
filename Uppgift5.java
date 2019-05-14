public class Uppgift5 {
	
	public static void main(String[] args) {
		
		int lineBreak = 0;
		for(int i = 1 ; i <= 30; i++) {
			if(lineBreak == 5){
				System.out.println();
				lineBreak = 0;
			}
			lineBreak++;
			System.out.print(i + " ");
		}
		System.out.println();
		int i = 1;
		lineBreak = 0;
		do{
			if(lineBreak == 5){
				System.out.println();
				lineBreak = 0;
			}
			lineBreak++;
			System.out.print(i++ + " ");
		}while(i <= 30);
		
	}

}