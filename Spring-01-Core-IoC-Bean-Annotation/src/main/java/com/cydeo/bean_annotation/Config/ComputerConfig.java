package com.cydeo.bean_annotation.Config;

import com.cydeo.bean_annotation.CaseFactory.Case;
import com.cydeo.bean_annotation.CaseFactory.DellCase;
import com.cydeo.bean_annotation.monitorFactory.Monitor;
import com.cydeo.bean_annotation.monitorFactory.SonyMonitor;
import com.cydeo.bean_annotation.motherboardfactory.AsusMotherBoard;
import com.cydeo.bean_annotation.motherboardfactory.MotherBoard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ComputerConfig {
    @Bean(name="sony")
public Monitor MonitorSony(){
    return new SonyMonitor("25 inch Beast", "Sony", 25);
}
@Bean
@Primary
public Case caseDell(){
        return  new DellCase("220b", "Dell", "240");
}
@Bean
public MotherBoard MotherboardAsus(){
        return  new AsusMotherBoard("BJ-200","Asus",4,6,"v2.44");
}
}
