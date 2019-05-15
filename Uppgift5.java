public class Uppgift5 {
	
	public static void main(String[] args) {
		for(int i = 1 ; i <= 30; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		int i = 1;
		
		while(i <= 30){
			System.out.print(i + " ");
			if(i%5 == 0){
				System.out.println();
			}
			i++;
			
		}
		
	}

}