/*
package pl.edu.wszib.springhelloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import pl.edu.wszib.springhelloworld.model.Kot;
@Configuration
public class MyConf {

    @Bean("burek")
    public Kot kot1(){
        return new Kot();
    }
    @Bean
    @Primary
    public Kot kot2(){
        return new Kot();
    }
    @Bean
    public Kot kot3(){
        return new Kot();
    }
    */
/*@Bean
    public String execute(@Qualifier("burek") Kot kot){
        return "";
    }*//*

    @Bean
    public String execute(Kot kot){
        return "";
    }

}
*/
