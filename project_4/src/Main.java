public class Main {
    /*
    Теория
    Приведение типов - преобразование одного типа данных в другой.
    АТД(абстрактный тип данных) - данные обладающие определенной характеристикой(int, double, String, Car(свой тип данных),
    Human(свой тип данных) и т.д.);
    Для приведения типа необходимо указать тип, к которому приводим в скобочках перед приводимым типом, например:
    int i = (int)12.4;

    Существует явное и неявное приведение:
    Явное приведение - требует участия программиста, выше показан пример явного приведения
    Неявное приведение делает автоматически системой

    Переполнение типа - помещение в переменную значения превышающего память этой переменной, в Java справоцирует выход
    за границы числа - получится ситуация: сложили 2 положительных числа, на выходе отрицательное.



     */


    public static void main(String[] args) {
        //деклорация переменных:
        int a;
        double d;
        // пример явного приведения:
        //инициализация переменных:
        d = 15.7;
        a = (int) d;

        System.out.println(a);

        //пример неявного приведения типов:
        a = 17;
        d = a;

        System.out.println(d);

        //-----Задача: привести явное и неявное приведение:-----

        //явное приведение:
        byte b;
        double c;
        c = 20.9;
        b = (byte) c;
        System.out.println(b);

        //неявное приведение:
        b = 5;
        c = b;
        System.out.println(c);

        //-----Задача: привести явное и неявное приведение:-----

        char s;
        int t;

        t = 325;
        s = (char) t;

        System.out.println(s);

        s = '$';
        t = s;
        System.out.println(t);

        //-------------------------
        //_________________________
        //______________Переполнение типа :______________

        //Переполнение типа int:

        int i = 2000000000 + 1000000000;
        int e = 2000000000;
        int y = 1000000000;
        i = e + y;
        System.out.println(i);

        // явное приведение типа данных int к long:
        long l = (long) e + (long) y;
        System.out.println(l);

        // явное приведение типа данных int к string:

        String str;
        str = "" + i;

        System.out.println(str);

        //определения типа данных:
        System.out.println(str.getClass());

        //обнуление переменной типа string:
        str = "";

        //присвоение значения переменной String:
        str = "Привет";

        //способы объединения переменных:
        //1ый способ:
        str += " Пока";
        //2ой способ:
        str = str + " Я очень далека";

        System.out.println(str);

        //упарвление строками при помощи специальных методов:

        //перевод всех букв в верхний регистр:
        System.out.println(str.toUpperCase());
        //перевод всех букв в нижний регистр:
        System.out.println(str.toLowerCase());

        //добавить пробелы:
        str = "  " + str + "  ";
        System.out.println(str);

        //убрать пробелы в начале и в конце:
        System.out.println(str.trim());

        //длина строки:
        System.out.println(str.length());

        //выводим подстроку с указанного индекса:
        String subStr = str.substring(8);
        System.out.println(subStr);

        //выводим подстроку из указанного диапозона:
        subStr = str.substring(8, 13);
        System.out.println(subStr);

        //получить символ по его позиции в строке:
        System.out.println(str.charAt(14));

        // Для тех кто знает циклы показываю разбор строки на символы.
        //циклы:
        for (int j = 0; j < str.length(); j++ ){
            System.out.println(str.charAt(j));
        }

        // Для тех кто знает циклы показываю разбор строки на символы.
        for (int j = 0; j < str.length(); j++ ){
            if(str.charAt(j) == 'Я' || str.charAt(j) == 'я' ){   // Для тех кто знаком с условными операторы
                System.out.println(str.charAt(j));
            }
        }

        //Замена символа:
        System.out.println(str.replace('Я', 'я'));
        System.out.println(str.replace('а', ' '));



        Car car = new Car(3);
        car.printA();
        car.printAB();
        System.out.println(car.sum());

    /*_________________HW_______________

    1) Работа со String
    2) Продемонстировать явное и неявное приведение типов
    3) Показать переполнение
    4*) Показать работу с методами и классами
    5**) Сделать реверс строки

    */


    }


}