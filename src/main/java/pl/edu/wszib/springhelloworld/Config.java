package pl.edu.wszib.springhelloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

   /* private DataBase fileDataBase = new FileDataBase();
    private DataBase mapDateBase = new MapDateBase();

    private boolean isFile;

    public Config(boolean isFile){
       this.isFile = isFile;
    }
    */
   @Bean
    public Account dajKsiegowa(DataBase db){
        return new Account(db);
    }

}
