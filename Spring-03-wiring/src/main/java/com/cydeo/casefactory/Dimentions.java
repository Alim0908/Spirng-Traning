package com.cydeo.casefactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dementions {
    private int width;
    private int height;
    private int depth;
    public void presPowerbutton(){
        System.out.println("power button pressed");
    }
}
