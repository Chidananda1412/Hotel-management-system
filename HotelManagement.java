import java.util.Scanner;

public class HotelManagement {

    // Global variables
    static int[] advance = {750, 500, 400, 500, 750};
    static int[] r_no = {1, 2, 3, 4, 5};
    static int room;
    static int[] tot = {0, 0, 0, 0, 0};
    static int g_tot = 0;
    static int[] r_charge = new int[5];
    static String[] r_type = new String[5];
    static String[] r_cust = {"N.A", "N.A", "N.A", "N.A", "N.A"};
    static String[] c_city = {"N.A", "N.A", "N.A", "N.A", "N.A"};
    static String name;
    static int[] c_mem = new int[5];
    static String[] c_nat = {"N.A", "N.A", "N.A", "N.A", "N.A"};
    static char[] r_avail = {'Y', 'Y', 'Y', 'Y', 'Y'};
    static int[] r_per = new int[5];
    static int[] no = new int[5];
    static int[] year = new int[5];
    static int[] month = new int[5];
    static int[] day = new int[5];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        intro();
        int choice;
        do {
            screenheader();
            System.out.println("1. Features of the rooms");
            System.out.println("2. Room Availability");
            System.out.println("3. Allocate Room");
            System.out.println("4. Deallocate Room");
            System.out.println("5. Cancel Room");
            System.out.println("6. Restaurant");
            System.out.println("7. Customer Details");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                choice = -1; // Invalid choice
                scanner.next(); // Consume invalid input
            }

            switch (choice) {
                case 1:
                    features();
                    break;
                case 2:
                    putavail();
                    break;
                case 3:
                    allocate();
                    break;
                case 4:
                    deallocate();
                    break;
                case 5:
                    cancel();
                    break;
                case 6:
                    restaurant();
                    break;
                case 7:
                    putcust();
                    break;
                case 8:
                    System.out.println("Thank you for using the Hotel Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
            if (choice != 8) {
                System.out.println("\nPress Enter to return to the menu...");
                scanner.nextLine(); // Consume the newline
                scanner.nextLine(); // Wait for Enter
            }
        } while (choice != 8);
        scanner.close();
    }

    public static void intro() {
        System.out.println("\tNear BSF Chowk, G.T. Road, Jalandhar City,\n\t\tPunjab 144001, INDIA");
        System.out.println("\nPh. No.:011-27223959");
        System.out.println("\nWELCOMES YOU...");
        System.out.println("\nHotel Ganga Inn is one of the newest hotels in Jalandhar.");
        System.out.println("Set amidst beautifully landscaped gardens, the hotel is ideal for both business and leisure travellers.");
        System.out.println("\nAmenities:");
        System.out.println("1. 100% Power backup.");
        System.out.println("2. Automatic lift.");
        System.out.println("3. Ample parking space.");
        System.out.println("4. Round the clock security.");
        System.out.println("5. Running hot and cold water.");
        System.out.println("6. Free internet service.");
        System.out.println("7. 24 hours room service.");
        System.out.println("8. Laundry service.");
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine(); // Wait for Enter
    }

    public static void screenheader() {
        System.out.println("\n::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("::                                                  ::");
        System.out.println("::     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@     ::");
        System.out.println("::     @                                           @     ::");
        System.out.println("::     @               WELCOME TO                 @     ::");
        System.out.println("::     @           Hotel Management System        @     ::");
        System.out.println("::     @                                           @     ::");
        System.out.println("::     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@     ::");
        System.out.println("::                                                  ::");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
    }

    public static void features() {
        System.out.println("Choose the room type:");
        System.out.println("1. Sp. Deluxe");
        System.out.println("2. Deluxe");
        System.out.println("3. General");
        System.out.println("4. Couple");
        System.out.println("5. C. Deluxe");
        System.out.print("Enter your choice: ");
        int typ;
        if (scanner.hasNextInt()) {
            typ = scanner.nextInt();
        } else {
            typ = -1; // Invalid choice
            scanner.next(); // Consume invalid input
        }

        if (typ < 1 || typ > 5) {
            System.out.println("Wrong choice!! Choose a number between 1-5.");
            return;
        }

        switch (typ) {
            case 1:
                System.out.println("\nRoom number: 1");
                System.out.println("Advance: 750");
                System.out.println("Room Type: Sp. Deluxe");
                System.out.println("Room charges: Rs.1500 per day");
                System.out.println("Capacity: 5");
                System.out.println("Balcony, A/C, Geyser, and TV available");
                break;
            case 2:
                System.out.println("\nRoom number: 2");
                System.out.println("Advance: 500");
                System.out.println("Room Type: Deluxe");
                System.out.println("Room charges: Rs.1000 per day");
                System.out.println("Capacity: 5");
                System.out.println("A/C, Geyser, and TV available");
                break;
            case 3:
                System.out.println("\nRoom number: 3");
                System.out.println("Advance: 400");
                System.out.println("Room Type: General");
                System.out.println("Room charges: Rs.750 per day");
                System.out.println("Capacity: 5");
                System.out.println("Geyser available");
                break;
            case 4:
                System.out.println("\nRoom number: 4");
                System.out.println("Advance: 500");
                System.out.println("Room Type: Couple");
                System.out.println("Room charges: Rs.1000 per day");
                System.out.println("Capacity: 2");
                System.out.println("Geyser and TV available");
                break;
            case 5:
                System.out.println("\nRoom number: 5");
                System.out.println("Advance: 750");
                System.out.println("Room Type: Couple Deluxe");
                System.out.println("Room charges: Rs.1500 per day");
                System.out.println("Capacity: 2");
                System.out.println("A/C, Geyser, and TV available");
                break;
        }
    }

    public static void getavail() {
        for (int i = 0; i < 5; i++) {
            switch (r_no[i]) {
                case 1:
                    r_type[i] = "Sp Dlx";
                    r_charge[i] = 1500;
                    break;
                case 2:
                    r_type[i] = "Dlx";
                    r_charge[i] = 1000;
                    break;
                case 3:
                    r_type[i] = "Gen";
                    r_charge[i] = 750;
                    break;
                case 4:
                    r_type[i] = "Coupl";
                    r_charge[i] = 1000;
                    break;
                case 5:
                    r_type[i] = "C Dlx";
                    r_charge[i] = 1500;
                    break;
                default:
                    r_type[i] = "Unknown";
                    r_charge[i] = 0;
            }

            if (r_cust[i].equals("N.A")) {
                r_avail[i] = 'Y';
                r_per[i] = 0;
            }
        }
    }

    public static void putavail() {
        getavail(); // Ensure availability is updated
        System.out.println("\n                          ROOM AVAILABILITY");
        System.out.println("                         -------------------");
        System.out.println("Room No | Type    | Charge | Availability | Cust_Name         | Period");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%7d | %-7s | %6d | %12c | %-18s | %6d\n",
                    r_no[i], r_type[i], r_charge[i], r_avail[i], r_cust[i], r_per[i]);
        }
    }

    public static void allocate() {
        getavail();
        System.out.print("Enter the room number in which you want to stay: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid room number.");
            scanner.next(); // Consume invalid input
            return;
        }
        room = scanner.nextInt();
        if (room < 1 || room > 5) {
            System.out.println("Invalid room number.");
            return;
        }
        if (r_avail[room - 1] == 'Y') {
            scanner.nextLine(); // Consume newline
            System.out.print("Enter the name of the customer: ");
            r_cust[room - 1] = scanner.nextLine();
            System.out.print("Enter city: ");
            c_city[room - 1] = scanner.nextLine();
            System.out.print("Enter nationality: ");
            c_nat[room - 1] = scanner.nextLine();
            System.out.print("For how many days: ");
            if (scanner.hasNextInt()) {
                r_per[room - 1] = scanner.nextInt();
            } else {
                System.out.println("Invalid number of days.");
                scanner.next(); // Consume invalid input
                return;
            }
            System.out.print("Enter the number of members: ");
            if (scanner.hasNextInt()) {
                c_mem[room - 1] = scanner.nextInt();
            } else {
                System.out.println("Invalid number of members.");
                scanner.next(); // Consume invalid input
                return;
            }
            System.out.print("Enter the date of arrival (YYYY MM DD): ");
            if (scanner.hasNextInt()) {
                year[room - 1] = scanner.nextInt();
            } else {
                System.out.println("Invalid year.");
                scanner.next(); // Consume invalid input
                return;
            }
            if (scanner.hasNextInt()) {
                month[room - 1] = scanner.nextInt();
            } else {
                System.out.println("Invalid month.");
                scanner.next(); // Consume invalid input
                return;
            }
            if (scanner.hasNextInt()) {
                day[room - 1] = scanner.nextInt();
            } else {
                System.out.println("Invalid day.");
                scanner.next(); // Consume invalid input
                return;
            }
            r_avail[room - 1] = 'N';
            scanner.nextLine(); // Consume newline
            System.out.println("Room allocated to " + r_cust[room - 1] + " for " + r_per[room - 1] + " days.");
        } else {
            System.out.println("Room is not available.");
        }
    }

    public static void deallocate() {
        System.out.print("Enter the room number you want to deallocate: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid room number.");
            scanner.next(); // Consume invalid input
            return;
        }
        room = scanner.nextInt();
        if (room < 1 || room > 5) {
            System.out.println("Invalid room number.");
            return;
        }
        if (r_avail[room - 1] == 'Y') {
            System.out.println("The room is already empty.");
        } else {
            scanner.nextLine(); // Consume newline
            System.out.print("Enter the name of the customer: ");
            name = scanner.nextLine();
            if (name.equalsIgnoreCase(r_cust[room - 1])) {
                int bill = r_charge[room - 1] * r_per[room - 1];
                g_tot += bill;
                System.out.println("Room deallocated successfully.");
                System.out.println("Total bill: Rs." + bill);
                resetRoomDetails(room - 1);
            } else {
                System.out.println("The customer name does not match.");
            }
        }
    }

    public static void cancel() {
        System.out.print("Enter the room number you want to cancel: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid room number.");
            scanner.next(); // Consume invalid input
            return;
        }
        room = scanner.nextInt();
        if (room < 1 || room > 5) {
            System.out.println("Invalid room number.");
            return;
        }
        if (r_avail[room - 1] == 'Y') {
            System.out.println("The room is already empty.");
        } else {
            scanner.nextLine(); // Consume newline
            System.out.print("Enter the name of the customer: ");
            name = scanner.nextLine();
            if (name.equalsIgnoreCase(r_cust[room - 1])) {
                System.out.println("Room booking canceled successfully.");
                resetRoomDetails(room - 1);
            } else {
                System.out.println("The customer name does not match.");
            }
        }
    }

    public static void restaurant() {
        int items, quantity, price = 0, total = 0;
        char choice = 'y';

        System.out.println("\n\n\t\t******* Menu *******\n");
        System.out.println("1. Tea - Rs.5");
        System.out.println("2. Coffee - Rs.8");
        System.out.println("3. Cold Drink - Rs.10");
        System.out.println("4. Samosa - Rs.5");
        System.out.println("5. Dosa - Rs.30");
        System.out.println("6. Idli - Rs.20");
        System.out.println("7. Vada - Rs.25");
        System.out.println("8. Bhature Chole - Rs.35");
        System.out.println("9. Puri Sabji - Rs.30");
        System.out.println("10. Noodles - Rs.40");
        System.out.println();

        while (choice == 'y' || choice == 'Y') {
            System.out.print("Enter the item number you want: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid item number.");
                scanner.next(); // Consume invalid input
                continue;
            }
            items = scanner.nextInt();
            System.out.print("Enter the quantity: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid quantity.");
                scanner.next(); // Consume invalid input
                continue;
            }
            quantity = scanner.nextInt();

            switch (items) {
                case 1:
                    price = 5 * quantity;
                    break;
                case 2:
                    price = 8 * quantity;
                    break;
                case 3:
                    price = 10 * quantity;
                    break;
                case 4:
                    price = 5 * quantity;
                    break;
                case 5:
                    price = 30 * quantity;
                    break;
                case 6:
                    price = 20 * quantity;
                    break;
                case 7:
                    price = 25 * quantity;
                    break;
                case 8:
                    price = 35 * quantity;
                    break;
                case 9:
                    price = 30 * quantity;
                    break;
                case 10:
                    price = 40 * quantity;
                    break;
                default:
                    System.out.println("Invalid item number.");
                    price = 0;
            }
            total += price;
            System.out.println("Total so far: Rs." + total);
            System.out.print("Do you want to order more (y/n)? ");
            choice = scanner.next().charAt(0);
        }
        System.out.println("Final total bill: Rs." + total);
        g_tot += total; // Adding restaurant bill to the grand total
    }

    public static void putcust() {
        System.out.println("\nCustomer Details\n------------------");
        System.out.println("Room No | Customer Name      | City               | Nationality        | Members | Arrival Date");
        for (int i = 0; i < 5; i++) {
            if (!r_cust[i].equals("N.A")) {
                System.out.printf("%7d | %-18s | %-18s | %-18s | %7d | %04d-%02d-%02d\n",
                        r_no[i], r_cust[i], c_city[i], c_nat[i], c_mem[i], year[i], month[i], day[i]);
            } else {
                System.out.printf("%7d | %-18s | %-18s | %-18s | %7d | %04d-%02d-%02d\n",
                        r_no[i], "N.A", "N.A", "N.A", 0, 0, 0, 0);
            }
        }
    }

    private static void resetRoomDetails(int roomIndex) {
        r_avail[roomIndex] = 'Y';
        r_cust[roomIndex] = "N.A";
        r_per[roomIndex] = 0;
        c_city[roomIndex] = "N.A";
        c_nat[roomIndex] = "N.A";
        c_mem[roomIndex] = 0;
    }
}
