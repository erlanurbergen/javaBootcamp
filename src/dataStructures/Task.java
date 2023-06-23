package dataStructures;

import java.util.ArrayList;
import java.util.List;

public class Task {
    public static void main(String[] args) {
//        ContactManager c1 = new ContactManager();
//        c1.addContact("Gizat", "77771234422");
//        c1.addContact("Alikhan", "77754321908");
//        ArrayList<Contact> allContacts = c1.getAllContacts();
////        c1.deleteContact("Gizat");
//        c1.updateContact("Alikhan", "77014563311");
//        System.out.println(allContacts);

        List<Contact> contacts = getContacts();
        System.out.println(contacts);
    }

    private static List<Contact> getContacts() {
        return List.of(
                new Contact("Asan", "8777777777"),
                new Contact("Ernur", "8777777777"),
                new Contact("Egor", "8777777777"),
                new Contact("Bakha", "8777777777")
        );
    }
}

class Contact {
    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}

class ContactManager {
    private ArrayList<Contact> contacts = new ArrayList<>();


    public void addContact(String name, String number) {
        contacts.add(new Contact(name, number));
    }

    public void deleteContact(String name) {
        contacts.removeIf(s -> s.getName().equals(name));
    }

    public Contact getContact(String name) {
        for (Contact contact1 : contacts) {
            if (contact1.getName().equals(name)) {
                return contact1;
            }
        }
        System.out.println("Контакт не найден");
        return null;

    }

    public ArrayList<Contact> getAllContacts() {
        return contacts;
    }

    public void updateContact(String name, String newNumber) {
        for (Contact contact1 : contacts) {
            if (contact1.getName().equals(name)) {
                contact1.setNumber(newNumber);
                break;
            }
        }
    }
}
