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
    int stepLength = 75; // centimeter
    int stepMeter = 100; //1 meter = 100 centimeter
    int stepKm = 1000; // 1 km = 1000 meter
    int stepsToKilocalories = 40; // calories
    int kilocalorie = 1000; // 1 kilo = 1000 calories


    int convertToKm(int steps) {
        steps = steps * stepLength / stepMeter / stepKm;
        System.out.println(steps + " Km");
        return steps;
    }

    // converter method
    int convertStepsToKilocalories(int steps) {
        steps = steps * stepsToKilocalories / kilocalorie;
        System.out.println(steps + " Kilocalories");
        return steps;
    }
}