package contract;

/**
 * Created by simon on 05/10/2016.
 */
public class PersonInfo {
    String firstName;
    String lastName;
    String mobileNo;
    String email;
    String address;

    public PersonInfo(String firstName, String lastName, String mobileNo, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNo = mobileNo;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
    
}
