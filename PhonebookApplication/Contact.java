package ChapterEight.PhonebookApplication;

import org.jetbrains.annotations.NotNull;

public class Contact {

    private String name;
    private String phoneNumber;
    private String address;
    private String emailAddress;

    public Contact(String name, String phoneNumber, String address, String emailAddress) {
       //validate(phoneNumber, address, emailAddress);

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.emailAddress = emailAddress;
    }

    public void validate(String phoneNumber, String address, String emailAddress) {
        validatePhoneNumber(phoneNumber);
        validateAddress(address);
        validateAddress(emailAddress);

    }

    private void validateName(String name) {
        if (!(name.equals(getName()))) {
            throw new IllegalArgumentException("Name is not found");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        validateAddress(address);
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(String phoneNumber) {
        validatePhoneNumber(phoneNumber);
        validatePhoneNumberDoesNotContainLetter(phoneNumber);
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        validatePhoneNumber(phoneNumber);
        validatePhoneNumberDoesNotContainLetter(phoneNumber);
        return phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        verifyEmailAddress(emailAddress);
        this.emailAddress = emailAddress;
    }
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return String.format("""
                =======================
                Name: %s
                Phone Number: %s
     
                Address: %s
                Email Address: %s
                """,getName(), getPhoneNumber(), getAddress(), getEmailAddress());
    }
    public void validatePhoneNumber(String phoneNumber) {
        try {
            if (!(phoneNumber.length() == 11)) {
                throw new IllegalArgumentException("length must be 11");
            }
            validatePhoneNumberDoesNotContainLetter(phoneNumber);
        } catch (IllegalArgumentException ignored) {}
    }

    public void validatePhoneNumberDoesNotContainLetter(String phoneNumber) {
        if (phoneNumber.contains("[a-Z A-Z]+$")) {
            throw new IllegalArgumentException("phone number can not contain letter");
        }
    }
    public void verifyEmailAddress(@NotNull String emailAddress) {
        if (!(emailAddress.endsWith("@yahoo.com") || emailAddress.endsWith("@gmail.com"))) {
            throw new IllegalArgumentException("email address should end with .com");
        }
        }
    public void validateAddress(@NotNull String address) {
        if (!(address.startsWith("1") || address.startsWith("2") || address.startsWith("3") || address.startsWith("4") ||
                address.startsWith("5") || address.startsWith("6") || address.startsWith("7") ||
                address.startsWith("8") || address.startsWith("9") || address.startsWith("0"))) {
            throw new IllegalArgumentException("address must start with a number");
        }

}
}


