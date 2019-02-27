public class MyFirstProgramm {
    public static void main (String[] args){
        /*Вызов метода*/
        partonePDP();
        calcSum(20, 60);

        /*Создание объекта Square*/
        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной "+s.l+" "+"равна "+area(s));
        /*Создание объекта Rectangle*/
        Rectangle r = new Rectangle();
        r.a=4;/*Атрибуты объекта*/
        r.b=7;
        System.out.println("Площадь прямоугольника со сторонами "+r.a+" и "+r.b+" "+"равна "+area(r) );


    }
    /*Создание метода*/
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
    /*Создание метода с параметрами*/
    static void calcSum(int a, int b)/*аргументы метода*/{
        int sum=a+b;
        System.out.println(sum);

    }
    /*Создание метода с параметрами и возвратом данных*/
    static double area (Square s){
        return s.l*s.l;
    }
    /*Создание метода с параметрами и возвратом данных и демонстрацией области действия переменных и имени метода*/
    static  double area (Rectangle r){
        return r.a*r.b;

    }

}
