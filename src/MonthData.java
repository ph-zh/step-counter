import java.util.Random;

public class MonthData {
int[] days = new int[30];
Random random = new Random();

    void printDaysAndStepsFromMonth(int[] days) {
        for (int i = 0; i < days.length; i++) {
// Вывод элементов массива в необходимом формате
            int step = random.nextInt(100);
            System.out.println((i + 1) + " day: " + step);
        }
    }

    int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
// подсчёт суммы элементов массива days[]
        }
        return sumSteps;
    }

    int maxSteps() {
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
// поиск максимального элемента
        }
        return maxSteps;
    }

    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
// поиск максимальной серии
        }
        return finalSeries;
    }
}