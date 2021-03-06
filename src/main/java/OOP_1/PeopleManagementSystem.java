package OOP_1;

public class PeopleManagementSystem {

    public void createPerson(String firstName, String lastName) {
        Person person = new Person(firstName, lastName);

        System.out.printf("\nHere is your Data: " +
                "\nName: %s %s\n",
                person.getFirstName(), person.getLastName());
    }

    public void createPerson(String firstName, String lastName, String birthday, int age, int zip, String city, String street, Sex sex) {
        Person person = new Person(firstName, lastName, birthday, age, new Address(zip, city, street), sex);

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
                person.sex,
                person.address.getZip(),
                person.address.getCity(),
                person.address.getStreet());
    }

    public void createPerson(String firstName, int age, String birthday) {
        Person person = new Person(firstName, birthday, age);

        System.out.printf("\nHere is your Data: \nName: %s \nAge: %d \nBirthday: %s\n", person.getFirstName(), person.getAge(), person.getBirthday());
    }
}
