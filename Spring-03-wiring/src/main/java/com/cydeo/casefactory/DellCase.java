package com.cydeo.casefactory;

import org.springframework.stereotype.Component;

@Component
public class DellCase extends Case {


    public DellCase(String model, String manufacturer, String powerSupply, Dimentions dementions) {
        super(model, manufacturer, powerSupply, dementions);
    }

    public void pressPowerButton() {

        System.out.println("Power button pressed");
    }
}
