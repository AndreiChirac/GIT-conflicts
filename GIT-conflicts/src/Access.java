import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Access implements Sort {

    public List<User> git_users;


    public Access(List<User> git_users) {
        this.git_users = git_users;
    }

    public void preferanceSortByStefi() {
        git_users.sort(Comparator.comparing(User::getGenre));
    }

    public void preferanceSortByChirac() {
        Collections.sort(git_users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return ((User)o2).name.compareTo(((User)o1).name);
            }
        });
    }


    @Override
    public String toString() {
        return "Access{" +
                "git_users=" + git_users +
                '}';
    }
}
