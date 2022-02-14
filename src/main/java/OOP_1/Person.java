package OOP_1;

public class Person {
    private String firstName;
    private String lastName;
    private String birthday;
    private int age;
    Address address;
    Sex sex;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Person(String firstName, String lastName, String birthday, int age, Address address, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.age = age;
        this.address = address;
        this.sex = sex;
    }

    public Person(String firstName, String lastName) {
        this(firstName, lastName, "unknown", 0, null, Sex.UNKNOWN);
    }

    public Person(String firstName, String birthday, int age) {
        this(firstName, "unknown", birthday, age, null, Sex.UNKNOWN);
    }
}
