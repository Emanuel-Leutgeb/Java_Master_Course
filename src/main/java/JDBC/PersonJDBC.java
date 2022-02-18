package JDBC;

public class PersonJDBC {
    private String firstName;
    private String lastName;
    private String birthday;
    private int age;
    private AddressJDBC address;
    private SexJDBC sex;

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

    public PersonJDBC(String firstName, String lastName, String birthday, int age, AddressJDBC address, SexJDBC sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.age = age;
        this.address = address;
        this.sex = sex;
    }

    public PersonJDBC(String firstName, String lastName) {
        this(firstName, lastName, "unknown", 0, null, SexJDBC.UNKNOWN);
    }

    public PersonJDBC(String firstName, String birthday, int age) {
        this(firstName, "unknown", birthday, age, null, SexJDBC.UNKNOWN);
    }

    public AddressJDBC getAddress() {
        return address;
    }

    public void setAddress(AddressJDBC address) {
        this.address = address;
    }

    public SexJDBC getSex() {
        return sex;
    }

    public void setSex(SexJDBC sex) {
        this.sex = sex;
    }
}