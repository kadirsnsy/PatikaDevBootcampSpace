package dev.patika;

import java.awt.*;
import java.time.LocalDate;

public final class Car {
    private final Model model;
    private final  int year;
    private final int personCount;
    private final LocalDate productionDate;
    private final int kilometer;
    private final Color color;

    public Car(Model model, int year, int personCount, LocalDate productionDate, int kilometer, Color color) {
        this.model = model;
        this.year = year;
        this.personCount = personCount;
        this.productionDate = productionDate;
        this.kilometer = kilometer;
        this.color = color;
    }

    public Model getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPersonCount() {
        return personCount;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public int getKilometer() {
        return kilometer;
    }

    public Color getColor() {
        return color;
    }
}
