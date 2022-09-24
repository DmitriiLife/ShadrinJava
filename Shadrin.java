import java.util.Objects;
import java.util.Scanner;

public class Shadrin {
    public static void number() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число\n");
        while (!in.hasNextInt()) {
            System.out.println("\nВы ввели не число. Введите число\n");
            in.next();
        }
        int checkNumber = in.nextInt();
        if (checkNumber > 7) {
            System.out.print("\nПривет\n");
        } else {
            System.out.println("\nВы ввели число меньше\n");
        }
    }

    public static void name() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя \n");
        String checkName = in.nextLine();
        if (Objects.equals(checkName, "Вячеслав")) {
            System.out.println("\nПривет, Вячеслав");
        } else {
            System.out.println("\nНет такого имени\n");
        }
    }

    public static void array() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите числа через пробел\n");
        String checkStr = in.nextLine();
        String[] strArr = checkStr.split(" ");
        int[] numArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].matches("[-+]?\\d+")) {
                numArr[i] = Integer.parseInt(strArr[i]);
                if (numArr[i] % 3 == 0) {
                    System.out.println(numArr[i]);
                }
            }
        }
    }

    public static void taskSelection() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер задачи: \n");
        while (!in.hasNextInt()) {
            System.out.println("\nВы ввели не число. Повторите\n");
            in.next();
        }
        int taskNumber = in.nextInt();
        if (taskNumber == 1) {
            number();
        } else if (taskNumber == 2) {
            name();
        } else if (taskNumber == 3) {
            array();
        } else if (taskNumber == 0) {
            System.exit(0);
        } else {
            System.out.print("\nТакой задачи не существует\n");
        }
        System.out.println(tasksText());
        taskSelection();
    }

    public static String tasksText() {
        return "\n1) Составить алгоритм: если введенное число больше 7, то вывести “Привет”;\n" +
                "2) Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести \"Нет такого имени;\"\n" +
                "3) Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3;\n" +
                "0) Завершить приложение;\n";
    }

    public static void main(String[] args) {
        System.out.println(tasksText());
        taskSelection();
    }
}
