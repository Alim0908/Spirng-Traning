package com.cydeo.bean_annotation.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RandomConfigration {
  @Bean
    public String myString(){
      return  "Cydeo";
  }
  public Integer muInteger(){
      return 5;
  }


}
