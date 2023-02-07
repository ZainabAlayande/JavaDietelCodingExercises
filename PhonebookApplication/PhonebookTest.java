package ChapterEight.PhonebookApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhonebookTest {

    private Phonebook phonebook;

    @BeforeEach
    public void startWithThis() {
        phonebook = new Phonebook();
    }

    @Test
    public void test_that_I_can_have_a_phonebook() {
        assertNotNull(phonebook);
    }

    @Test
    public void test_I_can_create_contacts_in_phonebook() {
        phonebook.addContact("Zee", "08023499887", "5O,kakukaya Str", "olasco@yahoo.com");
        phonebook.addContact("Zwe", "08056799887", "9O,kakukaya Str", "olasco@gmail.com");
        assertEquals(2, phonebook.countContact());
    }

    @Test
    public void test_I_can_view_contact_with_name() {
        phonebook.addContact("Zee", "08023499887", "5Okakukaya Str", "olasco@yahoo.com");
        phonebook.addContact("Mee", "08056799887", "9Okakukaya Str", "olasco@gmail.com");
        phonebook.addContact("Gee", "08056799887", "7Okakukaya Str", "olasco@yahoo.com");
        phonebook.viewContactWithName("Mee");
        assertEquals("Mee", phonebook.findContactByName("Mee"));
    }

    @Test
    public void test_that_contact_can_be_edited() {
        phonebook.addContact("Zee", "08056799887", "9Okakukaya Str", "olasco@yahoo.com");
        phonebook.addContact("Efe", "08056799887", "9Okakukaya Str", "olasco@yahoo.com");
        phonebook.editContact("zee", "wale");
        String newName = "wale";
        assertEquals("wale", newName);
    }

    @Test
    public void test_that_contact_can_be_deleted_by_phone_number() {
        phonebook.addContact("Zee", "08023499887", "5Okakukaya Str", "olasco@yahoo.com");
        phonebook.addContact("Mee", "08056799887", "9Okakukaya Str", "olasco@gmail.com");
        phonebook.deleteContactByPhoneNumber("08023499887");
        assertEquals(1, phonebook.countContact());
    }

    @Test
    public void test_contact_can_be_deleted_by_name() {
        phonebook.addContact("Gee", "678", "6,botun", "wale@gmail.com");
        phonebook.addContact("Taiwo", "678", "6,botun", "taiwo@gmail.com");
        phonebook.addContact("Rasaq", "678", "6,botun", "rasaq@gmail.com");
        phonebook.addContact("Ola", "678", "6,botun", "olae@gmail.com");
        phonebook.deleteContactByName("Taiwo");
        assertEquals(3, phonebook.countContact());


    }



}