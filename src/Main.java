public class Main {
     /*
    #1 Создать класс Car со следующими полями (String brand, String color, String licensePlate,
     MyDate registrationDate,Engine engine}.
     Оьратите внимание, поля registrationDate и engine - это тоже объект.
     Engine - содержмт информация о мощности двигателя и о типе (бензин, дизель, электро).

    Реализуйте метод toString в каждом классе.
    Реализуйте метод конструктор в каждом классе.
    Создайте два объекта автомобтля.
#2
В классе Engine добавте методы start и stop. Кадлый из них пусть выводит строку "Engine is started"
"Engine is stopped". В классе Car добавте методы drive и stop. Первый должке заводить двигатель и писать,
что такая то машина поехала. Второй, соответственно глушить двигатель и останавливать машину.

#3 ** Реализовать проверку, если машина уже едет, а я пытвюсь вызвать метод drive, должно появлятся
 сообщение, что машина уже едет.
     */
     public static void main(String[] args) {
               Car car1 = new Car("Toyota","black", "SB1333");
               MyDate production1 = new MyDate(2,5,2010);
               Engine engine1 = new Engine(100,"benzin");
               production1.day = 3;
               production1.month = 12;
               production1.year = 2010;






     }
}
