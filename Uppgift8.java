import java.util.Scanner;
public class Uppgift8 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
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
		System.out.print("Arrayen efter nollinng: ");
		uppgift.printArray(numbers);
		uppgift.setZeroesLast(numbers);
		System.out.print("Zeroes last: ");
		uppgift.printArray(numbers);

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
		if(end < start) {
			int tempEnd = end;
			int tempStart = start;
			start = tempEnd;
			end = tempStart;
		}
		for(int i = 0; i < numbers.length ; i++) {
			if(numbers[i] >= start && numbers[i] <= end){
				numbers[i] = 0;
			}
		}
	}

	public void setZeroesLast(int[] numbers) {
		int lastIndex = numbers.length-1;
		int length = numbers.length;
		int zeroes = 0;
		int freeIndex = -1;
		for(int i = numbers.length-1; 0 <= i ;i-- ){
			if(numbers[i] != 0 && freeIndex == -1) {
				freeIndex = i;
			}
			else if(numbers[i] == 0 && freeIndex != -1) {
				int freeNumber = numbers[freeIndex];
				int numberZero = numbers[i];
				numbers[freeIndex] = numberZero;
				numbers[i] = freeNumber;
				freeIndex = -1;
				i = numbers.length-1;
			}
		}
			
	}

	public void printArray(int[] numbers){
		for(int  n : numbers) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
