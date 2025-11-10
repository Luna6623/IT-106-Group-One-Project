package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;

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

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userModule = "";

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
        while (userModule.compareTo("-1") != 0){
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
            else if ((userModule.compareTo("Course/Faculty") == 0) || (userModule.compareTo("course/faculty") == 0)) {
                CourseFacultyModule module = new CourseFacultyModule();
                module.showMenu();
            }
            else if ((userModule.compareTo("Utility Tools") == 0) || (userModule.compareTo("utility tools") == 0)) {
                UtilityTools utilModule = new UtilityTools();
                utilModule.main();
        }
    }
    
}
