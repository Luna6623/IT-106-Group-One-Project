public class UtilityTools {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true; // init base case

        ArrayList<String> events = new ArrayList<>();

        while (running) { // if changed to false then it will exit
            System.out.println("\n=== Utility Tools ===");
            System.out.println("1. Simple Calculator");
            System.out.println("2. Campus Event Scheduler");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            try {
                int menuChoice = sc.nextInt();
                sc.nextLine(); // takes the user's next newline

                switch (menuChoice) { // prompts users to different desired areas
                    case 1:
                        simpleCalculator(sc);
                        break;
                    case 2:
                        eventScheduler(sc, events);
                        break;
                    case 3:
                        System.out.println("Exiting Utility Tools. Goodbye!");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

            } catch (InputMismatchException e) { // catch error
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                sc.nextLine(); // clear the invalid input
            }
        }

        sc.close(); // this part was only made for setting different operations
    }

    // ===== Simple Calculator ===== *formating* 
    public static void simpleCalculator(Scanner sc) {
        boolean calcRunning = true;

        while (calcRunning) {
            System.out.println("\n=== Simple Calculator ===");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Back to Utility Menu");
            System.out.print("Select an operation: ");

            try { // if for some reason user selects 5
                int choice = sc.nextInt();

                if (choice == 5) {
                    calcRunning = false;
                    continue;
                }

                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                double result = 0;

                switch (choice) { // creates cases for the different options
                    case 1:
                        result = add(num1, num2);
                        break;
                    case 2:
                        result = subtract(num1, num2);
                        break;
                    case 3:
                        result = multiply(num1, num2);
                        break;
                    case 4:
                        try {
                            result = divide(num1, num2);
                        } catch (ArithmeticException e) { // catches any DNE or erros
                            System.out.println("Error: " + e.getMessage()); 
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Invalid operation. Try again.");
                        continue;
                }

                System.out.println("Result: " + result);

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter valid numbers.");
                sc.nextLine(); // clears the invalid input
            }
        }
    }

    // init the calc operations
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero."); // creates case for DNE 
        }
        return a / b;
    }

    // ===== Campus Event Scheduler =====
    public static void eventScheduler(Scanner sc, ArrayList<String> events) {
        boolean eventRunning = true;

        while (eventRunning) { // events format
            System.out.println("\n=== Campus Event Scheduler ===");
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Back to Utility Menu");
            System.out.print("Select an option: ");

            try { 
                int choice = sc.nextInt();
                sc.nextLine(); // takes the users newline

                switch (choice) {
                    case 1: // creation of a event
                        System.out.print("Enter event name: ");
                        String eventName = sc.nextLine();
                        System.out.print("Enter event date (e.g., 2025-11-12): ");
                        String eventDate = sc.nextLine();

                        String newEvent = "Event: " + eventName + " | Date: " + eventDate;
                        events.add(newEvent);

                        System.out.println("Event added successfully!");
                        break;

                    case 2: // will show or not show the events
                        if (events.isEmpty()) {
                            System.out.println("No events scheduled.");
                        } else {
                            System.out.println("\n--- Scheduled Events ---");
                            for (int i = 0; i < events.size(); i++) {
                                System.out.println((i + 1) + ". " + events.get(i));
                            }
                        }
                        break;

                    case 3: // back to the utility menu
                        eventRunning = false;
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.nextLine(); // clears the invalid input
            }
        }
    }
}
