package HW8;

public class User {
    private String lastName;
    private int age;

    public User(String lastName, Integer age) {
        this.lastName = lastName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}