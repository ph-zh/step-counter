import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;

    StepTracker(Scanner scan) {
    scanner = scan;

    for (int i = 0; i < monthToData.length; i++) {
        monthToData[i] = new MonthData();
       }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();
        System.out.println("You put following month: " + month);
        if (month <= monthToData.length && month > 0) {
            System.out.println("Введите день от 1 до 30 (включительно)");
            int day = scanner.nextInt();
            System.out.println("You put following day: " + day);
            if (day <= 30 && day > 0) {
                System.out.println("Введите количество шагов");
                int steps = scanner.nextInt();
                System.out.println("You put following steps: " + steps);
                if (steps > 0) {
                    System.out.println("CheckCheck");
                } else {
                    System.out.println("количество шагов должно быть положительным числом и больше нуля");
                }
            } else {
                System.out.println("номер вводимого дня должен быть от 1 до 30 включительно");
            }
        } else {
            System.out.println("номер вводимого месяца должен быть от 1 до 12 включительно");
        }
    }

    void changeStepGoal(int goalByStepsPerDay) {
        goalByStepsPerDay = scanner.nextInt();
    }
}
