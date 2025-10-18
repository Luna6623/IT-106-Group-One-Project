import java.util.Scanner;

public class GroupProject {

    public static void StudentModule(Scanner scnr) {
        // Initial user input to choose a task
        String userChoice;

        // Student records arrays
        int arrayLength = 1;
        String[] firstNameArray = new String[arrayLength];
        String[] lastNameArray = new String[arrayLength];
        String[] firstClassArray = new String[arrayLength];
        int[] firstGrade = new int[arrayLength];
        String[] secondClassArray = new String[arrayLength];
        int[] secondGrade = new int[arrayLength];
        String[] thirdClassArray = new String[arrayLength];
        int[] thirdClassGrade = new int[arrayLength];
        String[] fourthClassArray = new String[arrayLength];
        int[] fourthClassGrade = new int[arrayLength];
        String[] fifthClassArray = new String[arrayLength];
        int[] fifthClassGrade = new int[arrayLength];

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
        if((userChoice.compareTo("add student records") == 0) || (userChoice.compareTo("add student record") == 0) || (userChoice.compareTo("add student") == 0)) {
            AddStudents(firstNameArray, lastNameArray, firstClassArray, firstGrade, secondClassArray, secondGrade, thirdClassArray, thirdClassGrade, fourthClassArray, fourthClassGrade, fifthClassArray, fifthClassGrade, arrayLength, scnr);
        }

        System.out.println(firstNameArray);
    }

    // Add students task under student module
    public static void AddStudents(String[] firstNameArray, String[] lastNameArray, String[] firstClassArray, int[] firstGrade, String[] secondClassArray, int[] secondGrade, String[] thirdClassArray, int[] thirdGrade, String[] fourthClassArray, int[] fourthGrade, String[] fifthClassArray, int[] fifthGrade, int arrayLength, Scanner scnr) {

        int amountInputs;

        System.out.print("How many records to you want to input? ");
        amountInputs = scnr.nextInt();

        for (int i = 0; i < amountInputs; i++) {
            System.out.print("Enter the student's first name: ");
            firstNameArray[arrayLength - 1] = scnr.next();
            System.out.println();

            System.out.print("Enter the student's last name: ");
            lastNameArray[arrayLength - 1] = scnr.next();
            System.out.println();

            System.out.print("Enter the student's first class: ");
            firstClassArray[arrayLength - 1] = scnr.next();
            System.out.println();

            System.out.println("Enter the student's first class's grade: ");
            firstGrade[arrayLength - 1] = scnr.nextInt();
            System.out.println();

            System.out.println("Enter the student's second class: ");
            secondClassArray[arrayLength - 1] = scnr.next();
            System.out.println();

            System.out.println("Enter the student's second class's grade: ");
            secondGrade[arrayLength - 1] = scnr.nextInt();
            System.out.println();

            System.out.println("Enter the student's third class: ");
            thirdClassArray[arrayLength - 1] = scnr.next();
            System.out.println();

            System.out.println("Enter the student's third class's grade: ");
            thirdGrade[arrayLength - 1] = scnr.nextInt();
            System.out.println();

            System.out.println("Enter the student's fourth class: ");
            fourthClassArray[arrayLength - 1] = scnr.next();
            System.out.println();

            System.out.println("Enter the student's fourth class's grade: ");
            fourthGrade[arrayLength - 1] = scnr.nextInt();
            System.out.println();

            System.out.println("Enter the student's fifth class: ");
            fifthClassArray[arrayLength - 1] = scnr.next();
            System.out.println();

            System.out.println("Enter the student's fifth class's grade: ");
            fifthGrade[arrayLength - 1] = scnr.nextInt();
            System.out.println();

            arrayLength = arrayLength + 1;
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userModule;

        //Asks the user to choose which module they want
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
        if(((userModule.compareTo("students") == 0) || ((userModule.compareTo("student") == 0)))) {
            StudentModule(scnr);
        }
    }
    
}
