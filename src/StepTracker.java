import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];

    StepTracker(Scanner scan) {
    scanner = scan;

    for (int i = 0; i < monthToData.length; i++) {
        monthToData[i] = new MonthData();
       }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();
        System.out.println("You put following month" + month);
        if (month <= 12 && month >= 0) {
            System.out.println("Введите день от 1 до 30 (включительно)");
            int day = scanner.nextInt();
            System.out.println("You put following day" + day);
            if (day <= 30 && day >= 0) {
                System.out.println("Введите количество шагов");
                int steps = scanner.nextInt();
                System.out.println("You put following steps" + steps);
                if (steps >= 0) {
                    System.out.println("CheckCheck");
                } else {
                    System.out.println("количество шагов должно быть положительным числом");
                }
            } else {
                System.out.println("номер вводимого дня должен быть от 1 до 30 включительно");
            }
        } else {
            System.out.println("номер вводимого месяца должен быть от 1 до 12 включительно");
        }
    }
    /*
В классе StepTracker реализуйте метод void addNewNumberStepsPerDay().
При вызове метода необходимо принимать с консоли номер месяца, номер дня и количество шагов.
Проверьте необходимые условия:
номер вводимого месяца должен быть от 1 до 12 включительно;
номер вводимого дня должен быть от 1 до 30 включительно;
количество шагов должно быть положительным числом.
Если какое-то условие не выполнено, необходимо вывести об этом сообщение на экран и завершить выполнение метода.
Если все условия выполнены необходимо сохранить полученные данные. Для этого из массива monthToData получите уже созданный
объект класса MonthData. Чтобы это сделать, нужно вычислить соответствующий индекс. Так как индексы в массиве начинаются с 0,
а номер месяца — с 1, то для вычисления индекса необходимо вычесть 1 от указанного номера месяца. Затем сохраните количество
шагов в массиве days, полученного объекта MonthData. Для этого также нужно будет вычислить индекс на основе номера дня.
В классе Main  добавьте создание экземпляра StepTracker в начало метода main(..) до бесконечного цикла с меню и вызов метода
addNewNumberStepsPerDay() при вводе соответствующей команды.

**Подсказка: как должен выглядеть код**

void addNewNumberStepsPerDay() {
System.out.println("Введите номер месяца");
// ввод и проверка номера месяца

    System.out.println("Введите день от 1 до 30 (включительно)");
    // ввод и проверка дня

    System.out.println("Введите количество шагов");
    // ввод и проверка количества шагов

    // Получение соответствующего объекта MonthData из массива
    MonthData monthData = ...
    // Сохранение полученных данных
    monthData.days[...] = ...
     */
}
