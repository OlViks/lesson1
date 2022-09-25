package pro.sky.java.course1.cycle.lesson1.lesson2;

    public class cycle {
    public static void main(String[] args) {
        //Задание 2.1
        int save = 15000;
        int accumulation = 0;
        int b = 1;
        while (accumulation < 2_459_000) {
            accumulation = accumulation + accumulation / 100;
            accumulation = save + accumulation;
            System.out.println("Месяц " + b + " сумма накоплений равна " + accumulation);
            b++;
        }
        //Задание 2.2
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Задание 2.3
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int sum = fertility - mortality;
        for (int i = 1; i <= 10; i++) {
            population += population * sum / 1000;
        }
        System.out.println(population);
        //Задание 2.4
        int piggyBank = 15000;
        int month = 1;
        while (piggyBank < 12_000_000) {
            piggyBank += piggyBank * 0.07;
            System.out.println("Месяц " + month + " сумма накоплений равна " + piggyBank);
            month++;
        }
        //Задание 2.5
        int total = 15000;
        for (int i = 1; total < 12_000_000; i++) {
            total += total * 0.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total);
            }
        }
        //Задание 2.6
        int sum1 = 15000;
        for (int i = 1; i > 0; i++) {
            sum1 += sum1 * 0.07;
            if (i % 6 == 0 && i <= 108) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + sum1);
            }
        }
        //Задание 2.7
        int month1 = 31;
        int fridayMonth = 2;
        while (fridayMonth <= month1) {
            System.out.println("Сегодня пятница, " + fridayMonth + "-е число. Необходимо подготовить отчет.");
            fridayMonth += 7;
        }
        //Задание 2.8
        int year = 2022;
        int startYear = year - 200;
        int endYear = year + 100;
        for (int i = startYear; i <= endYear; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
        //Задание 2.9
        for (int i=1;i<=10;i++) {
            System.out.println("2*" + i + "=" + 2 * i);
        }
    }
}

