import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and thank you for using 'Happy Hippo'" + " 🦛☄️ " + "step counter application!");
        Scanner scanner = new Scanner(System.in);
        MonthData monthData = new MonthData();
        Converter converter = new Converter();
        StepTracker stepTracker = new StepTracker(scanner, converter);

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1 ) {
                System.out.println("Выполняется команда " + command);
                stepTracker.addNewNumberStepsPerDay();
            } else if (command == 2) {
                System.out.println("Выполняется команда " + command);
                stepTracker.printStatistics();
            } else if (command == 3) {
                System.out.println("Выполняется команда " + command);
                monthData.printDaysAndStepsFromMonth();
            } else if (command == 0){
                System.out.println("Exit");
                scanner.close();
                break;
            } else {
                System.out.println("Following command was not found");
            }
        }
    }

    static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - ввести количество шагов за определённый день");
        System.out.println("2 - изменить цель по количеству шагов в день");
        System.out.println("3 - напечатать статистику за определённый месяц");
        System.out.println("0 - Exit");
    }
}