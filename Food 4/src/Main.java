import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuService menuService = new MenuService();
        OrderService orderService = new OrderService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Online Food Ordering System ---");
            System.out.println("1. Menu Browsing");
            System.out.println("2. Order Placement");
            System.out.println("3. Delivery Tracking");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Menu Browsing
                    menuService.displayMenu();
                    break;
                case 2:
                    // Order Placement
                    menuService.displayMenu();
                    System.out.print("Enter the ID of the food item you want to order: ");
                    int foodId = scanner.nextInt();
                    String foodName = menuService.getFoodItemById(foodId).getName();
                    orderService.placeOrder(foodName);
                    break;
                case 3:
                    // Delivery Tracking
                    System.out.print("Enter your Order ID: ");
                    int orderId = scanner.nextInt();
                    orderService.trackOrder(orderId);
                    break;
                case 4:
                    // Exit
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}