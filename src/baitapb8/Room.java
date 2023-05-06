package baitapb8;

import java.util.ArrayList;
import java.util.List;
public class Room{
    String name;
    String position;
    List<Person> people;

    public Room(String name, String position) {
        this.name = name;
        this.position = position;
        this.people = new ArrayList<Person>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void addPerson(Person person) {
        people.add(person);
    }
    public void removePerson(Person person) {
        people.remove(person);
    }


    public void printInfo() {
        System.out.println("Tên phòng: " + name);
        System.out.println("Vị trí: " + position);
        System.out.println("Danh sách user:");

        for (Person person : people) {
            System.out.println("Name: "+person.getName() + " - " + "Age: "+person.getAge() + " - " + "Telephone: "+person.getTelephone() + " - " + "Address: "+person.getAddress());
        }
    }
}
