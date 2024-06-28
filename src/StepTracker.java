import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;
    Converter converter;

    StepTracker(Scanner scan, Converter convert) {
    scanner = scan;
    converter = convert;

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

    void printStatistics() {
        System.out.println("количество пройденных шагов по дням: " + 1);
        System.out.println("общее количество шагов за месяц: " + 2);
        System.out.println("максимальное пройденное количество шагов в месяце: " + 3);
        System.out.println("среднее количество шагов: " + 4);
        int steps = 10000;
        System.out.println("пройденная дистанция (в км): " + converter.convertToKm(steps));
        System.out.println("количество сожжённых килокалорий: " + converter.convertStepsToKilocalories(steps));
        System.out.println("лучшая серия: " + 7);
    }
}