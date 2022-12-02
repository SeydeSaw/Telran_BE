import java.util.Scanner;

public class Main {

    //TODO
    // 1. Создать глобальную переменную Scanner (так же как в дз)
    // 2. Считать 3 значения из консоли в методе main
    // 3. Передать эти 3 значения в метод findMin(int a, int b, int c)
    // 4. Найти меньшее значение из 3
    // 5. Вернуть это значение
    // 6. В методе main вывести полученное значение в консоль
        //___________________________________
    //TODO
    // 1. Создать глобальную переменную Scanner (так же как в дз)
    // 2. Считать 3 значения из консоли в методе main
    // 3. Передать эти 3 значения в метод findMax(int e, int f, int g)
    // 4. Найти меньшее значение из 3
    // 5. Вернуть это значение
    // 6. В методе main вывести полученное значение в консоль

    // 1. Создать глобальную переменную Scanner (так же как в дз)
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        // 2. Считать 3 значения из консоли в методе main

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        //3. Передать эти 3 значения в метод findMin(int a, int b, int c)
        int d = findMin( a, b, c);

        //6. В методе main вывести полученное значение в консоль
        System.out.println(d);

        //___________________________
        // 2. Считать 3 значения из консоли в методе main
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int g = scanner.nextInt();

        //3. Передать эти 3 значения в метод findMax(int e, int f, int g)
        int h = findMax(e, f, g);
        //6. В методе main вывести полученное значение в консоль
        System.out.println(h);

    }

    static int findMin(int a, int b, int c) {
        // 4. Найти меньшее значение из 3
        if (a <= b && a <= c) {
            return a;  // 5. Вернуть это значение
        }
        else if (b <= c) {
            return b;  // 5. Вернуть это значение
        }
        else {
            return c;  // 5. Вернуть это значение
        }
    }

    //______________________________________
    static int findMax(int e, int f, int g) {
        // 4. Найти большее значение из 3
        if (e >= f && e >= g) {
            return e;  // 5. Вернуть это значение
        }
        else if (f >= g) {
            return f;  // 5. Вернуть это значение
        }
        else {
            return g;  // 5. Вернуть это значение
        }
    }
    //_________________________________________

    /*
    Этот способ подходит, если есть конкретно больше и меньше число и нет равных:
    static int findMin(int a, int b, int c) {

        if (a < b) {
            return a;
        }
        else if (b < c) {
            return b;
        }
        else if (c < a) {
            return c;
        }
        return c;
        }

     */
    //________________________________________


}