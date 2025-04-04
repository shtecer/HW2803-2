import java.time.LocalDate;

public class Main {

    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void DownloadApp(int clientDeviceYear, int phoneSystem) {
        if (phoneSystem == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else  {
            if (phoneSystem == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

        }

    }

    public static void calculateDeliveryDays(int deliveryDistance) {
        int count = 1;
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            count = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            count = 3;
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
            return;
        }
        System.out.println("Потребуется дней: " + count);
    }

    public static void main(String[] args) {
        int year = 2021;
        checkLeapYear(year);

        int phoneSystem = 1;
        int currentYear = LocalDate.now().getYear();
        DownloadApp(currentYear, phoneSystem);

        int deliveryDistance = 95;
        calculateDeliveryDays(deliveryDistance);

    }
}