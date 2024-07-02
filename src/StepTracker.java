import java.util.Scanner;

public class StepTracker {
    Scanner scanner = new Scanner(System.in);
    MonthData[] monthToData = new MonthData[12];
    Converter converter = new Converter();
    MonthData monthData = new MonthData();
    int steps;

    void addNewNumberStepsPerDay(MonthData[] monthToData, MonthData monthData, int steps) {
        System.out.println("Enter the month number");
        int month = scanner.nextInt();
        System.out.println("You entered the following month: " + month);
        if (month <= monthToData.length && month > 0) {
            System.out.println("Enter the day from 1 to 30 (inclusive)");
            int day = scanner.nextInt();
            System.out.println("You entered the following day: " + day);
            if (day <= monthData.days.length && day > 0) {
                System.out.println("Enter the number of steps");
                steps = scanner.nextInt();
                System.out.println("You entered the following steps: " + steps);
                if (steps > 0) {
                    monthData.days[day - 1] = monthData.days[day - 1] + steps;
                    System.out.println("Value saved! Your steps: " + monthData.days[day - 1]);
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