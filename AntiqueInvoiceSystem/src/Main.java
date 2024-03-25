import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Validate password
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        if (!password.equals("ANT14west")) {
            System.out.println("Invalid password. Exiting program.");
            System.exit(0);
        }

        // Get user input for table specifications
        int tableWidth = 0;
        int tableLength = 0;

        try {
            // Use try-catch block to ensure the table width is not less than 80
            System.out.print("Enter table width (cm): ");
            tableWidth = scanner.nextInt();

            // Validate that the table width is not less than 80
            if (tableWidth < 80) {
                throw new IllegalArgumentException("Table width must be at least 80 cm.");
            }

            // Use try-catch block to ensure the table length is not less than 120
            System.out.print("Enter table length (cm): ");
            tableLength = scanner.nextInt();

            // Validate that the table length is not less than 120
            if (tableLength < 120) {
                throw new IllegalArgumentException("Table length must be at least 120 cm.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input for table specifications. " + e.getMessage());
            System.exit(0);
        }

        // Continue with the wood type input
        scanner.nextLine(); // Consume the newline character left in the buffer
        System.out.print("Enter wood type (Mahogany/Oak/Pine): ");
        String woodType = scanner.nextLine();

        // Use try-catch block to ensure the number of drawers is between 0 and 6
        int numDrawers = 0;
        try {
            System.out.print("Enter number of drawers (0-6): ");
            numDrawers = scanner.nextInt();

            // Validate that the number of drawers is between 0 and 6
            if (numDrawers < 0 || numDrawers > 6) {
                throw new IllegalArgumentException("Number of drawers must be between 0 and 6.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input for the number of drawers. " + e.getMessage());
            System.exit(0);
        }

        // Create the appropriate table object based on wood type
        Table table = null;
        if (woodType.equalsIgnoreCase("Mahogany")) {
            table = new Mahogany(tableWidth, tableLength, numDrawers);
        } else if (woodType.equalsIgnoreCase("Oak")) {
            table = new Oak(tableWidth, tableLength, numDrawers);
        } else if (woodType.equalsIgnoreCase("Pine")) {
            table = new Pine(tableWidth, tableLength, numDrawers);
        } else {
            System.out.println("Invalid wood type. Exiting program.");
            System.exit(0);
        }

        // Get the number of tables
        System.out.print("Enter the number of tables: ");
        int numTables = scanner.nextInt();

        // Apply discount for multiple tables
        double discount = (numTables > 1) ? 0.05 : 0.0;

        // Calculate total cost and apply discount
        double totalCost = (table.calculateBasePrice() + table.calculateTotalCost()) * numTables * (1 - discount);
        int drawerCost = table.getDrawerCost();

        double finalCost = (totalCost - (discount * totalCost));


        // Display the invoice
        System.out.println("-------- INVOICE --------");
        System.out.println("Table dimensions: " + tableWidth + "cm x " + tableLength + "cm");
        System.out.println("Table area: " + table.getArea() + "cm²");
        System.out.println("Base price: Ksh " + table.calculateBasePrice());
        System.out.println("Wood type: " + woodType);
        System.out.println("Extra cost for wood: Ksh " + table.woodPrice());
        System.out.println("Number of drawers: " + numDrawers);
        System.out.println("Drawer Cost: Ksh " + drawerCost);
        System.out.println("Total cost: Ksh " + totalCost);
        System.out.println("Discount: Ksh " + (discount * totalCost));
        System.out.println("Final cost: Ksh " + finalCost);

        // Ask for the amount tendered
        System.out.print("Enter the amount tendered: Ksh ");
        double amountTendered = scanner.nextDouble();

        // Calculate change (balance)
        double change = amountTendered - finalCost;

        // Display additional details in the invoice
        System.out.println("Amount Tendered: Ksh " + amountTendered);
        System.out.println("Change (Balance): Ksh " + change);

        // Thank you message
        System.out.println("""

                Thank you for choosing Antique Furniture Kenya Limited!
                We are located in Westlands, Nairobi. Come shop with us again.""");

        // Close the scanner
        scanner.close();
    }
}
