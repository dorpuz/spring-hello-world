package pl.edu.wszib.springhelloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("file")
@Configuration
public class FileConfig {

    @Bean
    public DataBase db (){
        return new FileDataBase();
    }
}
