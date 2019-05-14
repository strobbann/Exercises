import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Uppgift10 {

    public static void main(String[] args) {
        Uppgift10 uppgift = new Uppgift10();
        Scanner in = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();
        String name = "";
        do{
            System.out.print("Namn : ");
            name = in.nextLine();
            if(!name.equals("STOPP")){
                System.out.print("Ålder : ");
                int age = in.nextInt();
                persons.add(new Person(name, age));
                in.nextLine();
            }
        } while(!name.equals("STOPP"));
        System.out.print("Ange en ålder");
        int age = in.nextInt();
        System.out.println("Personer som är " + age + "gamla");
        List<Person> filteredPersons = uppgift.findAgeInGroup(persons,age);
        for(Person p : filteredPersons){
            System.out.println(p.getName());
        }
    }

    public List<Person> findAgeInGroup(List<Person> persons, int age){
        List<Person> returnList = new ArrayList<>();
        for(Person person : persons) {
            if(person.getAge() == age) {
                returnList.add(person);
            }
        }
        return returnList;
    }

}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
