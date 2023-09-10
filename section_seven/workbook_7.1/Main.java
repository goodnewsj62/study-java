import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person =  new Person();

        System.out.println(person.name);
        System.out.println(person.dateOfBirth);
        System.out.println(person.nationality);
        System.out.println(person.passport);
        System.out.println(person.seatNumber);

        person.name =  "Lina";
        person.nationality =  "Nigeria";
        person.dateOfBirth =  "Nov 12 2000";
        person.passport =  new String[]{"USA", "GERMANY"};
        person.seatNumber =  8;

        System.out.println(person.name);
        System.out.println(person.dateOfBirth);
        System.out.println(person.nationality);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);
    }
}
