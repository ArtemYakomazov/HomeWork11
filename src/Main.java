//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void chekVersionOSAndYear(int clientOS, int currentYear) {
        if (clientOS == 0 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void sumDeliveryDays(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day = day + 1;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day = day + 2;
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
            return;
        }
        System.out.println("Потребуется дней: " + day);
    }

    public static void main(String[] args) {
        System.out.println("Task 1");
        task1();
        System.out.println("Task 2");
        task2();
        System.out.println("Task 3");
        task3();
    }

    public static void task1() {
        checkLeapYear(2004);
    }

    public static void task2() {
        chekVersionOSAndYear(0, 2014);
    }

    public static void task3() {
        sumDeliveryDays(95);
    }
}