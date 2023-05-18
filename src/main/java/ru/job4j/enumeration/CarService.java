package ru.job4j.enumeration;

import static ru.job4j.enumeration.Status.*;

public class CarService {
    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = WAITING;
        System.out.println("Статус Toyota: " + toyota);
        System.out.println("Статус Volvo: " + volvo);
        Order order = new Order(1, "Mercedes", IN_WORK);
        System.out.println("Заказ-наряд №" + order.getNumber()
                + " на автомобиль " + order.getCar()
                + ", статус ремонта: " + order.getStatus().getInfo()
                + ", подробности: " + order.getStatus().getMessage());
        Status[] statuses = Status.values();
        for (Status s : statuses) {
            switch (s) {
                case ACCEPTED:
                    System.out.println("Статус: Автомобиль принят на СТО");
                    break;
                case IN_WORK:
                    System.out.println("Статус: Автомобиль в работе");
                    break;
                case WAITING:
                    System.out.println("Статус: Автомобиль ожидает запчасти");
                    break;
                case FINISHED:
                    System.out.println("Статус: Все работы завершены");
                    break;
                default:
            }
            System.out.println("Название статуса: " + s.name() + ", Порядковый номер статуса: " + s.ordinal());

        }

    }
}
