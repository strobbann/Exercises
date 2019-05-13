import java.util.Scanner;
public class Uppgift8 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Uppgift8 uppgift = new Uppgift8();
		int[] numbers = new int[20];
		for (int i = 0; i < numbers.length ; i ++) {
			numbers[i] = (int) (Math.random() * 300);
		}
		System.out.print("Arrayen : ");
		for(int i : numbers) {
			System.out.print(i + " ");
		}
		System.out.println();
		uppgift.biggestNumber(numbers);
		System.out.println("Interval first");
		int first = in.nextInt();
		System.out.println("Interval second");
		int second = in.nextInt();
		uppgift.zeroBetween(first,second, numbers);
		
	}
	
	public int biggestNumber(int[] numbers){
		int max = numbers[0];
		int pos = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
				pos = i +1;
			}
		}
		System.out.println("Största talet är " + max + "som fins i ruta nr " + pos);
		return max;
	}
	
	public void zeroBetween(int start, int end, int[] numbers) {
		if(start < end) {
			start = end;
			end = start;
		} 
			
		for(int n : numbers) {
			if(n >= start && n <= end){
				System.out.println(n);
			}
		}
	}
	
}