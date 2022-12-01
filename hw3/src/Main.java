import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner((System.in));

    public static void main(String[] args) {


    // 1) Метод(процедура), которая будет считывать значения и выводить их на консоль:

        byte a ;

        System.out.println("Введите  число от - 128 до 128: ");
        a = scanner.nextByte();
        System.out.println(a);



        System.out.println("Сумма = " + sum());

    }

    //2) Метод(Функция), которая будет считывать 3 значения и возвращать их сумму
    public static double sum() {
        System.out.println("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.println("Введите второе число: ");
        double b = scanner.nextDouble();

        System.out.println("Введите третье число: ");
        double c = scanner.nextDouble();

        return a+b+c;
    }

}