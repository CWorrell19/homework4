// Conner Worrell

// Commission class extends Hourly class to represent employees who earn hourly pay and commission on sales.
public class Commission extends Hourly {
    private double totalSales; // Instance variable to store total sales
    private double commissionRate; // Instance variable to store commission rate

    // Constructor with 6 parameters: name, address, phone number, social security number, hourly pay rate, commission rate
    public Commission(String name, String address, String phone, String socialSecurityNumber, double payRate, double commissionRate) {
        // Call constructor of parent class (Hourly) with the first 5 parameters
        super(name, address, phone, socialSecurityNumber, payRate);
        // Set commission rate
        this.commissionRate = commissionRate;
    }

    // Method to add sales to total sales
    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    // Override pay method to compute pay for hours worked and add commission on sales
    @Override
    public double pay() {
        // Compute pay for hours worked using pay method of parent class (Hourly)
        double hourlyPay = super.pay();
        // Compute commission on sales
        double commissionPay = totalSales * commissionRate;
        // Reset total sales to 0
        totalSales = 0;
        // Return total pay (hourly pay + commission pay)
        return hourlyPay + commissionPay;
    }

    // Override toString method to include total sales in the employee information
    @Override
    public String toString() {
        // Call toString method of parent class (Hourly) to get basic employee information
        String basicInfo = super.toString();
        // Append total sales information
        return basicInfo + "\nTotal Sales: $" + totalSales;
    }
}
