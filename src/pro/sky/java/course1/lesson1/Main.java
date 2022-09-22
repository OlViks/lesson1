package pro.sky.java.course1.lesson1;
public class Main {
    public static void main(String[] args) {
        System.out.println("Циклы");

        //Задание 1.1
        for (int i = 1; i <= 10; i++) {
            System.out.println(+i);
        }

        //Задание 1.2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Задание 1.3
        for (int i = 2; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        //Задание 1.4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //Задание 1.5
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        //Задание 1.6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        //Задание 1.6
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        //Задание 1.7
        int save = 29000;
        int accumulation = 0;
        for (int i = 1; i <= 12; i++) {
            accumulation = accumulation + save;
            System.out.println("Месяц " + i + " сумма накоплений равна " + accumulation);
        }
        //Задание 1.8
        int save1 = 29000;
        int  accumulation1 = 0;
        for (int i = 1; i <= 12; i++) {
            accumulation1 = accumulation1 + accumulation1 / 100;
            accumulation1 = accumulation1 + save1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + accumulation1);
        }
    }
}