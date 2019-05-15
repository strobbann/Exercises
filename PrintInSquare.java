public class PrintInSquare {
	
	public static void main(String[] args) {
		squarePrint();
	}
	
	public static void squarePrint() {
		int squareSize = 10;
		for(int i = 1; i <= squareSize; i++) {
			System.out.print(i + " ");
			for(int j = i+squareSize; j < (squareSize * squareSize) + i; j+=squareSize){
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}