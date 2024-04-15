// Conner Worrell
// Represents the personnel staff of a particular business
public class Staff {
    // Array of staff members
    StaffMember[] staffList;

    // Constructor to set up the list of staff members
    public Staff() {
        // Increase the size of the array to 8
        staffList = new StaffMember[8];
        // Add staff members to the list
        staffList[0] = new Executive("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        staffList[1] = new Employee("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
        staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);
        staffList[4] = new Volunteer("Norm", "987 Suds Blvd.", "555-8374");
        staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");
        // Add two commissioned employees with specified details
        staffList[6] = new Commission("Alice", "111 Elm Street", "555-1234", "456-78-9012", 6.25, 0.20);
        staffList[7] = new Commission("Bob", "222 Oak Street", "555-5678", "789-12-3456", 9.75, 0.15);
        // Add hours and sales for commissioned employees
        ((Hourly) staffList[6]).addHours(35);
        ((Commission) staffList[6]).addSales(400);
        ((Hourly) staffList[7]).addHours(40);
        ((Commission) staffList[7]).addSales(950);
    }

    // Method to pay all staff members
    public void payday() {
        double amount;
        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);
            amount = staffList[count].pay(); // polymorphic
            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);
            System.out.println("-----------------------------------");
        }
    }
}