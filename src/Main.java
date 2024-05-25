import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and Thank you for using 'Happy Hippo'" + " 🦛☄️ " + "step counter application!");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1 ) {
                System.out.println("Lala");
            } else if (command == 2) {
                System.out.println("Tutu");
            } else if (command == 3) {
                System.out.println("Chacha");
            } else if (command == 0){
                System.out.println("Exit");
                scanner.close();
                break;
            } else {
                System.out.println("Following command was not found");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - ввести количество шагов за определённый день");
        System.out.println("2 - изменить цель по количеству шагов в день");
        System.out.println("3 - напечатать статистику за определённый месяц");
        System.out.println("0 - Exit");
    }
}