import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and thank you for using 'Happy Hippo'" + " 🦛☄️ " + "step counter application!");
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        MonthData monthData = new MonthData();
        Converter converter = new Converter();

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1 ) {
                /*
 1/ Ввод пройденного количества шагов за день
- Запрашивать номер месяца, день и количество шагов, сохранять количество шагов в соответствующую переменную.
- Чтобы понять, за какой день стоит ввести количество шагов, необходимо также запросить месяц и день.
                 */
                System.out.println("Выполняется команда " + command);
                stepTracker.addNewNumberStepsPerDay();
            } else if (command == 2) {
                /*
4/ Ввод цели по количеству шагов в день
- Записывать число в отдельную переменную, использовать её при подсчёте статистики.
- Цель общая на всё приложение, её нужно где-то хранить.
                 */
                System.out.println("Выполняется команда " + command);
            } else if (command == 3) {
                /*
3/ Вывод статистики за определённый месяц
- Запрашивать номер месяца, считать для него данные для статистики, выводить эти данные на экран.
- Чтобы понять, за какой месяц посчитать статистику, необходимо запросить месяц.
                 */
                System.out.println("Выполняется команда " + command);
                monthData.printDaysAndStepsFromMonth();
            } else if (command == 0){
                System.out.println("Exit");
                scanner.close();
                break;
            } else {
                System.out.println("Following command was not found");
            }
        }
    }

    static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - ввести количество шагов за определённый день");
        System.out.println("2 - изменить цель по количеству шагов в день");
        System.out.println("3 - напечатать статистику за определённый месяц");
        System.out.println("0 - Exit");
    }
}