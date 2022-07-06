public class User {

    public String name;
    public Integer age;
    public char sex;
    public String birthPlace;
    public Integer countryID;

    public User(String name, Integer age, char sex, Integer countryID) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.countryID = countryID;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public char getGenre() {
        return this.sex;
    }

    public String getBirthPlace() {
        return this.birthPlace;
    }

}
