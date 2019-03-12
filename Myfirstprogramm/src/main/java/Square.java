/*Создание класса с описанием структуры объекта Square*/
class Square {
    /*Атрибуты объекта*/
    private double l;
    /*Конструктор*/
    Square(double l) {
        this.l = l;
        //this.info();
        this.area();
    }
    /*Геттер*/
    double getL() {
        return this.l;
    }

    void info() {
        System.out.println("Сторона квадратnа изменена на : " + getL());
    }
    /*Сеттер*/
    void setL(double l) {
        this.l = l;
    }
    double area (){
        return this.l*this.l;
    }
}

