package app;

/*
Доходи оподатковуются за прогресивною шкалою оподаткування:

від 0 до 10000, включно, за ставкою 2,5%.
від 10000, виключно, до 25000, включно, за ставкою 4,3%.
більше 25000, за ставкою 6,7%.
Необхідно розрахувати суму податку від певної суми доходу. Сума податку дорівнює відсотку від суми доходу.

(1) Створіть окремий проект.

(2) В проекті створіть пакет app , де створіть клас Main .

(3) В класі Main реалізуйте функціонал розрахунку суми податку.

(4) Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.


 */

import java.util.Scanner;

public class Main {

    static  int taxes;
    static  float percentOfTax;



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please write your income here to calculate tax: ");

        taxes = sc.nextInt();

        if (taxes <= 10000) {
            percentOfTax = (float) (taxes * 2.5 / 100);
            System.out.printf("Your taxes is 2,5 percent: %.2f", percentOfTax);
        } else if (taxes <= 25000) {
            percentOfTax = (float) (taxes * 4.3 / 100);
            System.out.printf("Your taxes is 4,3 percent: %.2f", percentOfTax);
        }
        else {
            percentOfTax = (float) (taxes * 6.7 / 100);
            System.out.printf("Your taxes is 6,7 percent: %.2f", percentOfTax);
        }


    }
}