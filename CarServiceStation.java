import java.util.Scanner;

public class CarServiceStation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Welcome to the Car Service Station");
            System.out.println("1. Buy a Car");
            System.out.println("2. Sell a Car");
            System.out.println("3. Service a Car");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    buyCar();
                    break;
                case 2:
                    sellCar();
                    break;
                case 3:
                    serviceCar();
                    break;
                case 4:
                    System.out.println("Thank you for using our service. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
    
    public static void buyCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have selected to buy a car.");
        System.out.print("Enter the make of the car: ");
        String make = scanner.nextLine();
        System.out.print("Enter the model of the car: ");
        String model = scanner.nextLine();
        System.out.print("Enter the year of manufacture: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Congratulations! You have bought a " + year + " " + make + " " + model);
    }
    
    public static void sellCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have selected to sell a car.");
        System.out.print("Enter the make of the car: ");
        String make = scanner.nextLine();
        System.out.print("Enter the model of the car: ");
        String model = scanner.nextLine();
        System.out.print("Enter the year of manufacture: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("You have sold your " + year + " " + make + " " + model);
    }
    
    public static void serviceCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have selected to service a car.");
        System.out.print("Enter the make of the car: ");
        String make = scanner.nextLine();
        System.out.print("Enter the model of the car: ");
        String model = scanner.nextLine();
        System.out.print("Enter the year of manufacture: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        double serviceCost = calculateServiceCost(); // Calculate service cost
        double discount = getDiscount(); // Get discount
        double totalCost = serviceCost - (serviceCost * discount / 100); // Calculate total cost with discount
        
        System.out.println("Your " + year + " " + make + " " + model + " has been serviced.");
        System.out.println("Service Cost: " + serviceCost);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Total Cost: " + totalCost);
    }
    
    public static double calculateServiceCost() {
        // In a real-world scenario, you would calculate the service cost based on the services provided.
        // For simplicity, let's assume a fixed service cost for now.
        return 100.0; // Fixed service cost
    }
    
    public static double getDiscount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter discount percentage (if any): ");
        double discount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        return discount;
    }
}

