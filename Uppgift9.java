
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Uppgift9 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Uppgift9 uppgift = new Uppgift9();
        List<String> strings = uppgift.writeStrings();
        List<String> filteredStrings = uppgift.findCharacterInString(strings);

    }

    public List<String> writeStrings() {
        List<String> strings = new ArrayList<>();
        String s = "";
        int i = 1;
        do{
            System.out.print("String " + i++ + "> ");
            s = in.nextLine();
            if(!s.equals("STOPP")){
                strings.add(s);
            }
            System.out.println();
        }while(!s.equals("STOPP"));

        return strings;
    }

    public List<String> findCharacterInString(List<String> strings){
        List<String> returnstrs = new ArrayList<>();
        System.out.print("ange Önskat tecken");
        char c = (char) in.next().charAt(0);
        System.out.println("Strängar som inneHåller : " + c);
        for(String s : strings) {
            if(s.indexOf(c) != -1){
                returnstrs.add(s);
                System.out.println(s);
            }
        }
        return returnstrs;
    }
}
