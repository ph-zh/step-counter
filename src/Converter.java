/*
В папке src проекта java-sprint1-hw создайте файл Converter.java.
В этом классе будет осуществляться преобразование шагов в километры и килокалории. При этом:
для подсчёта дистанции можно считать, что один шаг равен 75 см;
для подсчёта количества сожжённых килокалорий можно считать, что 1 шаг = 50 калорий, 1 килокалория = 1 000 калорий.
Создайте следующие методы:
int convertToKm(int steps): метод, переводящий количество шагов в километры;
int convertStepsToKilocalories(int steps): метод, переводящий количество шагов в килокалории.
💡 Поскольку числа, с которыми будет работать приложение, достаточно велики, можно использовать тип int и
целочисленную арифметику (например, деление без остатка).  Количество энергии измеряется в тысячах калорий,
а человек проходит в день в среднем несколько тысяч шагов, поэтому точность работы с вещественными значениями меньше
единицы в этом приложении не требуется.
 */

public class Converter {
    int steps = 10;
    int stepToDistance = 75; // cm
    int stepsToKilocalories = 50; // calories
    int kilocalorie = 1000; // 1 kilo = 1000 calories

    int convertToKm(int steps) {
        steps = stepToDistance / stepsToKilocalories;
        return steps;
    }

    int convertStepsToKilocalories(int steps) {
        steps = kilocalorie / stepsToKilocalories;
        return steps;
    }
}
