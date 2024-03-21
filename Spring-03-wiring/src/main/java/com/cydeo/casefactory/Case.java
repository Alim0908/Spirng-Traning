package com.cydeo.casefactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimentions dementions;

    public Case(String model, String manufacturer, String powerSupply, Dimentions dementions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dementions = dementions;
    }

    public abstract void pressPowerButton();
}
