//public class Main {
    /*
    План занятия:
    1) Знакомство с примитивными типами
    2) Знакомство с операторами вывода

    Заметки
    Имя файла должно соответствовать имени класса
    {} указывают зону видимости.
    В Java есть два вида переменных примитивные и ссылочные
    Стандарт IEEE 754 - стандарт для выделения памяти на численные типы, предусматривающий выделение 32, 64 и 80 бит на
    целые и вещественные числа.
    Для вычислений с большим объемом памяти в Java существуют специальные классы.
    + - перегруженный оператор в Java, дает возможность выводить несколько значений на консоль в одном операторе
    По конвенции Java в строке не должно быть более 80 символов, поэтому длинные строки принято переносить

    Метод main - точка входа в java, т.е. отсюда начинается исполнение программы.
    Примитивные типы
    В Java их 8

    Типы для целых чисел:
    long                 - 64 бита
    int                  - 32 бита
    short                - 16 бит
    byte                 - 8 бит
    Типы для вещественных чисел(дробных):
    double               - 64
    float                - 32
    Символьный тип:
    char                - 32 бита
    Логический тип:
    boolean             - 1 бит


    Для вывода информации в Java существует специальный класс System.
    Запомним такую конструкциюЖ
    System.out. далее интересующий нас оператор
    System.out.print() - выводит последовательно в одну строку
    System.out.println() - Вывести и перейти на новую строку
    int a - декларация;
    a = 1000 - инициализация;
    " " - строка
    '' - символ
    \n - новая строка(new), переводит вывод на новую строку
    System.out.printf("", ) - форматированный вывод, т.е. в кавычках указывается тип числа и количество позиций для
    его вывода

    */



//    public static void main(String[] args) {
//        int a = 1000; //объявляем(диклорируем) переменную и инициализируем(присваиваем значение)
//        System.out.print(a); //выводим переменную без перевода строки
//
//        long b = 1000000000l;
//        System.out.println(); // переводим строку
//
//        //System.out.print(a + " " + b + "/n"); // использую print для нескольких переменных
//
//        double c = 15.4;
//
//        System.out.println(a + " " + b + " " + c);
//
//        float d = 13.4f;
//
//        char e = 'f';
//
//        boolean f = true;
//
//        System.out.printf("%d %5.3f %5c %5b", a,c,e,f );
//        } }
//__________________________________________________________







public class Main {


    public static void main(String[] args) {

    int a = 4444;
    long b = 2000000l;
    short c = 30000;
    byte d = 120;
    double e = 5.5;
    float f = 6.6F;
    char g = 't';
    boolean h = true;
        System.out.println(a + " " + b + " " + c + " " + d + " "+ e + " " + f + " " + g + " " + h );

    }

}