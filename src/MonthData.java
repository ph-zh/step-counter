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
/*
**Шаг 9**

Реализуйте подсчёт статистики за месяц. В неё должны входить следующие пункты.
количество пройденных шагов по дням в формате:
1 день: 3000
2 день: 2000
...
30 день: 10000

общее количество шагов за месяц;
максимальное количество шагов в месяце;
лучшая серия: максимальное количество подряд идущих дней, в течение которых количество шагов за день было равно или выше целевого.
Для этого в классе MonthData создайте следующие методы:

void printDaysAndStepsFromMonth(): вывод на экран элементов массива в необходимом формате.
Не забывайте, что индексы в массиве начинаются с нуля, а дни — с единицы.

**Подсказка: как должен выглядеть код**

void printDaysAndStepsFromMonth() {
for (int i = 0; i < days.length; i++) {
// Вывод элементов массива в необходимом формате
}
}

int sumStepsFromMonth(): подсчёт суммы шагов за месяц. Метод должен возвращать сумму элементов массива days[].

**Подсказка: как должен выглядеть код**
int sumStepsFromMonth() {
int sumSteps = 0;
for (int i = 0; i < days.length; i++) {
// подсчёт суммы элементов массива days[]
}
return sumSteps;
}

int maxSteps(): максимальное количество шагов за месяц. Метод должен возвращать максимальный элемент массива days[].

**Подсказка: как должен выглядеть код**
int maxSteps() {
int maxSteps = 0;
for (int i = 0; i < days.length; i++) {
// поиск максимального элемента
}
return maxSteps;
}

int bestSeries(int goalByStepsPerDay): поиск максимальной серии. Метод должен возвращать максимальное количество подряд идущих элементов days[],
больших или равных goalByStepsPerDay.

**Подсказка: как должен выглядеть код**
int bestSeries(int goalByStepsPerDay) {
int currentSeries = 0;
int finalSeries = 0;
for (int i = 0; i < days.length; i++) {
// поиск максимальной серии
}
return finalSeries;
}
 */