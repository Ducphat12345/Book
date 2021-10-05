package model;

public class Person {
    private String id;
    private String name;
    private String address;
    private int phone;
    private String type;

    static int idPerson = 1;
    public Person() {

    }

    public Person(String name, String address, int phone, String type) {
        this.id = String.format("%05d", idPerson++);
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", type='" + type + '\'' +
                '}';
    }
}
