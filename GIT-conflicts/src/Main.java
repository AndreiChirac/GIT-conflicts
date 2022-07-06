import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Andrei", 21, 'M'));
        users.add(new User("Stefania", 21, 'F'));

        Access access = new Access(users);

        System.out.println(access);

        access.preferanceSortByChirac();

        System.out.println(access);

        access.preferanceSortByStefi();

        System.out.println(access);
    }

}
