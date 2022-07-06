import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Andrei", 21, 'M', 1));
        users.add(new User("Stefania", 21, 'F', 2));
        users.add(new User("Irina", 22, 'F', 0));

        Access access = new Access(users);

        System.out.println(access);

        access.preferanceSortByChirac();

        System.out.println(access);

        access.preferanceSortByStefi();

        System.out.println("Oare am inteles?");
        System.out.println("Am inteles!");

    }

}
