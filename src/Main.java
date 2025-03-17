public class Main {
    public static void main(String[] args) {
        // Задача 1: Накопление 2 459 000 рублей
        System.out.println("Задача 1:");

        int targetAmount = 2_459_000;
        int savings = 0;
        int monthlyDeposit = 15_000;
        int month = 0;

        while (savings < targetAmount) {
            month++;
            savings += monthlyDeposit;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей%n", month, savings);
        }
        System.out.println();

        // Задача 2: Вывод чисел от 1 до 10 и от 10 до 1
        System.out.println("Задача 2:");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println("\n");

        // Задача 3: Расчет численности населения через 10 лет
        System.out.println("Задача 3:");
        int population = 12_000_000;
        int birthRate = 17; // на 1000 человек
        int deathRate = 8;   // на 1000 человек

        for (int year = 1; year <= 10; year++) {
            population += (population / 1000) * (birthRate - deathRate);
            System.out.printf("Год %d, численность населения составляет %d%n", year, population);
        }
        System.out.println();

        // Задача 4: Накопление 12 миллионов рублей с ежемесячным процентом
        System.out.println("Задача 4:");
        double savingsVasily = 15_000;
        double targetVasily = 12_000_000;
        double monthlyInterest = 0.07;
        month = 0;

        while (savingsVasily < targetVasily) {
            month++;
            savingsVasily *= (1 + monthlyInterest);
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", month, savingsVasily);
        }
        System.out.println();

        // Задача 5: Вывод накоплений каждые 6 месяцев
        System.out.println("Задача 5:");
        savingsVasily = 15_000;
        month = 0;

        while (savingsVasily < targetVasily) {
            month++;
            savingsVasily *= (1 + monthlyInterest);
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", month, savingsVasily);
            }
        }
        System.out.println();

        // Задача 6: Накопления каждые полгода в течение 9 лет
        System.out.println("Задача 6:");
        savingsVasily = 15_000;
        int years = 9;
        int totalMonths = years * 12;

        for (month = 1; month <= totalMonths; month++) {
            savingsVasily *= (1 + monthlyInterest);
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", month, savingsVasily);
            }
        }
        System.out.println();

        // Задача 7: Напоминание о пятнице
        System.out.println("Задача 7:");
        int firstFriday = 3; // Первая пятница в месяце (например, 3-е число)
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет%n", day);
        }
        System.out.println();

        // Задача 8: Годы появления кометы
        System.out.println("Задача 8:");
        int currentYear = 2023;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;

        for (int year = startYear; year <= endYear; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}