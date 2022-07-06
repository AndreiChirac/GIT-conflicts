import java.util.Comparator;
import java.util.List;


public class Access implements Sort {

    public List<User> git_users;


    public Access(List<User> git_users) {
        this.git_users = git_users;
    }

    @Override
    public void preferanceSort() {
        git_users.sort(Comparator.comparing(User::getGenre));
    }

    @Override
    public String toString() {
        return "Access{" +
                "git_users=" + git_users +
                '}';
    }
}
