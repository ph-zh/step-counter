import java.util.Scanner;

public class MonthData {
    int[] days = new int[30];
    Scanner scanner = new Scanner(System.in);

    void printDaysAndStepsFromMonth() {
        for(int i = 0; i < days.length; i++) {
            System.out.println((i + 1) + " day: " + days[i]);
        }
    }

    int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
        }
        return sumSteps;
    }

    int maxSteps() {
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
        }
        return maxSteps;
    }

    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
        }
        return finalSeries;
    }
}