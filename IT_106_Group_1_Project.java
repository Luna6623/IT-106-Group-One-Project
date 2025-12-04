package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class GroupProject {

    public static void StudentModule(int arrayLength, String[] firstNameArray, String[] lastNameArray, String[] firstClassArray, String[] firstGrade, int[] firstCredit, String[] secondClassArray, String[] secondGrade, int[] secondCredit, String[] thirdClassArray, String[] thirdGrade, int[] thirdCredit, String[] fourthClassArray, String[] fourthGrade, int[] fourthCredit, String[] fifthClassArray, String[] fifthGrade, int[] fifthCredit, Scanner scnr) {
        // Initial user input to choose a task
        String userChoice;

        // Student records arrays

        // Displays user choices
        System.out.println("Choose what you would like to do");
        System.out.println("   Add student records");
        System.out.println("   Search student records");
        System.out.println("   Display students");
        System.out.println("   GPA calculator");
        
        // Reads user's input and allows for it to be read better
        userChoice = scnr.nextLine();
        userChoice = userChoice.toLowerCase();

        // If else statements to decide which task is to be executed

        // Adding student records
        if((userChoice.compareTo("add student records") == 0) || (userChoice.compareTo("add student record") == 0) || (userChoice.compareTo("add student") == 0)) {
            int amountInputs;

            System.out.print("How many records to you want to input? ");
            amountInputs = scnr.nextInt();

            for (int i = 0; i < amountInputs; i++) {
                int input = Math.abs(amountInputs - arrayLength) + i;
                System.out.print("Enter the student's first name: ");
                firstNameArray[input] = scnr.next();
                System.out.println();

                System.out.print("Enter the student's last name (any students with multiple last names should have the names seperated by a -): ");
                lastNameArray[input] = scnr.next();
                System.out.println();

                System.out.print("Enter the student's first class: ");
                firstClassArray[input] = scnr.next();
                System.out.println();

                System.out.println("Enter the student's first class's grade: ");
                firstGrade[input] = scnr.next();
                System.out.println();

                System.out.print("Enter the amount of credits for the first class: ");
                firstCredit[input] = scnr.nextInt();
                System.out.println();

                System.out.print("Enter the student's second class: ");
                secondClassArray[input] = scnr.next();
                System.out.println();

                System.out.print("Enter the student's second class's grade: ");
                secondGrade[input] = scnr.next();
                System.out.println();

                System.out.print("Enter the amount of credits for the second class: ");
                secondCredit[input] = scnr.nextInt();
                System.out.println();

                System.out.print("Enter the student's third class: ");
                thirdClassArray[input] = scnr.next();
                System.out.println();

                System.out.print("Enter the student's third class's grade: ");
                thirdGrade[input] = scnr.next();
                System.out.println();

                System.out.print("Enter the amount of credits for the third class: ");
                thirdCredit[input] = scnr.nextInt();
                System.out.println();

                System.out.print("Enter the student's fourth class: ");
                fourthClassArray[input] = scnr.next();
                System.out.println();

                System.out.print("Enter the student's fourth class's grade: ");
                fourthGrade[input] = scnr.next();
                System.out.println();

                System.out.print("Enter the amount of credits for the fourth class: ");
                fourthCredit[input] = scnr.nextInt();
                System.out.println();

                System.out.print("Enter the student's fifth class: ");
                fifthClassArray[input] = scnr.next();
                System.out.println();

                System.out.print("Enter the student's fifth class's grade: ");
                fifthGrade[input] = scnr.next();
                System.out.println();

                System.out.print("Enter the amount of credits for the fifth class: ");
                fifthCredit[input] = scnr.nextInt();
                System.out.println();
            }
        }

        // Prints student array that is created
        else if ((userChoice.compareTo("display student records") == 0) || (userChoice.compareTo("display student record") == 0) || (userChoice.compareTo("display students") == 0)) {
            for (int i = arrayLength - 1; i > 0; i--) {
                if (firstNameArray[i] != null) {
                    System.out.println(firstNameArray[i]);
                    System.out.println(lastNameArray[i]);
                    System.out.println();
                    System.out.println(firstClassArray[i]);
                    System.out.println(firstGrade[i]);
                    System.out.println();
                    System.out.println(secondClassArray[i]);
                    System.out.println(secondGrade[i]);
                    System.out.println();
                    System.out.println(thirdClassArray[i]);
                    System.out.println(thirdGrade[i]);
                    System.out.println();
                    System.out.println(fourthClassArray[i]);
                    System.out.println(fourthGrade[i]);
                    System.out.println();
                    System.out.println(fifthClassArray[i]);
                    System.out.println(fifthGrade[i]);

                    System.out.println();
                    System.out.println();
                    System.out.println();
                }
                else {
                    break;
                }
            }

            

            System.out.println("");
            
        }

        else if ((userChoice.compareTo("search student records") == 0) || (userChoice.compareTo("search student record") == 0) || (userChoice.compareTo("search students") == 0)) {
            String studentLastName;
            int displayNumber = 0;
            
            System.out.print("Enter the last name of the student you would like to look for (any students with multiple last names should have the names seperated by a -): ");

            studentLastName = scnr.next();

            for (int i = 0; i < arrayLength; i++) {
                String searcher = lastNameArray[i];

                if (studentLastName.equals(searcher)) {
                    displayNumber = i;
                    break;
                }
            }

            System.out.println(firstNameArray[displayNumber]);

            System.out.println(lastNameArray[displayNumber]);

            System.out.println("");

            System.out.println(firstClassArray[displayNumber]);

            System.out.println(firstGrade[displayNumber]);

            System.out.println("");

            System.out.println(secondClassArray[displayNumber]);

            System.out.println(secondGrade[displayNumber]);

            System.out.println("");

            System.out.println(thirdClassArray[displayNumber]);

            System.out.println(thirdGrade[displayNumber]);

            System.out.println("");

            System.out.println(fourthClassArray[displayNumber]);

            System.out.println(fourthGrade[displayNumber]);

            System.out.println("");

            System.out.println(fifthClassArray[displayNumber]);

            System.out.println(fifthGrade[displayNumber]);

            System.out.println("");

        }
        else if ((userChoice.compareTo("gpa") == 0) || (userChoice.compareTo("gpa calculator") == 0) || (userChoice.compareTo("GPA") == 0) || (userChoice.compareTo("calculator") == 0)) {
            String studentLastName;
            int display = 0;
            int sum = 0;
            int credits = 0;
            
            System.out.print("Enter the last name of the student you would like to look for (any students with multiple last names should have the names seperated by a -): ");

            studentLastName = scnr.next();

            for (int i = 0; i < arrayLength; i++) {
                String searcher = lastNameArray[i];

                if (studentLastName.equals(searcher)) {
                    display = i;
                    break;
                }
            }
            if ((firstGrade[display].equals("A")) || (firstGrade[display].equals("A+"))) {
                sum += (4.0 * firstCredit[display]);
                credits += secondCredit[display];
            } else if (firstGrade[display].equals("A-")) {
                sum += (3.7 * firstCredit[display]);
                credits += firstCredit[display];
            } else if (firstGrade[display].equals("B+")) {
                sum += (3.3 * firstCredit[display]);
                credits += firstCredit[display];
            } else if (firstGrade[display].equals("B")) {
                sum += (3.0 * firstCredit[display]);
                credits += firstCredit[display];
            } else if (firstGrade[display].equals("B-")) {
                sum += (2.7 * firstCredit[display]);
                credits += firstCredit[display];
            } else if (firstGrade[display].equals("C+")) {
                sum += (2.3 * firstCredit[display]);
                credits += firstCredit[display];
            } else if (firstGrade[display].equals("C")) {
                sum += (2.0 * firstCredit[display]);
                credits += firstCredit[display];
            } else if (firstGrade[display].equals("D+")) {
                sum += (1.7 * firstCredit[display]);
                credits += firstCredit[display];
            } else if (firstGrade[display].equals("D")) {
                sum += (1.3 * firstCredit[display]);
                credits += firstCredit[display];
            } else if (firstGrade[display].equals("D-")) {
                sum += (0.7 * firstCredit[display]);
                credits += firstCredit[display];
            } else {
                sum += (0.0 * firstCredit[display]);
                credits += firstCredit[display];
            }
            if ((secondGrade[display].equals("A")) || (secondGrade[display].equals("A+"))) {
                sum += (4.0 * secondCredit[display]);
                credits += secondCredit[display];
            } else if (secondGrade[display].equals("A-")) {
                sum += (3.7 * secondCredit[display]);
                credits += secondCredit[display];
            } else if (secondGrade[display].equals("B+")) {
                sum += (3.3 * secondCredit[display]);
                credits += secondCredit[display];
            } else if (secondGrade[display].equals("B")) {
                sum += (3.0 * secondCredit[display]);
                credits += secondCredit[display];
            } else if (secondGrade[display].equals("B-")) {
                sum += (2.7 * secondCredit[display]);
                credits += secondCredit[display];
            } else if (secondGrade[display].equals("C+")) {
                sum += (2.3 * secondCredit[display]);
                credits += secondCredit[display];
            } else if (secondGrade[display].equals("C")) {
                sum += (2.0 * secondCredit[display]);
                credits += secondCredit[display];
            } else if (secondGrade[display].equals("D+")) {
                sum += (1.7 * secondCredit[display]);
                credits += secondCredit[display];
            } else if (secondGrade[display].equals("D")) {
                sum += (1.3 * secondCredit[display]);
                credits += secondCredit[display];
            } else if (secondGrade[display].equals("D-")) {
                sum += (0.7 * secondCredit[display]);
                credits += secondCredit[display];
            } else {
                sum += (0.0 * secondCredit[display]);
                credits += secondCredit[display];
            }
            if ((thirdGrade[display].equals("A")) || (thirdGrade[display].equals("A+"))) {
                sum += (4.0 * thirdCredit[display]);
                credits += thirdCredit[display];
            } else if (thirdGrade[display].equals("A-")) {
                sum += (3.7 * thirdCredit[display]);
                credits += thirdCredit[display];
            } else if (thirdGrade[display].equals("B+")) {
                sum += (3.3 * thirdCredit[display]);
                credits += thirdCredit[display];
            } else if (thirdGrade[display].equals("B")) {
                sum += (3.0 * thirdCredit[display]);
                credits += thirdCredit[display];
            } else if (thirdGrade[display].equals("B-")) {
                sum += (2.7 * thirdCredit[display]);
                credits += thirdCredit[display];
            } else if (thirdGrade[display].equals("C+")) {
                sum += (2.3 * thirdCredit[display]);
                credits += thirdCredit[display];
            } else if (thirdGrade[display].equals("C")) {
                sum += (2.0 * thirdCredit[display]);
                credits += thirdCredit[display];
            } else if (thirdGrade[display].equals("D+")) {
                sum += (1.7 * thirdCredit[display]);
                credits += thirdCredit[display];
            } else if (thirdGrade[display].equals("D")) {
                sum += (1.3 * thirdCredit[display]);
                credits += thirdCredit[display];
            } else if (thirdGrade[display].equals("D-")) {
                sum += (0.7 * thirdCredit[display]);
                credits += thirdCredit[display];
            } else {
                sum += (0.0 * thirdCredit[display]);
                credits += thirdCredit[display];
            }
            if ((fourthGrade[display].equals("A")) || (fourthGrade[display].equals("A+"))) {
                sum += (4.0 * fourthCredit[display]);
                credits += fourthCredit[display];
            } else if (fourthGrade[display].equals("A-")) {
                sum += (3.7 * fourthCredit[display]);
                credits += fourthCredit[display];
            } else if (fourthGrade[display].equals("B+")) {
                sum += (3.3 * fourthCredit[display]);
                credits += fourthCredit[display];
            } else if (fourthGrade[display].equals("B")) {
                sum += (3.0 * fourthCredit[display]);
                credits += fourthCredit[display];
            } else if (fourthGrade[display].equals("B-")) {
                sum += (2.7 * fourthCredit[display]);
                credits += fourthCredit[display];
            } else if (fourthGrade[display].equals("C+")) {
                sum += (2.3 * fourthCredit[display]);
                credits += fourthCredit[display];
            } else if (fourthGrade[display].equals("C")) {
                sum += (2.0 * fourthCredit[display]);
                credits += fourthCredit[display];
            } else if (fourthGrade[display].equals("D+")) {
                sum += (1.7 * fourthCredit[display]);
                credits += fourthCredit[display];
            } else if (fourthGrade[display].equals("D")) {
                sum += (1.3 * fourthCredit[display]);
                credits += fourthCredit[display];
            } else if (fourthGrade[display].equals("D-")) {
                sum += (0.7 * fourthCredit[display]);
                credits += fourthCredit[display];
            } else {
                sum += (0.0 * fourthCredit[display]);
                credits += fourthCredit[display];
            }
            if ((fifthGrade[display].equals("A")) || (fifthGrade[display].equals("A+"))) {
                sum += (4.0 * fifthCredit[display]);
                credits += fifthCredit[display];
            } else if (fifthGrade[display].equals("A-")) {
                sum += (3.7 * fifthCredit[display]);
                credits += fifthCredit[display];
            } else if (fifthGrade[display].equals("B+")) {
                sum += (3.3 * fifthCredit[display]);
                credits += fifthCredit[display];
            } else if (fifthGrade[display].equals("B")) {
                sum += (3.0 * fifthCredit[display]);
                credits += fifthCredit[display];
            } else if (fifthGrade[display].equals("B-")) {
                sum += (2.7 * fifthCredit[display]);
                credits += fifthCredit[display];
            } else if (fifthGrade[display].equals("C+")) {
                sum += (2.3 * fifthCredit[display]);
                credits += fifthCredit[display];
            } else if (fifthGrade[display].equals("C")) {
                sum += (2.0 * fifthCredit[display]);
                credits += fifthCredit[display];
            } else if (fifthGrade[display].equals("D+")) {
                sum += (1.7 * fifthCredit[display]);
                credits += fifthCredit[display];
            } else if (fifthGrade[display].equals("D")) {
                sum += (1.3 * fifthCredit[display]);
                credits += fifthCredit[display];
            } else if (fifthGrade[display].equals("D-")) {
                sum += (0.7 * fifthCredit[display]);
                credits += fifthCredit[display];
            } else {
                sum += (0.0 * fifthCredit[display]);
                credits += fifthCredit[display];
            }

            System.out.println();

            System.out.println("The total GPA is: " + (sum / credits));
            
        }
    }
    public static void Utility() {
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
       /*
   
   
   LIBRARY MODULE
   
   
   */
   
    static class Book {
    String title;
    String author;
    String isbn;
    boolean isIssued;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isIssued = false;
    }
}

   // storage for up to 100 books
   static Book[] libBooks = new Book[100];
   static int libCount = 0;

   public static void LibraryModule(Scanner sc) {
       int choice = 0;
       do {
           System.out.println("\n===== Library Module =====");
           System.out.println("1. Add Book");
           System.out.println("2. Search Book (by title or ISBN)");
           System.out.println("3. Issue Book (by ISBN)");
           System.out.println("4. Return Book (by ISBN)");
           System.out.println("5. Display Available Books");
           System.out.println("6. Back to Main Menu");
           System.out.print("Enter your choice: ");
   
           try {
               choice = sc.nextInt();
               sc.nextLine(); // clear newline
   
               if (choice == 1) {
                   libAdd(sc);
               } else if (choice == 2) {
                   libSearch(sc);
               } else if (choice == 3) {
                   libIssue(sc);
               } else if (choice == 4) {
                   libReturn(sc);
               } else if (choice == 5) {
                   libDisplayAvailable();
               } else if (choice == 6) {
                   System.out.println("Returning to Main Menu...");
               } else {
                   System.out.println("Invalid choice. Try again.");
               }
           } catch (InputMismatchException e) {
               System.out.println("Please enter a number 1-6.");
               sc.nextLine(); // clear bad input
           }
       } while (choice != 6);
   }
   
   private static void libAdd(Scanner sc) {
       if (libCount >= libBooks.length) {
           System.out.println("Library is full. Cannot add more books.");
           return;
       }
       System.out.print("Enter book title: ");
       String title = sc.nextLine();
       System.out.print("Enter author name: ");
       String author = sc.nextLine();
       System.out.print("Enter ISBN: ");
       String isbn = sc.nextLine();
   
       libBooks[libCount] = new Book(title, author, isbn);
       libCount++;
       System.out.println("Book added successfully!");
   }
   
   private static void libSearch(Scanner sc) {
       System.out.print("Enter title or ISBN to search: ");
       String key = sc.nextLine().toLowerCase();
       boolean found = false;
   
       for (int i = 0; i < libCount; i++) {
           Book b = libBooks[i];
           if (b.title.toLowerCase().contains(key) || b.isbn.equalsIgnoreCase(key)) {
               System.out.println("Title: " + b.title + " | Author: " + b.author +
                                  " | ISBN: " + b.isbn + " | Status: " + (b.isIssued ? "Issued" : "Available"));
               found = true;
           }
       }
       if (!found) System.out.println("No matching book found.");
   }
   
   private static void libIssue(Scanner sc) {
       System.out.print("Enter ISBN to issue: ");
       String isbn = sc.nextLine();
       for (int i = 0; i < libCount; i++) {
           if (libBooks[i].isbn.equalsIgnoreCase(isbn)) {
               if (libBooks[i].isIssued) {
                   System.out.println("Book already issued.");
               } else {
                   libBooks[i].isIssued = true;
                   System.out.println("Book issued successfully!");
               }
               return;
           }
       }
       System.out.println("Book not found.");
   }
   
   private static void libReturn(Scanner sc) {
       System.out.print("Enter ISBN to return: ");
       String isbn = sc.nextLine();
       for (int i = 0; i < libCount; i++) {
           if (libBooks[i].isbn.equalsIgnoreCase(isbn)) {
               if (!libBooks[i].isIssued) {
                   System.out.println("Book was not issued.");
               } else {
                   libBooks[i].isIssued = false;
                   System.out.println("Book returned successfully!");
               }
               return;
           }
       }
       System.out.println("Book not found.");
   }
   
   private static void libDisplayAvailable() {
       System.out.println("\nAvailable Books:");
       boolean any = false;
       for (int i = 0; i < libCount; i++) {
           if (!libBooks[i].isIssued) {
               Book b = libBooks[i];
               System.out.println("Title: " + b.title + " | Author: " + b.author + " | ISBN: " + b.isbn);
               any = true;
           }
       }
       if (!any) System.out.println("No available books in the library.");
   }
   // ====== END LIBRARY MODULE =====

    /*

    MAIN MODULE

    */


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userModule = "";
        boolean response = true;

        // Student Arrays
        int arrayLength = 10;
        String[] firstNameArray = new String[arrayLength];
        String[] lastNameArray = new String[arrayLength];
        String[] firstClassArray = new String[arrayLength];
        String[] firstGrade = new String[arrayLength];
        int[] firstCredit = new int[arrayLength];
        String[] secondClassArray = new String[arrayLength];
        String[] secondGrade = new String[arrayLength];
        int[] secondCredit = new int[arrayLength];
        String[] thirdClassArray = new String[arrayLength];
        String[] thirdGrade = new String[arrayLength];
        int[] thirdCredit = new int[arrayLength];
        String[] fourthClassArray = new String[arrayLength];
        String[] fourthGrade = new String[arrayLength];
        int[] fourthCredit = new int[arrayLength];
        String[] fifthClassArray = new String[arrayLength];
        String[] fifthGrade = new String[arrayLength];
        int[] fifthCredit = new int[arrayLength];

        //Asks the user to choose which module they want
        while (response){
            System.out.println("Choose which area you want to search");
            System.out.println("   Students");
            System.out.println("   Course/Faculty");
            System.out.println("   Library");
            System.out.println("   Utility Tools");
            
            //Reads user input and allows it to be read better by the code
            userModule = scnr.nextLine();
            userModule = userModule.toLowerCase();
            System.out.println();

            //If else deciding which module to go to

            // Student module
            if(((userModule.compareTo("students") == 0) || ((userModule.compareTo("student") == 0)))) {
                StudentModule(arrayLength, firstNameArray, lastNameArray, firstClassArray, firstGrade, firstCredit, secondClassArray, secondGrade, secondCredit, thirdClassArray, thirdGrade, thirdCredit, fourthClassArray, fourthGrade, fourthCredit, fifthClassArray, fifthGrade, fifthCredit, scnr);
            }
            // Course module
            else if ((userModule.compareTo("Course/Faculty") == 0) || (userModule.compareTo("course/faculty") == 0)) {
                CourseFacultyModule module = new CourseFacultyModule();
                module.showMenu();
            }
            // Utility module
            else if ((userModule.compareTo("Utility Tools") == 0) || (userModule.compareTo("utility tools") == 0)) {
                Utility();
            }
            // Library module
            else if ((userModule.compareTo("Library") == 0) || ((userModule.compareTo("library") == 0))) {
               LibraryModule(scnr);
            }
            // Exit
            else if (userModule.equals("-1")) {
               response = false;
            }
            // Retry module
            else {
               System.out.println("That is not a valid response. Try again");
               System.out.println();
            }
        }
    }
    
}
