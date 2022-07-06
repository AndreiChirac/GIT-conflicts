public class User {

    public String name;
    public Integer age;
    public char sex;

    public User(String name, Integer age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public char getSex() {
        return this.sex;
    }

}
