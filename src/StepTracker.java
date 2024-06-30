import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int[] days = new int[30];
    Converter converter = new Converter();
    int steps = 10000;
    int bestStreak = 0;

    void addNewNumberStepsPerDay(Scanner scanner, int[] days) {
        System.out.println("Enter the month number");
        int month = scanner.nextInt();
        System.out.println("You entered the following month: " + month);
        if (month <= monthToData.length && month > 0) {
            System.out.println("Enter the day from 1 to 30 (inclusive)");
            int day = scanner.nextInt();
            System.out.println("You entered the following day: " + day);
            if (day <= days.length && day > 0) {
                System.out.println("Enter the number of steps");
                steps = scanner.nextInt();
                System.out.println("You entered the following steps: " + steps);
                if (steps > 0) {
                    days[day - 1] = days[day - 1] + steps;
                    System.out.println("Value saved! Your steps: " + days[day - 1]);

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

    void printDaysAndStepsFromDay() {
        for(int i = 0; i < days.length; i++) {
            System.out.println((i + 1) + " day: " + days[i]);
        }
    }

    void changeStepGoal(int goalByStepsPerDay) {
        goalByStepsPerDay = scanner.nextInt();
    }

    void showBestStreak() {
        for (int i = 0; i < days.length; i++) {
            if (days[i] > bestStreak) {
                bestStreak = days[i];
            }
        }
    }

    void printStatistics() {
        System.out.println("Number of steps taken per day: " + steps);
        System.out.println("Total number of steps for the month: " + 2);
        System.out.println("Maximum number of steps taken in a month: " + 3);
        System.out.println("Average number of steps: " + 4);
        System.out.println("Distance covered (in km): " + converter.convertToKm(steps));
        System.out.println("Number of kilocalories burned: " + converter.convertStepsToKilocalories(steps));
        System.out.println("Best streak: " + bestStreak);
    }
}