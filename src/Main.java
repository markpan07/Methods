import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkLeapYear(100);
        System.out.println();
        checkDevice(0, 2023);
        System.out.println();
        calculateDeliveryTime(400);
    }

    public static void checkLeapYear(int year) {
        System.out.println("Task 1");
        boolean itIsForthYear = (year % 4) == 0;
        boolean itIs400Year = (year % 400) == 0;
        boolean itIs100Year = (year % 100) == 0;


        if (itIsForthYear && !itIs100Year) {
            System.out.println(year + " год вискосный");
        } else if (itIs100Year && itIs400Year) {
            System.out.println(year + " год вискосный");
        } else {
            System.out.println(year + " год обычный");
        }
    }

    public static void checkDevice(int clientOS, int deviceProductionYear) {
        System.out.println("Task 2");

        int currentYear = LocalDate.now().getYear();
        switch (clientOS) {
            case 0:
                if (deviceProductionYear == currentYear) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (deviceProductionYear == currentYear) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
        }

    }

    public static void calculateDeliveryTime (int deliveryDistance) {
        System.out.println("Task 3");
        byte defaultDeliveryTime = 1;
        boolean distanceIsLess20km = deliveryDistance < 20;
        boolean distanceBetween20And60km = deliveryDistance >=20 && deliveryDistance < 60;
        boolean distanceBetween60And100km = deliveryDistance >=60 && deliveryDistance <= 100;


        if (distanceIsLess20km) {
            System.out.println("Доставка займет " + defaultDeliveryTime + " суток");
        } else if (distanceBetween20And60km) {
            System.out.println("Доставка займет " + (defaultDeliveryTime + 1) + " суток");
        } else if (distanceBetween60And100km) {
            System.out.println("Доставка займет " + (defaultDeliveryTime + 2) + " суток");
        } else {
            System.out.println("Доставки нет");
        }
    }
}
