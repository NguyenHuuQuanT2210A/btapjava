package Assignment10;

import javafx.collections.FXCollections;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber> phoneList = new ArrayList<PhoneNumber>();

    @Override
    public void insertPhone(String name, String phone) {
        boolean found = false;
        for (PhoneNumber p : phoneList) {
            if (p.getName().equals(name)) {
                found = true;
                if (!p.getPhone().equals(phone)) {
                    p.setPhone(phone);
                    System.out.println("Updated phone number for " + name);
                } else {
                    System.out.println(name + " already has this phone number.");
                }
                break;
            }
        }
        if (!found) {
            phoneList.add(new PhoneNumber(name, phone));
            System.out.println("Added " + name + " to phonebook with phone number " + phone);
        }
    }

    @Override
    public void removePhone(String name) {
        int index = -1;
        for (int i = 0; i < phoneList.size(); i++) {
            if (phoneList.get(i).getName().equals(name)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            phoneList.remove(index);
            System.out.println("Removed " + name + " from phonebook.");
        } else {
            System.out.println(name + " is not in the phonebook.");
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        boolean found = false;
        for (PhoneNumber p : phoneList) {
            if (p.getName().equals(name)) {
                found = true;
                p.setPhone(newphone);
                System.out.println("Updated phone number for " + name);
                break;
            }
        }
        if (!found) {
            System.out.println(name + " is not in the phonebook.");
        }
    }

    @Override
    public PhoneNumber searchPhone(String name) {
        return null;
    }
    @Override
    public void sort() {
    }
}

