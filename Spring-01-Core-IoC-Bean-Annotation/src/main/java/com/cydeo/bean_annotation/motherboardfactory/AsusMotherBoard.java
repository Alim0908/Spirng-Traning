package com.cydeo.bean_annotation.motherboardfactory;

public class AsusMotherBoard extends MotherBoard{

    public AsusMotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer, ramSlots, cardSlots, bios);
    }

    @Override
    public void loadProgram(String programName) {
        super.loadProgram(programName);
    }
}
