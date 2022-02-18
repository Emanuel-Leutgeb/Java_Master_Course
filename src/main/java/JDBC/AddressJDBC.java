package JDBC;

public class AddressJDBC {
    private int zip;
    private String city;
    private String street;

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public AddressJDBC(int zip, String city, String street) {
        this.zip = zip;
        this.city = city;
        this.street = street;
    }
}