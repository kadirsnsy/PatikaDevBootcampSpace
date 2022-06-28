package dev.patika;

import java.awt.*;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Car car1= new Car(Model.HONDA,2021,5, LocalDate.of( 2014 , 2 , 11 ),0, Color.BLACK);
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println(car1.getPersonCount());
        System.out.println(car1.getProductionDate());
        System.out.println(car1.getYear());
        System.out.println(car1.getKilometer());
        System.out.println(car1.getColor());
    }
}
