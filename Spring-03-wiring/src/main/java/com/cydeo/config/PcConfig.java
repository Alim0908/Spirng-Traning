package com.cydeo.config;

import com.cydeo.casefactory.Case;
import com.cydeo.casefactory.DellCase;
import com.cydeo.casefactory.Dimentions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.*;

@Configuration
public class PcConfig {
    @Bean
    public Dimentions dimensions(){
        return new Dimentions(12,15,19);
    }
    @Bean
    public Case DellCase(Dimentions dimensions){

        return new DellCase( "2208","Dell","240",dimensions);
    };
}
