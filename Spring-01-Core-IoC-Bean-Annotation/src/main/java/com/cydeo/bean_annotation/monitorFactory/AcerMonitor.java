package com.cydeo.bean_annotation.monitorFactory;

public class AcerMonitor extends Monitor{
    public AcerMonitor(String model, String manufacturer, int size) {
        super(model, manufacturer, size);
    }

    @Override
    public void drawPixelAt() {
        System.out.println("Drawing pixel with Acer");

    }
}
