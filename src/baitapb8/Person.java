package baitapb8;

public class Person {
    String name;
    int age;
    String telephone;
    String address;

    public Person() {

    }
    public Person(String name, int age, String telephone, String address) {
        this.name = name;
        this.age = age;
        this.telephone = telephone;
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}
