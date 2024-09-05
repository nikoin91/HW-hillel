package app;

/*
Є діапазон чисел від 1 до 6, включно. За допомогою циклу розрахуйте суму чисел наростаючим підсумком та загальну суму чисел. Виведення окремого пункту переліку чисел має бути пронумероване. Виведення має такий вигляд:

1) Num is 1, sum is 1
2) Num is 2, sum is 3
3) Num is 3, sum is 6
4) Num is 4, sum is 10
5) Num is 5, sum is 15
6) Num is 6, sum is 21
------------------------
Sum of numbers is 21
(1) Створіть окремий проект.

(2) В проекті створіть пакет app , де створіть клас Main .

(3) В класі Main реалізуйте функціонал розрахунку суми чисел.

(4) Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.
 */

public class Main {

    static int num;
    static int sum;

    public static void main(String[] args) {

        num = 1;

        while (num <= 6) {

            sum += num;

            System.out.println(num + ") Num is " + num + ", sum is " + sum);

            num++;
        }

    }
}