package ChapterEight.PhonebookApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {


    private Contact contact;
    @BeforeEach
    public void start_with_this() {
        contact = new Contact("Zainab Alayande", "08023477890", "23 Okakukaya Str", "olasco@yahoo.com");
    }

    @Test
    public void test_phone_number_having_more_than_11_length_and_does_not_contain_string_throws_exception() {
        assertThrows(IllegalArgumentException.class, ()->contact.validatePhoneNumber("080236771145"));
    }

    @Test
    public void test_phone_number_does_not_contain_letters_throws_exception() {
        assertThrows(IllegalArgumentException.class, ()->contact.validatePhoneNumberDoesNotContainLetter("f8023h77114"));
    }

    @Test
    public void test_email_address_ends_with_yahoo_dot_com_or_gmail_dot_com_throw_exception() {
            assertThrows(IllegalArgumentException.class, ()->contact.verifyEmailAddress("zainabalayande"));
    }

    @Test
    public void test_that_the_first_letter_of_address_starts_with_number() {
        assertThrows(IllegalArgumentException.class, ()->contact.validateAddress("y77, shukuma street"));
    }


    @Test
    public void test_that_contacts_can_have_name() {
        String result = contact.getName();
        assertEquals("Zainab Alayande", result);
    }

    @Test
    public void test_that_contacts_can_have_phone_number() {
        String result = contact.getPhoneNumber();
        assertEquals("08023477890", result);
    }


    @Test
    public void test_that_contacts_can_set_address() {
        contact.setAddress("23, Chibuzo Onike, Street");
        String getAddress = contact.getAddress();
        assertEquals("23, Chibuzo Onike, Street", getAddress);
    }


    @Test
    public void test_that_contacts_can_set_emailAddress() {
        contact.setEmailAddress("olaideiwaya@hotmail.com");
        String getEmailAddress = contact.getEmailAddress();
        assertEquals("olaideiwaya@hotmail.com", getEmailAddress);
    }


}