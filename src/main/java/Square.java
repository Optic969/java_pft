/*Создание класса с описанием структуры объекта Square*/
public class Square {
    /*Атрибуты объекта*/
    public double l;

    /*Конструктор*/
    public Square(double l) {
        this.l = l;
        this.info();
    }

    public double getL() {
        return this.l;
    }

    public void info() {
        System.out.println("Сторона квадрата изменена на : " + getL());
    }

    public void setL(double l) {
        this.l = l;
    }
}


