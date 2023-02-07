package ChapterEight.PhonebookApplication;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;

public class Phonebook {
   

    ArrayList<Contact> listOfContacts = new ArrayList<>();
    Contact contact;

    public void addContact(String name, String phoneNumber, String address, String emailAddress) {
        contact = new Contact(name, phoneNumber, address, emailAddress);
        listOfContacts.add(contact);
    }
    public int countContact() {
        return listOfContacts.size();
    }

    public void deleteContactByPhoneNumber(String phoneNumber) {
        //validatePhoneNumber(phoneNumber);
        Iterator<Contact> iter = listOfContacts.iterator();
        while (iter.hasNext()) {
            Contact contacts = iter.next();
            if (contacts.getPhoneNumber().equals(phoneNumber)) {
                iter.remove();
                break;
            }

        }
    }



    public void deleteContactByName(String name) {
            //validateName(name);
        Iterator<Contact> myIterator = listOfContacts.iterator();
        while (myIterator.hasNext()) {
            Contact contacts = myIterator.next();
            if (contacts.getName().equals(name)) {
                myIterator.remove();
                break;
            }
        }
    }


    public void validatePhoneNumber(String phoneNumber) {
        if (!(phoneNumber.equals(contact.getPhoneNumber()))) {
            throw new IllegalArgumentException("Phone number not found");
        }

    }

    public void validateName(String name) {
            if (!(name.equalsIgnoreCase(contact.getName()))) {
                throw new IllegalArgumentException("Name not found");
            }
        }

    public String findContactByName(String name) {
            if (contact.getName().equals(name))
                System.out.println(name);
        return name;
    }

    public void viewContactWithName(@NotNull String name) {
        if (name.equals(contact.getName())) {
            System.out.println(contact.toString());
        } else {
            throw new IllegalArgumentException("Name does not exist");
        }
    }

    public void validateThatEmptyStringCanNotBreakCode(@NotNull String empty) {
        String emptyString = "";
        if (empty.equals(emptyString)) {
            throw new IllegalArgumentException("Invalid Argument");
        }
    }
    public void editContact(String nameToEdit, String newName) {
        for (int i = 0; i < listOfContacts.size(); i++) {
            if (listOfContacts.get(i).getName().equals(nameToEdit)) {
                listOfContacts.get(i).setName(newName);
                break;
            }
            else System.out.println("Name not found!!! ");
        }
    }


    public void viewAllContacts() {
        for (int i = 0; i < listOfContacts.size(); i++) {
            System.out.println(listOfContacts.get(i));
        }
    }

    public void viewContactWithPhoneNumber(String phoneNumber) {
        if (phoneNumber.equals(contact.getPhoneNumber())) {
            System.out.println(contact.toString());
        }
        else {
            throw new IllegalArgumentException("Phone Number doesn't exist");
        }
    }


}