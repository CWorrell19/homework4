// Conner Worrell

// Represents a generic staff member
abstract public class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    // Constructor to set up a staff member using the specified information
    public StaffMember(String eName, String eAddress, String ePhone) {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }

    // Abstract method to be defined by derived classes
    public abstract double pay();

    // Returns a string including the basic employee information
    public String toString() {
        String result = "Name: " + name + "\n";
        result += "Address: " + address + "\n";
        result += "Phone: " + phone;
        return result;
    }
}
