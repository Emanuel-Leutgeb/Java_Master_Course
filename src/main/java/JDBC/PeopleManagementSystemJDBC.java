package JDBC;

public class PeopleManagementSystemJDBC {

    public PersonJDBC createPerson(String firstName, String lastName) {
        PersonJDBC person = new PersonJDBC(firstName, lastName);

        System.out.printf("\nHere is your Data: " +
                        "\nName: %s %s\n",
                person.getFirstName(), person.getLastName());

        return person;
    }

    public PersonJDBC createPerson(String firstName, String lastName, String birthday, int age, int zip, String city, String street, SexJDBC sex) {
        PersonJDBC person = new PersonJDBC(firstName, lastName, birthday, age, new AddressJDBC(zip, city, street), sex);

        System.out.printf("\nHere is your Data: " +
                        "\nFirst Name: %s " +
                        "\nLast Name: %s " +
                        "\nBirthday: %s " +
                        "\nAge: %d " +
                        "\nSex: %s " +
                        "\nAddress: " +
                        "\n%s " +
                        "\n%s " +
                        "\n%s " +
                        "\n",
                person.getFirstName(),
                person.getLastName(),
                person.getBirthday(),
                person.getAge(),
                person.getSex(),
                person.getAddress().getZip(),
                person.getAddress().getCity(),
                person.getAddress().getStreet());

        return person;
    }

    public PersonJDBC createPerson(String firstName, int age, String birthday) {
        PersonJDBC person = new PersonJDBC(firstName, birthday, age);

        System.out.printf("\nHere is your Data: \nName: %s \nAge: %d \nBirthday: %s\n", person.getFirstName(), person.getAge(), person.getBirthday());

        return person;
    }
}