public class MyFirstProgramm {
    public static void main (String[] args){
        partonePDP();
        calcSum(20, 60);

        double len=5;
        System.out.println("Площадь квадрата со стороной "+len+" "+"равна "+area(len) );

        double a=4;
        double b=7;
        System.out.println("Площадь прямоугольника со сторонами "+a+" и "+b+" "+"равна "+area(a,b) );


    }
    /*Создание функции*/
    static void partonePDP() {
        /*Пример вывода строк и простейших арифметических действий*/
        System.out.println("Hello World!!!!");
        System.out.println(2+2);
        // Пример экранирования // System.out.println(2-2);
        System.out.println(2/2);
        System.out.println(2*2);
        System.out.println(1/2);

        /*Числа с плавающей строкой*/
        System.out.println(2.0/5);

        /*Конкатенация*/
        System.out.println("Мой рост: " + 174 + " см");

        /*Работа с переменными*/
        int f = 2;
        double a = 10.22;
        double b = 20;
        String c = "Площадь комнаты ";
        String d = "Метров кв";
        System.out.println( c+(a*b)+" "+d+f);

    }
    /*Создание функции с параметрами*/
    static void calcSum(int a, int b){
        int sum=a+b;
        System.out.println(sum);

    }
    /*Создание функции с параметрами и возвратом данных*/
    static double area (double l){
        return l*l;
    }
    /*Создание функции с параметрами и возвратом данных и демонстрацией области действия переменных и имени функции*/
    static  double area (double a, double b){
        return a*b;

    }

}
