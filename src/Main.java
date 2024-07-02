import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and thank you for using 'StepBuddy Hippo'" + " 🦛☄️ " + "step counter application!");
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        MonthData monthData = new MonthData();
        int steps = 0;

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1 ) {
                System.out.println("Executing command " + command);
            } else if (command == 2) {
                System.out.println("Executing command " + command);
            } else if (command == 3) {
                System.out.println("Executing command " + command);
            } else if (command == 4) {
                System.out.println("checking staff");
                stepTracker.addNewNumberStepsPerDay(stepTracker.monthToData, monthData, steps);
            }
            else if (command == 0){
                System.out.println("Exit");
                scanner.close();
                break;
            } else {
                System.out.println("Following command was not found");
            }
        }
    }

    static void printMenu() {
        System.out.println("What would you like to do?");
        System.out.println("1 - Enter the number of steps for a specific day");
        System.out.println("2 - Change the daily step goal");
        System.out.println("3 - Print statistics for a specific month");
        System.out.println("4 - !! Check different methods !!");
        System.out.println("0 - Exit");
    }
}