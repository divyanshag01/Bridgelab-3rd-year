
// Question 6: Car Rental System
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000.0;

    // Default constructor
    CarRental() {
        this.customerName = "Customer";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: " + calculateTotalCost());
    }
}
