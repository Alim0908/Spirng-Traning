package com.cydeo.bean_annotation;

import com.cydeo.bean_annotation.CaseFactory.Case;
import com.cydeo.bean_annotation.CaseFactory.DellCase;
import com.cydeo.bean_annotation.Config.ComputerConfig;
import com.cydeo.bean_annotation.Config.RandomConfigration;
import com.cydeo.bean_annotation.monitorFactory.Monitor;
import com.cydeo.bean_annotation.monitorFactory.SonyMonitor;
import com.cydeo.bean_annotation.motherboardfactory.AsusMotherBoard;
import com.cydeo.bean_annotation.motherboardfactory.MotherBoard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CompputerTest {
    public static void main(String[] args) {
        System.out.println("Creating the container");
        ApplicationContext container= new AnnotationConfigApplicationContext(ComputerConfig.class, RandomConfigration.class);

        SonyMonitor sony =container.getBean(SonyMonitor.class);

        AsusMotherBoard Asus=container.getBean(AsusMotherBoard.class);

        DellCase dell=container.getBean(DellCase.class);

PC myPc=new PC(dell, sony,Asus);
myPc.drawLogo();
dell.pressPowerButton();
Asus.loadProgram("nan");


        System.out.println("*************************");
        Monitor theMonitor=container.getBean(Monitor.class);

        Case theCase=container.getBean(Case.class);

        MotherBoard theMotherBoard =container.getBean(MotherBoard.class);

        PC myPc2=new PC(theCase,theMonitor,theMotherBoard);

        myPc2.drawLogo();

        System.out.println("**********multip*   **************");

Monitor themonitor3= container.getBean("sony",Monitor.class);
Monitor themonitor4= container.getBean(Monitor.class);





    }
}
