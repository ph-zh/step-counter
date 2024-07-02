import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    Converter converter = new Converter();
    int goalByStepsPerDay = 10000;
    int steps;

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Enter the month number");
        int month = scanner.nextInt();
        System.out.println("You entered the following month: " + month);
        if (month <= monthToData.length && month > 0) {
            System.out.println("Enter the day from 1 to 30 (inclusive)");
            int day = scanner.nextInt();
            System.out.println("You entered the following day: " + day);
            if (day <= monthToData[month - 1].days.length && day > 0) {
                System.out.println("Enter the number of steps");
                int steps = scanner.nextInt();
                System.out.println("You entered the following steps: " + steps);
                if (steps > 0) {
                    int currentSteps = monthToData[month - 1].days[day - 1];
                    monthToData[month - 1].days[day - 1] = currentSteps + steps;
                    System.out.println("Value saved! Your steps: " + monthToData[month - 1].days[day - 1]);
                } else {
                    System.out.println("The number of steps must be a positive number greater than zero");
                }
            } else {
                System.out.println("The day number must be from 1 to 30 inclusive");
            }
        } else {
            System.out.println("The month number must be from 1 to 12 inclusive");
        }
    }

    void changeStepGoal() {
        System.out.println("daily goal is " + goalByStepsPerDay);
        System.out.println("change your daily");
        int goal = scanner.nextInt();
        goalByStepsPerDay = goal;
        System.out.println("your new goal is " + goalByStepsPerDay);
    }

    void printStatistics() {
        System.out.println("Number of steps taken per day: " + steps);
        System.out.println("Total number of steps for the month XXX ");
        System.out.println("Maximum number of steps taken in a month: YYY");
        System.out.println("Average number of steps: ZZZ");
        System.out.println("Distance covered (in km): " + converter.convertToKm(steps));
        System.out.println("Number of kilocalories burned: " + converter.convertStepsToKilocalories(steps));
        System.out.println("Best streak: VVV");
    }
}