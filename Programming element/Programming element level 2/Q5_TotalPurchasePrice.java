import java.util.Scanner;

class Q5_TotalPurchasePrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter unit price (INR): ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        double totalPurchasePrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPurchasePrice +
                " if the quantity " + quantity + " and unit price is INR " + unitPrice);
        input.close();
    }
}