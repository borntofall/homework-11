import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        leapYear(1204);

        suggestAppVersion(0, 2024);

        calculateDeliveryDays(70);

    }

    public static void leapYear(int year) {
        if ((year > 1582 && year % 400 == 0) || (year > 1582 && year % 4 == 0 && year % 100 != 0)) {
            System.out.printf("%d год является високосным \n", year);
        } else {
            System.out.printf("%d год не является високосным \n", year);
        }
    }

    public static void suggestAppVersion(int type, int year) {
        int currentYear = LocalDate.now().getYear();
        if (type == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (type == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        if (type == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (type == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int calculateDeliveryDays(int distance) {
        int deliveryDays = 1;
        if (distance < 20) {
            System.out.printf("Потребуется дней на доставку: %s\n", deliveryDays);
        }
        if (distance >= 20 && distance < 60){
            deliveryDays += 1;
            System.out.printf("Потребуется дней на доставку: %s\n", deliveryDays);
        }
        if (distance >= 60 && distance < 100) {
            deliveryDays += 2;
            System.out.printf("Потребуется дней на доставку : %s\n", deliveryDays);
        }
        if (distance >= 100) {
            System.out.println("Свыше 100 км доставки нет");
        }
        return deliveryDays;
    }
}
