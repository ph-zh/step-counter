import java.util.Random;

public class MonthData {
    int[] days = new int[30];
    Random random = new Random();

    void printDaysAndStepsFromMonth() {
        for(int i = 0; i < days.length; i++) {
            days[i] = random.nextInt(100);
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