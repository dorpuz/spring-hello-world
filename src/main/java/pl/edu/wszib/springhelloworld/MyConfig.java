package pl.edu.wszib.springhelloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.edu.wszib.springhelloworld.model.Ciastko;
import pl.edu.wszib.springhelloworld.model.Dziecko;

@Configuration
public class MyConfig {

    @Bean
    @Scope("prototype")
    public Ciastko ciastko(){
        return new Ciastko();
    }

   /* @Bean
    public Dziecko jas(Ciastko ciastko){
        return new Dziecko(ciastko);
    }
    @Bean
    public Dziecko malgosia(Ciastko ciastko){
        return new Dziecko(ciastko);
    }
   @Bean
   public String test(Dziecko jas, Dziecko malgosia){
       jas.ugryz();
       malgosia.ugryz();
       return "";
   }*/
   @Bean
   public Dziecko jas(){
       return new Dziecko(ciastko());
   }
    @Bean
    public Dziecko malgosia(){
        return new Dziecko(ciastko());
    }

    @Bean
    public String test(){
        jas().ugryz();
        malgosia().ugryz();
        jas().ugryz();
        malgosia().ugryz();
        return "";
    }
}
