import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Uppgift12 {
	private static Scanner in = new Scanner(System.in);
	private List<Myra> myror = new ArrayList<>();

	public static void main(String[] args) {
		Uppgift12 uppgift = new Uppgift12();
		uppgift.start();
		
		
	}
	
	public void start() {
		int answer = -1;
		do{
			printMenu();
			answer = in.nextInt();
			in.nextLine();
			menu(answer);
		}while(answer != 5);
		Myra myra1 = new Myra("Johnson", 23);
		Myra myra2 = new Myra("Feliz", 43);
	}
	public void createMyra() {
		System.out.println("Ange namn: ");
		String name = in.nextLine();
		System.out.print("Antal barr: ");
		int antalBarr = in.nextInt();
		in.nextLine();
		myror.add(new Myra(name, antalBarr));
	}
	
	public void updateAntalBarr() {
		System.out.println("Ange namn på myra");
		String name = in.nextLine();
		System.out.println("Ange ny mängd på barr");
		int antalBarr = in.nextInt();
		for(Myra m : myror) {
			if(m.getName().equalsIgnoreCase(name)){
				m.setAntalBarr(antalBarr);
			}
		}
		in.nextLine();
	}
	public void marryMyror() {
		System.out.println("Ange namn Myra som skall gifta");
		String nameMyraOne = in.nextLine();
		System.out.println("Ange namn Myra som skall gifta sig med " + nameMyraOne + ": ");
		String nameMyraTwo = in.nextLine();
		Myra myraOne = null;
		Myra myraTwo = null;
		for(Myra m : myror) {
			if(m.getName().equalsIgnoreCase(nameMyraOne)){
				myraOne = m;
				System.out.println("First myra found");
			}else if(m.getName().equalsIgnoreCase(nameMyraTwo)){
				myraTwo = m;
				System.out.println("Second myra found");
			} 
			
		}
		if(myraOne != null && myraTwo != null) {
				myraOne.marry(myraTwo);
		} else {
			System.out.println("other ant not found");	
		}
	}
	
	public void printAllMyror() {
		for(Myra m : myror) {
			System.out.println(m);
		}
	}
	
	public void menu(int choice) {
		switch(choice) {
			case 1: {
				createMyra();
				break;
			}
			case 2: {
				updateAntalBarr();
				break;
			}
			case 3: {
				marryMyror();
				break;
			}
			case 4: {
				printAllMyror();
				break;
			}
		}
	}
	public void printMenu(){
		String menuStr = "Menu \n";
		menuStr += "1. Skapa myra\n";
		menuStr += "2. Ändra barr\n";
		menuStr += "3. Giftermål\n";
		menuStr += "4. Skriv ut alla\n";
		menuStr += "5. Avsluta\n";
		
		System.out.println(menuStr);
	}
	
}

class Myra {
	private int antalBarr;
	private String name;
	private Myra significantOther;
	
	public Myra(String name, int antalBarr) {
		this.name = name;
		this.antalBarr = antalBarr;
	}
	
	public void setAntalBarr(int antalBarr) {
		this.antalBarr = antalBarr;
	}
	public void setSignificantOther(Myra significantOther) {
		this.significantOther = significantOther;
	}
	
	public void marry(Myra significantOther) {
		this.setSignificantOther(significantOther);
		significantOther.setSignificantOther(this);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAntalBarr() {
		return antalBarr;
	}
	
	@Override
	public String toString() {
		String returnStr = getName() + " har " + getAntalBarr() + " barr, ";
		if(significantOther == null){
			returnStr += "ogift";
		} else {
			returnStr +="gift med " + significantOther.getName();
		}
		return returnStr;
	}
	
}