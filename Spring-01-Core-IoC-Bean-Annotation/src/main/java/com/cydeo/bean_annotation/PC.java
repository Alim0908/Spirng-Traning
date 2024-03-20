package com.cydeo.bean_annotation;

import com.cydeo.bean_annotation.CaseFactory.Case;
import com.cydeo.bean_annotation.monitorFactory.Monitor;
import com.cydeo.bean_annotation.motherboardfactory.MotherBoard;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }
    public void drawLogo(){
        monitor.drawPixelAt();
    }
}
