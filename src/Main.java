public class Main {
    public static void main(String[] args) {
        task1(100);
    }

    public static void task1 (int year) {
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
}